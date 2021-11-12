package e2;

import java.util.Objects;

public class Vivienda  extends Idealista implements Comparable<Vivienda> {


    public enum TIPO {ALQUILAR,COMPARTIR,COMPRAR}

    private final Vivienda.TIPO type;

    private final int ReferenceNumber;
    private final int GarageNumber;
    private final int BathNumbers;
    private final int RoomsNumber;
    private final int GaragePrize;
    private final int MonthPrize;
    private final int PostalCode;
    private final float Size;
    private final Boolean ReadyToTakeUp;
    private final Boolean Elevator;
    private final String location;

    public Vivienda(TIPO tipo, int referenceNumber, int garageNumber, int bathNumbers, int roomsNumber, Boolean readyToTakeUp,
    Boolean elevator, int garagePrize, int monthPrize, int postalCode, float size, String location) {
        if (referenceNumber<0 || garageNumber <0 || bathNumbers<0 || roomsNumber<0 || garagePrize <0 || monthPrize<0 || postalCode<1 || location==null
                || size <0f){
            throw new IllegalArgumentException();
        }
        else{
            this.type = tipo;
            ReferenceNumber = referenceNumber;
            GarageNumber = garageNumber;
            BathNumbers = bathNumbers;
            RoomsNumber = roomsNumber;
            ReadyToTakeUp = readyToTakeUp;
            Elevator = elevator;
            GaragePrize = garagePrize;
            MonthPrize = monthPrize;
            PostalCode = postalCode;
            Size = size;
            this.location = location;
        }
    }

    public int getRoomsNumber() {
        return RoomsNumber;
    }

    public Boolean getReadyToTakeUp() {
        return ReadyToTakeUp;
    }

    public Boolean getElevator() {
        return Elevator;
    }

    public TIPO getType() {
        return type;
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

    public float getSize() {
        return Size;
    }

    public String getLocation() {
        return location;
    }

    public int getPrize() {
        return MonthPrize;
    }

    public int getBathNumbers() {
        return BathNumbers;
    }


    @Override
    public String toString() {
        return "Vivienda{" +
                "tipo=" + type +
                ", ReferenceNumber=" + ReferenceNumber +
                ", GarageNumber=" + GarageNumber +
                ", BathNumbers=" + BathNumbers +
                ", RoomsNumber=" + RoomsNumber +
                ", ReadyToTakeUp=" + ReadyToTakeUp +
                ", Elevator=" + Elevator +
                ", GaragePrize=" + GaragePrize +
                ", MonthPrize=" + MonthPrize +
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
        return GarageNumber == vivienda.GarageNumber && BathNumbers == vivienda.BathNumbers && RoomsNumber == vivienda.RoomsNumber && GaragePrize == vivienda.GaragePrize && MonthPrize == vivienda.MonthPrize && PostalCode == vivienda.PostalCode && Float.compare(vivienda.Size, Size) == 0 && type == vivienda.type && Objects.equals(ReadyToTakeUp, vivienda.ReadyToTakeUp) && Objects.equals(Elevator, vivienda.Elevator) && Objects.equals(location, vivienda.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, GarageNumber, BathNumbers, RoomsNumber, ReadyToTakeUp, Elevator, GaragePrize, MonthPrize, PostalCode, Size, location);
    }

    public int compareTo(Vivienda o) {
        return Integer.compare(this.getReferenceNumber(), o.getReferenceNumber());

    }

}