package e2;

public class Alquiler extends Vivienda{
    private final int MonthPrize;

    public Alquiler(int referenceNumber, int garageNumber, int garagePrize, int postalCode, int size, String location, int monthPrize) {
        super(TIPO.ALQUILAR, referenceNumber, garageNumber, garagePrize, postalCode, size, location);
        MonthPrize = monthPrize;
    }

    public int getMonthPrize() {
        return MonthPrize;
    }

    @Override
    public String PrecioTotal(int People, int Years) {
        if (People>=1){
            return (((getMonthPrize() + getGarageNumber() * getGaragePrize()))) + "/mes";
        }
        else throw new IllegalArgumentException();
    }

    @Override
    public String PrecioAjustadoANecesidad(int Garages, int People, int Years) {
        if (Garages <= getGarageNumber() && People>=1) {
            return ((getMonthPrize() + Garages * getGaragePrize())) + "/mes";
        }
        else{
            throw new IllegalArgumentException();
        }
    }
}
