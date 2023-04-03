package attractions;

import attractions.general.Attraction;

import java.math.BigDecimal;

public class Spider extends Attraction {
    private final String name = "spider";
    private final BigDecimal price = new BigDecimal("2.25");
    private final int surfaceArea = 100;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public void run() {
        System.out.println("The spider is spidering!");
    }
}
