package attractions;

import attractions.general.Attractie;

import java.math.BigDecimal;

public class Spin extends Attractie {
    private final String naam = "spin";
    private final BigDecimal prijs = new BigDecimal("2.25");
    private final int oppervlakte = 100;

    @Override
    public void draaien() {
        System.out.println("De spin is aan het spinnen!");
    }
}
