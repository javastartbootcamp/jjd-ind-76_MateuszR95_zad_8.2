package pl.javastart.task;

import java.util.Scanner;

public class Ticket {

    private String event;
    private Address address;
    private String type;
    private static double basicPrice;
    private static double discount;
    private static int ticketID = 1;
    private int id;

    public Ticket(String event, Address address, String type, double basicPrice, double discount) {
        this.event = event;
        this.address = address;
        this.type = type;
        Ticket.basicPrice = basicPrice;
        Ticket.discount = discount;
        id = ticketID;
        ticketID++;
    }

    public static Ticket createTicket() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wydarzenie, na które chcesz kupić bilet");
        String event = scanner.nextLine();
        System.out.println("Podaj miasto wydarzenia");
        String city = scanner.nextLine();
        System.out.println("Podaj ulicę wydarzenia");
        String street = scanner.nextLine();
        System.out.println("Podaj nr budynku");
        String houseNumber = scanner.nextLine();
        System.out.println("Podaj nr lokalu");
        String flatNumber = scanner.nextLine();
        Address address = new Address(city, street, houseNumber, flatNumber);
        System.out.println("Podaj typ biletu (Online, Standard lub Gift)");
        String type = scanner.nextLine();

        if (type.equalsIgnoreCase("Online")) {
            basicPrice = 100;
            discount = 0.05;
        } else if (type.equalsIgnoreCase("Standard")) {
            basicPrice = 110;
            discount = 0.05;
        } else if (type.equalsIgnoreCase("Gift")) {
            basicPrice = 120;
            discount = 0.05;
        }
        return new Ticket(event, address, type, basicPrice, discount);

    }

    private String getEvent() {
        return event;
    }

    private void setEvent(String event) {
        this.event = event;
    }

    private Address getAddress() {
        return address;
    }

    private void setAddress(Address address) {
        this.address = address;
    }

    protected String getType() {
        return type;
    }

    private void setType(String type) {
        this.type = type;
    }

    protected double getBasicPrice() {
        return basicPrice;
    }

    private void setBasicPrice(double basicPrice) {
        Ticket.basicPrice = basicPrice;
    }

    protected double getDiscount() {
        return discount;
    }

    private void setDiscount(double discount) {
        Ticket.discount = discount;
    }

    private int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String printTicketDetails() {

        String typeToDisplay = "";
        if (type.equalsIgnoreCase("Online")) {
            typeToDisplay = "Bilet internetowy";
        } else if (type.equalsIgnoreCase("Standard")) {
            typeToDisplay = "Bilet standardowy";
        } else if (type.equalsIgnoreCase("Gift")) {
            typeToDisplay = "Bilet prezentowy";
        }

        return typeToDisplay + ", na wydarzenie: " + event + ", które odbędzie się w: " + address.printAddressDetails() +
                " , cena podstawowa: " + basicPrice + ", zniżka: " + (int) (discount * 100) + "%" + ", numer biletu: " + id +
                ", cena finalna wyniesie: " + PriceCalculator.calculateFinalPrice(this);

    }

}
