package pl.javastart.task;

public class TicketApp {

    public static void main(String[] args) {

        Ticket ticket1 = Ticket.createTicket();
        System.out.println(ticket1.printTicketDetails());

    }
}
