package e3;

import java.util.ArrayList;
import java.util.List;
public class Matriz implements  NetworkManager{
    final int colum=1000;
    final int fila=1000;
    private final String[][] matriz = new String[fila][colum];


    @Override
    public void addUser(String user, List<TopicOfInterest> topicOfInterest) {
        int i=0, z = 0, y=0;
        boolean revisar=false;
        while(matriz[i][0]!=null){
            if (i==fila-1){

                revisar=true;
                break;
            }
            i++;
            z=i;
        }
        if(!revisar){
            matriz[i][0]=user;
        }
        if(!revisar){
            for (TopicOfInterest ofInterest : topicOfInterest) {
                y++;
                matriz[z][y] = ofInterest.toString();
            }
        }

    }

    @Override
    public void addInterest(String user, TopicOfInterest topicofinterest) {
        boolean revisar=false;
        int j=0;
        for (int i=0;i<fila;i++){
            if (matriz[i][0]!=null){
                if(matriz[i][0].equals(user)){
                    j=i;
                    break;
                }


            }
            else{
                throw new IllegalArgumentException("No existe ese usuario");
            }
        }
        int i=0;
        while(matriz[j][i]!=null){
            if (i==colum-1){
                revisar =true;
                break;
            }

            i++;
        }
        if(!revisar) matriz[j][i]=topicofinterest.toString();

    }


    @Override
    public void removeUser(String user) {
        int j=0;
        boolean revisar=false;
        for (int i=0;i<fila;i++){
            if (matriz[i][0]!=null){
                if(matriz[i][0].equals(user)) {
                    j = i;
                    revisar = true;
                    break;
                }
            }
        }
        if (revisar){
            for (int i=0;i<colum;i++){
                matriz[j][i]=null;
            }
        }

    }

    @Override
    public void removeInterest(String user, TopicOfInterest topicOfInterest) {
        int j=0;
        int x=0;
        int z=1;
        boolean revisar=false,revisar2=false;
        for (int i=0;i<fila;i++){
            if (matriz[i][0]!=null){
                if(matriz[i][0].equals(user)){
                    j=i;
                    revisar=true;
                    break;
                }

            }
        }
        if (revisar){
            for (int y=1;y<colum;y++){
                z++;
                if (matriz[j][y]!=null){
                    if(matriz[j][y].equals(topicOfInterest.toString())){
                        x=z;                                        //CAMBIE LA Z POR LA Y , A VER SI SIGUE FUNCIONANDO
                        revisar2=true;
                        break;
                    }
                }
            }
        }
        if (revisar && revisar2){
            matriz[j][x]=null;
        }

    }

    @Override
    public List<String> getUsers(){
        List<String> usuarios=new ArrayList<>();
        for (int i =0;i<fila;i++){
            if (matriz[i][0]!=null){
                usuarios.add(matriz[i][0]);
            }
        }
        return usuarios;
    }

    @Override
    public List<TopicOfInterest> getInterest() {

        List<TopicOfInterest> topic=new ArrayList<>();
        for (int i = 0; i < fila; i++) {
            for (int j = 1; j < colum; j++) {
                if (matriz[i][j] != null) {
                    TopicOfInterest topicOfInteresta= new TopicOfInterest(matriz[i][j]);
                    topic.add(topicOfInteresta);
                }
            }

        }
        return  topic;
    }

    @Override
    public List<TopicOfInterest> getInterestUser(String user) {
        List<TopicOfInterest> topic=new ArrayList<>();


        int j=0;
        boolean revisar=false;
        for (int i=0;i<fila;i++){
            if (matriz[i][0]!=null){
                if(matriz[i][0].equals(user)) {
                    j = i;
                    revisar = true;
                    break;
                }
            }
        }
        if (revisar){
            for (int i = 1; i < colum; i++) {
                if (matriz[j][i] != null) {
                    TopicOfInterest topicOfInteresta= new TopicOfInterest(matriz[j][i]);
                    topic.add(topicOfInteresta);
                }
            }

        }
        return topic;
    }


}
