package attractions;

import attractions.general.Attractie;

import java.math.BigDecimal;

public class Hawaii extends Attractie {
    private final String naam = "Hawaii";
    private final BigDecimal prijs = new BigDecimal("2.90");
    private final int oppervlakte = 100;

    @Override
    public void draaien() {
        System.out.println("Hawaii is zonnig!");
    }
}
