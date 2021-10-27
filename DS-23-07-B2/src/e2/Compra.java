package e2;

public class Compra extends Vivienda{
    private final int Totalprize;

    public Compra( int referenceNumber,  int garageNumber, int garagePrize, int postalCode, int size, String location, int totalprize) {
        super(TIPO.COMPRAR, referenceNumber, garageNumber, garagePrize, postalCode, size, location);
        this.Totalprize = totalprize;
    }

    public int getPrize() {
        return Totalprize;
    }

    @Override
    public String PrecioTotal(int People, int Years) {
            return ((getPrize() + getGarageNumber() * getGaragePrize()) / 12 * Years) + "/mes";
    }

    @Override
    public String PrecioAjustadoANecesidad(int Garages, int People, int Years) {
        if (Garages <= getGarageNumber()) {
            return ((getPrize() + Garages * getGaragePrize()) / 12 * Years) + "/mes";
        }
        else{
            throw new IllegalArgumentException();
        }
    }

}
