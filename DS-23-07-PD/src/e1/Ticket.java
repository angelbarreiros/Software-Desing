package e1;

import java.util.Objects;

public class Ticket {
  private final  Dates date;
  private final Destination destination;
  private final  Origin origin;
  private final Prize prize;
  private final Iter iter;

    public Iter getIter() {
        return iter;
    }


    public Ticket(Dates date, Destination destination, Origin origin, Prize prize) {
        this.date = date;
        this.destination = destination;
        this.origin = origin;
        this.prize = prize;
        this.iter=new Iter();

    }

    public Dates getDate() {
        return date;
    }



    public Destination getDestination() {
        return destination;
    }



    public Origin getOrigin() {
        return origin;
    }



    public Prize getPrize() {
        return prize;
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
        return "\nTicket{" +
                "date=" + date +
                ", destination=" + destination +
                ", origin=" + origin +
                ", prize=" + prize +
                '}'+'\n';
    }
}
