package attractions.general;

import java.math.BigDecimal;

public class Attraction {
    private String name;
    private BigDecimal price;
    private int surfaceArea;

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void run() {
        System.out.println(this.name + " is running");
    }
}
