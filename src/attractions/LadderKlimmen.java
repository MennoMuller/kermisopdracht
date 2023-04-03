package attractions;

import attractions.general.Attractie;

import java.math.BigDecimal;

public class LadderKlimmen extends Attractie {
    private final String naam = "ladderklimmen";
    private final BigDecimal prijs = new BigDecimal("5.00");
    private final int oppervlakte = 100;

    @Override
    public void draaien() {
        System.out.println("De ladders worden beklommen!");
    }
}
