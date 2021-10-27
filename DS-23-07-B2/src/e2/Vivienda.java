package e2;

import java.time.Year;
import java.util.Objects;

public abstract class Vivienda {
    public enum TIPO {ALQUILAR, COMPRAR, COMPARTIR}

    private final Vivienda.TIPO tipo;

    private int ReferenceNumber;
    private int GarageNumber;
    private int GaragePrize;
    private int PostalCode;
    private int Size;
    private String location;

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


    public abstract String PrecioTotal(int People, int Years) ;

    public abstract String PrecioAjustadoANecesidad(int Garages, int People, int Years) ;
}

    public static void main(String[] args) {
        Compra casa = new Compra()
    }