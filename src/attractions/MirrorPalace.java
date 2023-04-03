package attractions;

import attractions.general.Attraction;

import java.math.BigDecimal;

public class MirrorPalace extends Attraction {
    private final String name = "mirror palace";
    private final BigDecimal price = new BigDecimal("2.75");
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
        System.out.println("The mirrors are reflecting!");
    }
}
