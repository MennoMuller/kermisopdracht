package attractions.general;

import java.math.BigDecimal;

public class Attractie {
    private String naam;
    private BigDecimal prijs;
    private int oppervlakte;

    public void draaien() {
        System.out.println(this.naam + " draait");
    }
}
