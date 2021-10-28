package e2;

import java.util.Collections;

public class main {
    public static void main(String[] args) {
        CompareTipo code = new CompareTipo();
        ComparatorLocation postalCode=new ComparatorLocation();
        Idealista xd =new Idealista();
        Vivienda casa= new Vivienda(Vivienda.TIPO.COMPRAR,1231321,4,200,300,15446,90,"Boruña");
        Vivienda adosado= new Vivienda(Vivienda.TIPO.ALQUILAR,1231321,4,200,300,15445,90,"Aoruña");
        Vivienda piso= new Vivienda(Vivienda.TIPO.COMPARTIR,1231321,4,200,300,15444,90,"Coruña");
        xd.add(casa);
        xd.add(adosado);
        xd.add(piso);
        Collections.sort(xd.Lista,postalCode);

        System.out.println(xd);
    }
}
