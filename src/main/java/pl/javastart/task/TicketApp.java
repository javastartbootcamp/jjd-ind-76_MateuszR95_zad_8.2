package pl.javastart.task;

public class TicketApp {

    public static void main(String[] args) {

        Ticket ticket = new Ticket();
        Ticket ticket1 = ticket.createTicket();
        System.out.println(ticket1.printTicketDetails());

    }
}
