package portate;

import enumaration.*;

public abstract class Portata {

    private String name;
    private Double price;

    public Portata(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void print() {
        System.out.print(ColoriAnsiEnum.ANSI_YELLOW.getColorCode() + name + " €" + price + "    " + ColoriAnsiEnum.ANSI_RESET.getColorCode());
    }
}
