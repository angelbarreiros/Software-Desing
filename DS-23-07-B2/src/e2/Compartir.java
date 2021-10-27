package e2;

public class Compartir extends Vivienda {
    private final int MonthSharedPrize;

    public Compartir(int referenceNumber, int garageNumber, int garagePrize, int postalCode, int size, String location, int monthSharePrize) {
        super(TIPO.COMPARTIR, referenceNumber,  garageNumber, garagePrize, postalCode, size, location);
        MonthSharedPrize = monthSharePrize;
    }

    public int getMonthSharedPrize() {
        return MonthSharedPrize;
    }

    @Override
    public String PrecioTotal(int People, int Years) {
        if (People>=1){
            return (((getMonthSharedPrize() + getGarageNumber() * getGaragePrize())))/People + "/mes";
        }
        else throw new IllegalArgumentException();
    }


    @Override
    public String PrecioAjustadoANecesidad(int Garages, int People, int Years) {

        if (Garages <= getGarageNumber() && People>=1) {
            return ((getMonthSharedPrize() + Garages * getGaragePrize()))/People + "/mes";
        }
        else{
            throw new IllegalArgumentException();
        }
    }
}
