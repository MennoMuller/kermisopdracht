package control;

import java.math.BigDecimal;

public class CashRegister {
    private BigDecimal revenue = new BigDecimal("0.00");
    private int tickets = 0;

    public void addRevenue(BigDecimal price) {
        revenue = revenue.add(price);
        tickets++;
    }

    public BigDecimal getRevenue() {
        return revenue;
    }

    public int getTickets() {
        return tickets;
    }
}
