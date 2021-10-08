package e4;

import java.util.Arrays;
public class Calculator {

    private final String[] operaciones=new String[80];
    private int error =0;
    private float total;

    public void cleanOperations(){
        Arrays.fill(operaciones, null);
        operaciones[0]="[STATE:";
        error =0;

    }
    private int libre(String  [] operation){
        for (int i=0;i<operation.length;i++){
            if(operaciones[i] == null){
                return i;
            }

        }
        return -1;

    }
    public void addOperation(String operations,float... values){
        int libre=libre(operaciones);
        switch (operations) {

            case "*" -> {
                operaciones[libre]="["+operations+"] ";
                if (values.length == 2 ) {
                    error++;
                    if (error >1){
                        total =total*values[0];
                        operaciones[libre+1]=""+values[0];
                    }
                    else{
                        total=values[0]*values[1];
                        operaciones[libre+1]=values[0]+"_"+values[1];
                    }
                }
                else {
                    if (error ==0){
                        throw new IllegalArgumentException();
                    }
                    total=values[0]*total;
                    operaciones[libre+1]=""+values[0];
                }
            }
            case "+" -> {
                operaciones[libre]="["+operations+"] ";
                if (values.length == 2 ) {
                    error++;
                    if (error >1){
                        total =total+values[0];
                        operaciones[libre+1]=""+values[0];
                    }
                    else{
                        total=values[0]+values[1];
                        operaciones[libre+1]=values[0]+"_"+values[1];
                    }
                } else {
                    if (error ==0){
                        throw new IllegalArgumentException();
                    }

                    total=values[0]+total;
                    operaciones[libre+1]=""+values[0];
                }
            }
            case "/" -> {
                operaciones[libre]="["+operations+"] ";
                if (values.length == 2 ) {

                    error++;
                    if (error >1){
                        total =total/values[0];
                        operaciones[libre+1]=""+values[0];
                    }
                    if (values[1]==0){
                        error =-1;
                    }
                    else{
                        total=values[0]/values[1];
                        operaciones[libre+1]=values[0]+"_"+values[1];

                    }

                } else {

                    if (values[0]==0){
                        error =-1;
                    }
                    if (error ==0){
                        throw new IllegalArgumentException();
                    }
                    total=total/(values[0]);
                    operaciones[libre+1]=""+values[0];
                }
            }
            case "-" -> {
                operaciones[libre]="["+operations+"] ";
                if (values.length == 2 ) {
                    error++;
                    if (error >1){
                        total =total-values[0];
                        operaciones[libre+1]=""+values[0];
                    }
                    else{
                        total=values[0]-values[1];
                        operaciones[libre+1]=values[0]+"_"+values[1];
                    }
                }
                else {
                    if (error ==0){
                        throw new IllegalArgumentException();
                    }
                    total=total-values[0];
                    operaciones[libre+1]=""+values[0];
                }
            }
            default -> throw new IllegalArgumentException();
        }
    }
    public float executeOperations(){
        if (error ==-1){
            cleanOperations();
            throw new ArithmeticException();
        }
        cleanOperations();
        return total;
    }

    @Override
    public String toString() {
        int i=0;
        StringBuilder suma= new StringBuilder();
        String llegada;
        while(operaciones[i]!=null){
            suma.append(operaciones[i]);
            i++;
        }
        llegada= suma.toString().replaceAll("\\s+","");
        return llegada+"]";
    }

}



