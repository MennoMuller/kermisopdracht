package attractions;

import attractions.general.Attractie;

import java.math.BigDecimal;

public class SpiegelPaleis extends Attractie {
    private final String naam = "spiegelpaleis";
    private final BigDecimal prijs = new BigDecimal("2.75");
    private final int oppervlakte = 100;

    @Override
    public void draaien() {
        System.out.println("De spiegels van het paleis reflecteren!");
    }
}
