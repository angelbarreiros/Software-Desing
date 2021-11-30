package e2;

import java.util.ArrayList;
import java.util.List;

public class ArbolBinario {

    public NodoBinario add(NodoBinario izq , NodoBinario drch){
        return new NodoBinario(null,-1,izq,drch);


    }

    public static void main(String[] args) {
        NodoBinario arbol;
        Projects projectsC=new Projects('C');
        Projects projectsG=new Projects('G');
        Projects projectsA=new Projects('A');
        Projects projectsB=new Projects('B');
        Projects projectsE=new Projects('E');
        Projects projectsD=new Projects('D');
        Projects projectsF=new Projects('F');
        Projects projectsH=new Projects('H');
        Projects projectsJ=new Projects('J');
        NodoBinario nodoBinarioE=new NodoBinario(projectsE,5,null,null);
        NodoBinario nodoBinarioJ=new NodoBinario(projectsJ,4,null,null);
        NodoBinario nodoBinarioB=new NodoBinario(projectsB,2,null,nodoBinarioE);
        NodoBinario nodoBinarioD=new NodoBinario(projectsD,2,null,nodoBinarioE);
        NodoBinario nodoBinarioA=new NodoBinario(projectsA,1,nodoBinarioD,nodoBinarioB);
        NodoBinario nodoBinarioF=new NodoBinario(projectsF,2,nodoBinarioJ,nodoBinarioE);
        NodoBinario nodoBinarioH=new NodoBinario(projectsH,1,nodoBinarioJ,null);
        NodoBinario nodoBinarioG=new NodoBinario(projectsG,0,nodoBinarioH,nodoBinarioF);
        NodoBinario nodoBinarioC=new NodoBinario(projectsC,0,nodoBinarioF,nodoBinarioA);
        ArbolBinario arbolBinario=new ArbolBinario();
        arbol=arbolBinario.add(nodoBinarioG,nodoBinarioC);
        List<NodoBinario> lista=new ArrayList<>();
        lista=arbol.restar(arbol,lista);
        System.out.println("lista = " + lista);




    }
}
