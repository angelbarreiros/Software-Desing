package e2;

import java.time.Year;
import java.util.Objects;

public class Vivienda {
    private final Vivienda.TIPO tipo;

    private enum TIPO {ALQUILAR, COMPRAR, COMPARTIR}

    private int ReferenceNumber;
    private int Prize;
    private int GarageNumber;
    private int GaragePrize;
    private int PostalCode;
    private int Size;
    private String location;

    public Vivienda(TIPO tipo, int referenceNumber, int prize, int garageNumber, int garagePrize, int postalCode, int size,  String location) {
        this.tipo = tipo;
        ReferenceNumber = referenceNumber;
        Prize = prize;
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

    public int getPrize() {
        return Prize;
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


    public String PrecioTotal(int People, int Years) {
        if (this.tipo == TIPO.ALQUILAR) {
            return (((getPrize() + getGarageNumber() * getGaragePrize()) / 12 * Years) / People) + "/mes";
        } else if (this.tipo == TIPO.COMPRAR) {
            return ((getPrize() + getGarageNumber() * getGaragePrize()) / 12 * Years) + "/mes";
        } else if (this.tipo == TIPO.COMPARTIR) {
            return (((getPrize() + getGarageNumber() * getGaragePrize()) / 12 * Years) / People) + "/mes";
        } else throw new IllegalArgumentException("No has seleccionado el tipo de compra");


    }

    public String PrecioAjustadoANecesidad(int Garages, int People, int Years) {
        if (this.tipo == TIPO.ALQUILAR && Garages <= getGarageNumber()) {
            return (((getPrize() + Garages * getGaragePrize()) / 12 * Years) / People) + "/mes";
        } else if (this.tipo == TIPO.COMPRAR && Garages <= getGarageNumber()) {
            return ((getPrize() + Garages * getGaragePrize()) / 12 * Years) + "/mes";
        } else if (this.tipo == TIPO.COMPARTIR && Garages <= getGarageNumber()) {
            return (((getPrize() + Garages * getGaragePrize()) / 12 * Years) / People) + "/mes";
        } else throw new IllegalArgumentException("No has seleccionado el tipo de compra");


    }

    @Override
    public String toString() {
        return "Vivienda{" +
                "tipo=" + tipo +
                ", ReferenceNumber=" + ReferenceNumber +
                ", Prize=" + Prize +
                ", GarageNumber=" + GarageNumber +
                ", GaragePrize=" + GaragePrize +
                ", PostalCode=" + PostalCode +
                ", Size=" + Size +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vivienda vivienda = (Vivienda) o;
        return ReferenceNumber == vivienda.ReferenceNumber && Prize == vivienda.Prize && GarageNumber == vivienda.GarageNumber && GaragePrize == vivienda.GaragePrize && PostalCode == vivienda.PostalCode && Size == vivienda.Size && tipo == vivienda.tipo && Objects.equals(location, vivienda.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipo, Prize, GarageNumber, GaragePrize, PostalCode, Size, location);
    }
}

