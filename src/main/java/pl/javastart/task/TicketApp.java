package pl.javastart.task;

public class TicketApp {

    public static void main(String[] args) {

        Ticket online = Ticket.createTicket();
        Ticket standard = Ticket.createTicket();
        Ticket gift = Ticket.createTicket();
        System.out.println(online.printTicketDetails());
        System.out.println(standard.printTicketDetails());
        System.out.println(gift.printTicketDetails());
    }
}
