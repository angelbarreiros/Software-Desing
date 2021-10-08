package e3;

import java.util.Objects;

public class Melody {
        enum Notes { DO,RE ,MI ,FA ,SOL ,LA ,SI }
        enum Accidentals {NATURAL, SHARP, FLAT}

        private final String[] Notas =new  String[80];
        private final String[] Alteraciones =new  String[80];
        private final float [] Tiempos =new  float[80];
        private final String [] Nota_Alteraciones_Tiempo =new String [80];
        private Boolean iguales(Notes note1,Accidentals accidental1,Notes note2,Accidentals accidental2){
            if (note1==Notes.DO && note2==Notes.RE && accidental1==Accidentals.SHARP && accidental2==Accidentals.FLAT){
                return  true;
            }
            if (note1==Notes.RE && note2==Notes.MI && accidental1==Accidentals.SHARP && accidental2==Accidentals.FLAT){
                return  true;
            }
            if (note1==Notes.MI && note2==Notes.FA && accidental1==Accidentals.NATURAL && accidental2==Accidentals.FLAT){
                return  true;
            }
            if (note1==Notes.MI && note2==Notes.FA && accidental1==Accidentals.SHARP && accidental2==Accidentals.NATURAL){
                return  true;
            }
            if (note1==Notes.FA && note2==Notes.SOL && accidental1==Accidentals.SHARP && accidental2==Accidentals.FLAT){
                return  true;
            }
            if (note1==Notes.SOL && note2==Notes.LA && accidental1==Accidentals.SHARP && accidental2==Accidentals.FLAT){
                return  true;
            }
            if (note1==Notes.LA && note2==Notes.SI && accidental1==Accidentals.SHARP && accidental2==Accidentals.FLAT){
                return  true;
            }
            if(note1 == Notes.SI && note2 == Notes.DO && accidental1 == Accidentals.SHARP && accidental2 == Accidentals.NATURAL){
                return true;
            }
            if(note1 == Notes.SI && note2 == Notes.DO && accidental1 == Accidentals.NATURAL && accidental2 == Accidentals.FLAT){
                return true;
            }



            if (note1==Notes.RE && note2==Notes.DO && accidental1==Accidentals.FLAT && accidental2==Accidentals.SHARP){
                return  true;
            }
            if (note1==Notes.MI && note2==Notes.RE && accidental1==Accidentals.FLAT && accidental2==Accidentals.SHARP){
                return  true;
            }
            if (note1==Notes.FA && note2==Notes.MI && accidental1==Accidentals.NATURAL && accidental2==Accidentals.SHARP){
                return  true;
            }
            if (note1==Notes.SOL && note2==Notes.FA && accidental1==Accidentals.FLAT && accidental2==Accidentals.SHARP){
                return  true;
            }
            if (note1==Notes.LA && note2==Notes.SOL && accidental1==Accidentals.FLAT && accidental2==Accidentals.SHARP){
                return  true;
            }
            if (note1==Notes.SI && note2==Notes.LA && accidental1==Accidentals.FLAT && accidental2==Accidentals.SHARP){
                return  true;
            }
            if (note1==Notes.DO && note2==Notes.SI && accidental1==Accidentals.FLAT && accidental2==Accidentals.NATURAL){
                return  true;
            }
            if(note1 == Notes.DO && note2 == Notes.SI && accidental1 == Accidentals.NATURAL && accidental2 == Accidentals.SHARP){
                return true;
            }



            if (note1==Notes.DO && note2==Notes.DO && accidental1==Accidentals.NATURAL && accidental2==Accidentals.NATURAL){
                return  true;
            }
            if (note1==Notes.DO && note2==Notes.DO && accidental1==Accidentals.SHARP && accidental2==Accidentals.SHARP){
                return  true;
            }
            if (note1 == Notes.DO && note2 == Notes.DO && accidental1 == Accidentals.FLAT && accidental2 == Accidentals.FLAT){
                return true;
            }
            if (note1==Notes.RE && note2==Notes.RE && accidental1==Accidentals.SHARP && accidental2==Accidentals.SHARP){
                return  true;
            }
            if (note1==Notes.RE && note2==Notes.RE && accidental1==Accidentals.NATURAL && accidental2==Accidentals.NATURAL){
                return  true;
            }
            if (note1==Notes.RE && note2==Notes.RE && accidental1==Accidentals.FLAT && accidental2==Accidentals.FLAT){
                return  true;
            }
            if (note1==Notes.MI && note2==Notes.MI && accidental1==Accidentals.SHARP && accidental2==Accidentals.SHARP){
                return  true;
            }
            if (note1==Notes.MI && note2==Notes.MI && accidental1==Accidentals.FLAT && accidental2==Accidentals.FLAT){
                return  true;
            }
            if (note1==Notes.MI && note2==Notes.MI && accidental1==Accidentals.NATURAL && accidental2==Accidentals.NATURAL){
                return  true;
            }
            if (note1 == Notes.FA && note2 == Notes.FA && accidental1 == Accidentals.SHARP && accidental2 == Accidentals.SHARP) {
                return true;
            }
            if (note1==Notes.FA && note2==Notes.FA && accidental1==Accidentals.FLAT && accidental2==Accidentals.FLAT){
                return  true;
            }
            if (note1==Notes.FA && note2==Notes.FA && accidental1==Accidentals.NATURAL && accidental2==Accidentals.NATURAL){
                return  true;
            }
            if (note1==Notes.SOL && note2==Notes.SOL && accidental1==Accidentals.SHARP && accidental2==Accidentals.SHARP){
                return  true;
            }
            if (note1==Notes.SOL && note2==Notes.SOL && accidental1==Accidentals.FLAT && accidental2==Accidentals.FLAT){
                return  true;
            }
            if (note1==Notes.SOL && note2==Notes.SOL && accidental1==Accidentals.NATURAL && accidental2==Accidentals.NATURAL){
                return  true;
            }
            if (note1==Notes.LA && note2==Notes.LA && accidental1==Accidentals.SHARP && accidental2==Accidentals.SHARP){
                return  true;
            }
            if (note1 == Notes.LA && note2 == Notes.LA && accidental1 == Accidentals.FLAT && accidental2 == Accidentals.FLAT){
            return true;
            }
            if (note1==Notes.LA && note2==Notes.LA && accidental1==Accidentals.NATURAL && accidental2==Accidentals.NATURAL){
                return  true;
            }
            if (note1==Notes.SI && note2==Notes.SI && accidental1==Accidentals.SHARP && accidental2==Accidentals.SHARP){
                return  true;
            }
            if (note1==Notes.SI && note2==Notes.SI && accidental1==Accidentals.FLAT && accidental2==Accidentals.FLAT){
                return  true;
            }
            return note1 == Notes.SI && note2 == Notes.SI && accidental1 == Accidentals.NATURAL && accidental2 == Accidentals.NATURAL;


        }

        public void addNote(Notes note, Accidentals accidental, float tiempo) {
            if (note == null){
                throw new IllegalArgumentException();
            }
            else  if (accidental== null){
                throw new IllegalArgumentException();
            }
            else if(tiempo==0f){
                throw new IllegalArgumentException();
            }

            for (int i = 0; i< Notas.length; i++){
                if(Notas[i]==null){
                    Alteraciones[i]=accidental.toString();
                    Notas[i]=note.toString();
                    Tiempos[i]=tiempo;
                    if (Objects.equals(accidental.toString(), "SHARP")){
                        Nota_Alteraciones_Tiempo[i]=note+"#"+"("+tiempo+")"+" ";
                    }
                    else if (Objects.equals(accidental.toString(), "FLAT")){
                        Nota_Alteraciones_Tiempo[i]=note+"b"+"("+tiempo+")"+" ";
                    }
                    else if (Objects.equals(accidental.toString(), "NATURAL")){
                        Nota_Alteraciones_Tiempo[i]=note+"("+tiempo+")"+" ";
                    }
                    break;
                }
            }
        }

        public Notes getNote(int posicion) {
            if (Notas[posicion]==null){
                throw new IllegalArgumentException();
            }
            return Notes.valueOf(Notas[posicion]);
        }

        public Accidentals getAccidental(int posicion) {
            if (Notas[posicion]==null){
                throw new IllegalArgumentException();
            }
            return Accidentals.valueOf(Alteraciones[posicion]);
        }

        public float getTime(int posicion) {
            if (Notas[posicion]==null){
                throw new IllegalArgumentException();
            }
            return Tiempos[posicion];
        }

        public int size() {
            for (int i = 0; i< Notas.length; i++) {
                if (Notas[i] == null) {
                    return i;
                }
            }
            return  0;
        }

        public float getDuration(){
            float suma = 0;
            for (int i = 0; i< Notas.length; i++) {
                suma = suma + Tiempos[i];
            }
            return suma;
        }

        @Override
        public String toString() {
            StringBuilder S= new StringBuilder();
            for (int i=0;i<size();i++){
                S.append(Nota_Alteraciones_Tiempo[i]);
            }
            return S.toString().trim();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!(this.size()==((Melody) o).size())){
                return false;
            }
            for (int i=0;i< this.size();i++){
                if(!(this.getTime(i)==((Melody) o).getTime(i))){
                    return false;
                }
            }
            for (int i=0;i< this.size();i++){
                 if (!(iguales(this.getNote(i), this.getAccidental(i), ((Melody) o).getNote(i), ((Melody) o).getAccidental(i)))){
                     return false;
                 }
            }
            return true;


        }

        @Override
        public int hashCode() {
            int total=31;
            for (int i =0;i<this.size();i++){
                if (this.getNote(i)==Notes.FA && this.getAccidental(i)==Accidentals.NATURAL || this.getNote(i)==Notes.MI && this.getAccidental(i)==Accidentals.SHARP){
                    total+=31*Notes.FA.hashCode()+31*Accidentals.NATURAL.hashCode()+31* Float.hashCode(getTime(i));
                }
                if (this.getNote(i)==Notes.FA && this.getAccidental(i)==Accidentals.SHARP || this.getNote(i)==Notes.SOL && this.getAccidental(i)==Accidentals.FLAT ){
                    total+= 31*Notes.FA.hashCode() + 31*Accidentals.SHARP.hashCode()+31* Float.hashCode(getTime(i));
                }
                if (this.getNote(i)==Notes.SOL && this.getAccidental(i)==Accidentals.NATURAL ){
                    total+=31*Notes.SOL.hashCode() + 31*Accidentals.NATURAL.hashCode()+31* Float.hashCode(getTime(i));
                }
                if (this.getNote(i)==Notes.SOL && this.getAccidental(i)==Accidentals.SHARP || this.getNote(i)==Notes.LA && this.getAccidental(i)==Accidentals.FLAT ){
                    total+= 31*Notes.SOL.hashCode() + 31*Accidentals.SHARP.hashCode()+31* Float.hashCode(getTime(i));
                }
                if (this.getNote(i)==Notes.LA && this.getAccidental(i)==Accidentals.NATURAL ){
                    total+=31*Notes.LA.hashCode() + 31*Accidentals.NATURAL.hashCode()+31* Float.hashCode(getTime(i));
                }
                if (this.getNote(i)==Notes.LA && this.getAccidental(i)==Accidentals.SHARP || this.getNote(i)==Notes.SI && this.getAccidental(i)==Accidentals.FLAT ){
                    total+= 31*Notes.LA.hashCode() + 31*Accidentals.SHARP.hashCode()+31* Float.hashCode(getTime(i));
                }
                if (this.getNote(i)==Notes.SI && this.getAccidental(i)==Accidentals.SHARP || this.getNote(i)==Notes.DO && this.getAccidental(i)==Accidentals.NATURAL ){
                    total+= 31*Notes.SI.hashCode() + 31*Accidentals.SHARP.hashCode()+31* Float.hashCode(getTime(i));
                }
                if (this.getNote(i)==Notes.DO && this.getAccidental(i)==Accidentals.NATURAL || this.getNote(i)==Notes.SI && this.getAccidental(i)==Accidentals.SHARP ){
                    total+= 31*Notes.DO.hashCode() + 31*Accidentals.NATURAL.hashCode()+31* Float.hashCode(getTime(i));
                }
                if (this.getNote(i)==Notes.DO && this.getAccidental(i)==Accidentals.SHARP || this.getNote(i)==Notes.RE && this.getAccidental(i)==Accidentals.FLAT ){
                    total+= 31*Notes.DO.hashCode() + 31*Accidentals.SHARP.hashCode()+31* Float.hashCode(getTime(i));
                }
                if (this.getNote(i)==Notes.RE && this.getAccidental(i)==Accidentals.NATURAL ){
                    total+=31*Notes.RE.hashCode() + 31*Accidentals.NATURAL.hashCode()+31* Float.hashCode(getTime(i));
                }
                if (this.getNote(i)==Notes.RE && this.getAccidental(i)==Accidentals.SHARP || this.getNote(i)==Notes.MI && this.getAccidental(i)==Accidentals.FLAT ){
                    total+= 31*Notes.RE.hashCode() + 31*Accidentals.SHARP.hashCode()+31* Float.hashCode(getTime(i));
                }
                if (this.getNote(i)==Notes.MI && this.getAccidental(i)==Accidentals.NATURAL || this.getNote(i)==Notes.FA && this.getAccidental(i)==Accidentals.FLAT ){
                    total+= 31*Notes.MI.hashCode()+31*Accidentals.NATURAL.hashCode()+31* Float.hashCode(getTime(i));
                }
            }
        return total;
        }

    }


