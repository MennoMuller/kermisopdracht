package attractions;

import attractions.general.Attraction;

import java.math.BigDecimal;

public class HauntedHouse extends Attraction {
    private final String name = "haunted house";
    private final BigDecimal price = new BigDecimal("3.20");
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
        System.out.println("The house is haunted!");
    }
}
