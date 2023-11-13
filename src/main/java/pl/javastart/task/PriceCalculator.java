package pl.javastart.task;

public class PriceCalculator {

    private static final double LOGISTIC_SERVICE_COST = 5;
    private static final double GIFT_TICKET_INCREASE = 0.05;

    public static double calculateFinalPrice(Ticket ticket) {

        return switch (ticket.getType()) {
            case Ticket.ONLINE_TICKET -> ticket.getBasicPrice() * (1 - ticket.getDiscount());

            case Ticket.STANDARD_TICKET -> ticket.getBasicPrice() * (1 - ticket.getDiscount()) + LOGISTIC_SERVICE_COST;

            case Ticket.GIFT_TICKET -> ticket.getBasicPrice() * (1 - ticket.getDiscount()) + LOGISTIC_SERVICE_COST
                    + GIFT_TICKET_INCREASE * (ticket.getBasicPrice() * (1 - ticket.getDiscount()));

            default -> 0;

        };
    }
}