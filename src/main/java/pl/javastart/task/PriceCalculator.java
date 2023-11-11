package pl.javastart.task;

public class PriceCalculator {

    private static double LOGISTIC_SERVICE_COST = 5;
    private static double GIFT_TICKET_INCREASE = 0.05;

    public static double calculateFinalPrice(Ticket ticket) {
        double finalPrice = 0;

        switch (ticket.getType()) {
            case Ticket.ONLINE_TICKET ->
                    finalPrice = ticket.getBasicPrice() * (1 - ticket.getDiscount());
            case Ticket.STANDARD_TICKET ->
                    finalPrice = ticket.getBasicPrice() * (1 - ticket.getDiscount()) + LOGISTIC_SERVICE_COST;
            case Ticket.GIFT_TICKET ->
                    finalPrice = ticket.getBasicPrice() * (1 - ticket.getDiscount()) + LOGISTIC_SERVICE_COST
                            + GIFT_TICKET_INCREASE * (ticket.getBasicPrice() * (1 - ticket.getDiscount()));
            default -> finalPrice = 0;
        }

        return finalPrice;

    }
}