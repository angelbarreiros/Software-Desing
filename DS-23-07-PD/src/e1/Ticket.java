package e1;

import java.util.Date;
import java.util.Objects;

public class Ticket {
  private Dates date;
  private Destination destination;
  private Origin origin;
  private Prize prize;
  private int iter=0;

    public int getIter() {
        return iter;
    }

    public void setIter(int iter) {
        this.iter = iter;
    }

    public Ticket(Dates date, Destination destination, Origin origin, Prize prize) {
        this.date = date;
        this.destination = destination;
        this.origin = origin;
        this.prize = prize;
    }

    public Dates getDate() {
        return date;
    }

    public void setDate(Dates date) {
        this.date = date;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public Origin getOrigin() {
        return origin;
    }

    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

    public Prize getPrize() {
        return prize;
    }

    public void setPrize(Prize prize) {
        this.prize = prize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return Objects.equals(date, ticket.date) && Objects.equals(destination, ticket.destination) && Objects.equals(origin, ticket.origin) && Objects.equals(prize, ticket.prize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, destination, origin, prize);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "date=" + date +
                ", destination=" + destination +
                ", origin=" + origin +
                ", prize=" + prize +
                '}';
    }
}
