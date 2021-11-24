package e1;

import java.util.Date;
import java.util.Objects;

public class Ticket {
    private int prize;
    private String origin;
    private String destiny;
    private Date date;

    public Ticket(int prize, String origin, String destiny, Date date) {
        this.prize = prize;
        this.origin = origin;
        this.destiny = destiny;
        this.date = date;
    }

    public int getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestiny() {
        return destiny;
    }

    public void setDestiny(String destiny) {
        this.destiny = destiny;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket bllete = (Ticket) o;
        return prize == bllete.prize && Objects.equals(origin, bllete.origin) && Objects.equals(destiny, bllete.destiny) && Objects.equals(date, bllete.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prize, origin, destiny, date);
    }

    @Override
    public String toString() {
        return "Bllete{" +
                "prize=" + prize +
                ", origin='" + origin + '\'' +
                ", destiny='" + destiny + '\'' +
                ", date=" + date +
                '}';
    }
}
