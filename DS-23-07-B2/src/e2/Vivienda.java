package e2;

import java.time.Year;
import java.util.Objects;

public abstract class Vivienda {
    public enum TIPO {ALQUILAR, COMPRAR, COMPARTIR}

    private final Vivienda.TIPO tipo;

    private final  int  ReferenceNumber;
    private final int GarageNumber;
    private final int GaragePrize;
    private final int PostalCode;
    private  final int Size;
    private final String location;

    public Vivienda(TIPO tipo, int referenceNumber, int garageNumber, int garagePrize, int postalCode, int size, String location) {
        this.tipo = tipo;
        ReferenceNumber = referenceNumber;
        GarageNumber = garageNumber;
        GaragePrize = garagePrize;
        PostalCode = postalCode;
        Size = size;
        this.location = location;
    }

    public TIPO getTipo() {
        return tipo;
    }

    public int getReferenceNumber() {
        return ReferenceNumber;
    }


    public int getGarageNumber() {
        return GarageNumber;
    }

    public int getGaragePrize() {
        return GaragePrize;
    }

    public int getPostalCode() {
        return PostalCode;
    }

    public int getSize() {
        return Size;
    }

    public String getLocation() {
        return location;
    }


    public abstract String PrecioTotal(int People, int Years);

    public abstract String PrecioAjustadoANecesidad(int Garages, int People, int Years);


    public static void main(String[] args) {
        Compra casa = new Compra(381762633,4,20000,15660,500,"A Coruña",1000000);
    }
}