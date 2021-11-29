package e1;

import java.util.Objects;

public class Ticket {
  private final Properties_Dates date;
  private final Properties_Destination destination;
  private final Properties_Origin origin;
  private final Properties_Prize prize;
  private final Ticket_Iter iter;

    public Ticket_Iter getIter() {
        return iter;
    }


    public Ticket(Properties_Dates date, Properties_Destination destination, Properties_Origin origin, Properties_Prize prize) {
        this.date = date;
        this.destination = destination;
        this.origin = origin;
        this.prize = prize;
        this.iter=new Ticket_Iter();

    }

    public Properties_Dates getDate() {
        return date;
    }



    public Properties_Destination getDestination() {
        return destination;
    }



    public Properties_Origin getOrigin() {
        return origin;
    }



    public Properties_Prize getPrize() {
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
