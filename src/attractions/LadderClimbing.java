package attractions;

import attractions.general.Attraction;

import java.math.BigDecimal;

public class LadderClimbing extends Attraction {
    private final String name = "ladder climbing";
    private final BigDecimal price = new BigDecimal("5.00");
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
        System.out.println("The ladders are being climbed!");
    }
}
