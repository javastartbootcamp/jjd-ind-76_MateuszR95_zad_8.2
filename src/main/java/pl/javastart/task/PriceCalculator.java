package pl.javastart.task;

public class PriceCalculator {

    protected static double calculateFinalPrice(Ticket ticket) {
        double finalPrice = 0;

        if (ticket.getType().equalsIgnoreCase("online")) {
            finalPrice = ticket.getBasicPrice() * (1 - ticket.getDiscount());
        } else if (ticket.getType().equalsIgnoreCase("standard")) {
            finalPrice = ticket.getBasicPrice() * (1 - ticket.getDiscount()) + 5;
        } else if (ticket.getType().equalsIgnoreCase("gift")) {
            finalPrice = ticket.getBasicPrice() * (1 - ticket.getDiscount()) + 5
                    + 0.05 * (ticket.getBasicPrice() * (1 - ticket.getDiscount()));
        } else {
            System.out.println("Podaj prawidłowy typ biletu");
        }
        return finalPrice;
    }

}
