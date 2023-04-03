package attractions;

import attractions.general.Attractie;

import java.math.BigDecimal;

public class BotsAutos extends Attractie {
    private final String naam = "botsauto's";
    private final BigDecimal prijs = new BigDecimal("2.50");
    private final int oppervlakte = 100;

    @Override
    public void draaien() {
        System.out.println("De botsauto's rijden!");
    }
}
