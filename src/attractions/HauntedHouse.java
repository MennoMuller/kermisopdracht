package attractions;

import attractions.general.Attraction;

import java.math.BigDecimal;

public class HauntedHouse extends Attraction {
    private final String name = "haunted house";
    private final BigDecimal price = new BigDecimal("3.20");
    private final int surfaceArea = 100;
    private int tickets = 0;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public int getTickets() {
        return tickets;
    }

    @Override
    public BigDecimal getRevenue() {
        return price.multiply(new BigDecimal(tickets));
    }

    @Override
    public void run() {
        System.out.println("The house is haunted!");
        tickets++;
    }
}
