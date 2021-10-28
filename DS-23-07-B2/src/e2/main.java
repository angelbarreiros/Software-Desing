package e2;

import java.util.Collections;

public class main {
    public static void main(String[] args) {
        ComparePostalCode code = new ComparePostalCode();
        Idealista xd =new Idealista();
        Vivienda casa= new Vivienda(Vivienda.TIPO.COMPRAR,1231321,4,200,300,15446,90,"A coruña");
        Vivienda adosado= new Vivienda(Vivienda.TIPO.COMPRAR,1231321,4,200,300,15445,90,"A coruña");
        Vivienda piso= new Vivienda(Vivienda.TIPO.COMPRAR,1231321,4,200,300,15444,90,"A coruña");
        xd.add(casa);
        xd.add(adosado);
        xd.add(piso);
        Collections.sort(xd.Lista,code);
        System.out.println(xd);
    }
}
