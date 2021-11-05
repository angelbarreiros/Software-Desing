package e3;

import java.util.ArrayList;
import java.util.List;
public class Matriz implements  NetworkManager{
    final int colum=1000;
    final int fila=1000;
    private final String[][] matriz = new String[fila][colum];


    @Override
    public void addUser(String user, List<TopicOfInterest> topicOfInterest) {
        if (topicOfInterest==null){
            throw new IllegalArgumentException();
        }
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
        if(!revisar){           //2 ifs para que no inserte en posiciones que no existen
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
        if (topicofinterest==null){
            throw  new IllegalArgumentException();
        }
        else if(user==null){
            throw new IllegalArgumentException();
        }
        boolean revisar=false,revisar2=false;
        int j=0;
        for (int i=0;i<fila;i++){
            if (matriz[i][0]!=null){
                if(matriz[i][0].equals(user)){
                    j=i;
                    revisar2 = true;
                    break;
                }


            }

        }
        if (!revisar2){
            throw new IllegalArgumentException();
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
        if (user==null){
            throw new IllegalArgumentException();
        }
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
        if (user==null){
            throw new IllegalArgumentException();
        }
        else if (topicOfInterest==null){
            throw  new IllegalArgumentException();
        }
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
                        x=z-1;                                        //CAMBIE LA Z POR LA Y , A VER SI SIGUE FUNCIONANDO
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
        if (user==null){
            throw  new IllegalArgumentException();
        }
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
