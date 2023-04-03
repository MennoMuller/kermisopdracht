package attractions.general;

import java.math.BigDecimal;

public class Attraction {
    private String name;
    private BigDecimal price;
    private int surfaceArea;
    private int tickets = 0;

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getTickets() {
        return tickets;
    }

    public BigDecimal getRevenue() {
        return price.multiply(new BigDecimal(tickets));
    }

    public void run() {
        System.out.println(this.name + " is running");
        tickets++;
    }
}
