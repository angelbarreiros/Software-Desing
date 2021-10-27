package e2;

public class Compra extends Vivienda{
    private final int prize;

    public Compra(TIPO tipo, int referenceNumber, int prize, int garageNumber, int garagePrize, int postalCode, int size, String location, int prize1) {
        super(tipo, referenceNumber, prize, garageNumber, garagePrize, postalCode, size, location);
        this.prize = prize1;
    }

    public int getPrize() {
        return prize;
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
