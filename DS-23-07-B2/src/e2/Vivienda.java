package e2;

import java.util.Objects;

public class Vivienda  extends Idealista implements Comparable<Vivienda> {


    public enum TIPO {ALQUILAR  , COMPARTIR,COMPRAR}

    private final Vivienda.TIPO tipo;

    private final int ReferenceNumber;
    private final int GarageNumber;
    private final int GaragePrize;
    private final int MonthPrize;
    private final int PostalCode;
    private final int Size;
    private final String location;

    public Vivienda(TIPO tipo, int referenceNumber, int garageNumber, int garagePrize, int prize, int postalCode, int size, String location) {
        this.tipo = tipo;
        ReferenceNumber = referenceNumber;
        GarageNumber = garageNumber;
        GaragePrize = garagePrize;
        this.MonthPrize = prize;
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

    public int getPrize() {
        return MonthPrize;
    }


    @Override
    public String toString() {
        return "Vivienda{" +
                "tipo=" + tipo +
                ", ReferenceNumber=" + ReferenceNumber +
                ", GarageNumber=" + GarageNumber +
                ", GaragePrize=" + GaragePrize +
                ", MonthPrize=" + MonthPrize +
                ", PostalCode=" + PostalCode +
                ", Size=" + Size +
                ", location='" + location + '\'' +
                "}\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vivienda vivienda = (Vivienda) o;
        return GarageNumber == vivienda.GarageNumber && GaragePrize == vivienda.GaragePrize && MonthPrize == vivienda.MonthPrize && PostalCode == vivienda.PostalCode && Size == vivienda.Size && tipo == vivienda.tipo && Objects.equals(location, vivienda.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipo, GarageNumber, GaragePrize, MonthPrize, PostalCode, Size, location);
    }

    public int compareTo(Vivienda o) {
        return Integer.compare(this.getReferenceNumber(), o.getReferenceNumber());

    }

}