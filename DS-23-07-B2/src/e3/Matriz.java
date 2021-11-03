package e3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
public class Matriz implements  NetworkManager{
    private final String[][] matriz = new String[128][6];

    @Override
    public void addUser(String user, List<TopicOfInterest> topicOfInterest) {
        int i=0;
        while(matriz[i][0]!=null){
            i++;
        }
        matriz[i][0]=user;

    }

    @Override
    public void addInterest(String user, TopicOfInterest topicofinterest) {
        boolean revisar=false;
        int j=0;
        for (int i=0;i<128;i++){
            if (matriz[i][0]!=null){
                if(matriz[i][0].equals(user)){
                    j=i;
                    break;
                }

            }
        }
        int i=0;
        while(matriz[j][i]!=null){
            if (i==5){
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
        for (int i=0;i<128;i++){
            if (matriz[i][0]!=null){
                if(matriz[i][0].equals(user)) {
                    j = i;
                    revisar = true;
                    break;
                }
            }
        }
        if (revisar){
            for (int i=0;i<6;i++){
                matriz[j][i]=null;
            }
        }

    }

    @Override
    public void removeInterest(String user, TopicOfInterest topicOfInterest) {
        int j=0;
        int x=0;
        boolean revisar=false,revisar2=false;
        for (int i=0;i<128;i++){
            if (matriz[i][0]!=null){
                if(matriz[i][0].equals(user)){
                    j=i;
                    revisar=true;
                    break;
                }

            }
        }
        if (revisar){
            for (int y=1;y<6;y++){
                if (matriz[j][y]!=null){
                    if(matriz[j][y].equals(topicOfInterest.toString())){
                        x=y;
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
        for (int i =0;i<128;i++){
            if (matriz[i][0]!=null){
                usuarios.add(matriz[i][0]);
            }
        }
        return usuarios;
    }

    @Override
    public List<TopicOfInterest> getInterest() {
        List<TopicOfInterest> topic=new ArrayList<>();
        TopicOfInterest topicOfInteresta= new TopicOfInterest(TopicOfInterest.TOPIC.a);
        TopicOfInterest topicOfInterestb= new TopicOfInterest(TopicOfInterest.TOPIC.b);
        TopicOfInterest topicOfInterestd= new TopicOfInterest(TopicOfInterest.TOPIC.d);
        TopicOfInterest topicOfIntereste= new TopicOfInterest(TopicOfInterest.TOPIC.e);
        TopicOfInterest topicOfInterestc= new TopicOfInterest(TopicOfInterest.TOPIC.c);
        for (int i = 0; i < 128; i++) {
            for (int j = 1; j < 6; j++) {
                if (matriz[i][j] != null) {
                    switch (matriz[i][j]) {
                        case "a" -> {

                            topic.add(topicOfInteresta);
                        }
                        case "b" -> {

                            topic.add(topicOfInterestb);
                        }
                        case "c" -> {

                            topic.add(topicOfInterestc);
                        }
                        case "d" -> {

                            topic.add(topicOfInterestd);
                        }
                        case "e" -> {

                            topic.add(topicOfIntereste);
                        }
                    }
                }
            }

        }
        return  topic;
    }

    @Override
    public List<TopicOfInterest> getInterestUser(String user) {
        List<TopicOfInterest> topic=new ArrayList<>();
        TopicOfInterest topicOfInteresta= new TopicOfInterest(TopicOfInterest.TOPIC.a);
        TopicOfInterest topicOfInterestb= new TopicOfInterest(TopicOfInterest.TOPIC.b);
        TopicOfInterest topicOfInterestd= new TopicOfInterest(TopicOfInterest.TOPIC.d);
        TopicOfInterest topicOfIntereste= new TopicOfInterest(TopicOfInterest.TOPIC.e);
        TopicOfInterest topicOfInterestc= new TopicOfInterest(TopicOfInterest.TOPIC.c);

        int j=0;
        boolean revisar=false;
        for (int i=0;i<128;i++){
            if (matriz[i][0]!=null){
                if(matriz[i][0].equals(user)) {
                    j = i;
                    revisar = true;
                    break;
                }
            }
        }
        if (revisar){
            for (int i = 1; i < 6; i++) {
                if (matriz[j][i] != null) {
                    switch (matriz[j][i]) {
                        case "a" -> {

                            topic.add(topicOfInteresta);
                        }
                        case "b" -> {

                            topic.add(topicOfInterestb);
                        }
                        case "c" -> {

                            topic.add(topicOfInterestc);
                        }
                        case "d" -> {

                            topic.add(topicOfInterestd);
                        }
                        case "e" -> {

                            topic.add(topicOfIntereste);
                        }
                    }
                }
            }

        }
        return topic;
    }




    public static void main(String[] args) {
        Matriz matriz1=new Matriz();
        List<String> lista;
        TopicOfInterest topica=new TopicOfInterest(TopicOfInterest.TOPIC.a);
        TopicOfInterest topicc=new TopicOfInterest(TopicOfInterest.TOPIC.c);
        TopicOfInterest topicd=new TopicOfInterest(TopicOfInterest.TOPIC.d);
        TopicOfInterest topice=new TopicOfInterest(TopicOfInterest.TOPIC.e);
        TopicOfInterest topicb=new TopicOfInterest(TopicOfInterest.TOPIC.b);
        matriz1.addUser("pepe",null);
        matriz1.addUser("angel",null);
        matriz1.addUser("maria",null);
        matriz1.addUser("jesus",null);
        matriz1.addUser("leo",null);
        matriz1.addUser("jorge",null);

        matriz1.removeUser("jorge");
        lista=matriz1.getUsers();

        System.out.println("topic = " + lista);
    }

}
