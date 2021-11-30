package e2;

import java.util.ArrayList;
import java.util.List;

public class NodoBinario {
    private Projects name;
    private int peso;
    private NodoBinario nodoizq;
    private NodoBinario nododrch;

    public NodoBinario(Projects name, int peso, NodoBinario nodoizq, NodoBinario nododrch) {
        this.name = name;
        this.peso = peso;
        this.nodoizq = nodoizq;
        this.nododrch = nododrch;
    }

    public Projects getName() {
        return name;
    }

    public void setName(Projects name) {
        this.name = name;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public NodoBinario getNodoizq() {
        return nodoizq;
    }

    public void setNodoizq(NodoBinario nodoizq) {
        this.nodoizq = nodoizq;
    }

    public NodoBinario getNododrch() {
        return nododrch;
    }

    public void setNododrch(NodoBinario nododrch) {
        this.nododrch = nododrch;
    }
    private void restarhijos(NodoBinario n){
        n.getNododrch().setPeso((n.getNododrch().getPeso())-1);
        n.getNodoizq().setPeso((n.getNodoizq().getPeso())-1);
    }

    public List<NodoBinario> restar(NodoBinario n,List<NodoBinario> L) {

        if (n.getNododrch() == null && n.getNodoizq() == null ) {
            return L;
        }
        else {
            if (n.getPeso()==0){
                L.add(n);
            }
            if (n.getNodoizq() == null && n.getNododrch() != null) {
                n.getNododrch().setPeso(n.getNododrch().getPeso() - 1);
                restar(n.getNododrch(),L);
            } else if (n.getNodoizq() != null && n.getNododrch() == null) {
                n.getNodoizq().setPeso(n.getNodoizq().getPeso() - 1);
                restar(n.getNodoizq(),L);
            } else if ( n.getNodoizq().getName().getName() < (n.getNododrch().getName().getName())) {
                restarhijos(n);
                restar(n.getNodoizq(),L);
            } else if (n.getNododrch() != null && n.getNodoizq().getName().getName() > (n.getNododrch().getName().getName())) {
                restarhijos(n);
                restar(n.getNododrch(),L);
            }
        }
        return L;


    }

    @Override
    public String toString() {
        return "NodoBinario{" +
                "name=" + name + "peso="+peso ;
    }
}


