package attractions;

import attractions.general.Attractie;

import java.math.BigDecimal;

public class SpookHuis extends Attractie {
    private final String naam = "spookhuis";
    private final BigDecimal prijs = new BigDecimal("3.20");
    private final int oppervlakte = 100;

    @Override
    public void draaien() {
        System.out.println("De spoken zijn thuis!");
    }
}
