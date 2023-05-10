package portate;

import enumaration.*;

public abstract class Portata {
    private String name;
    private double price;

    public Portata(String name, double price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public void print() {
        System.out.println(ColoriAnsiEnum.BACKGROUND_GREEN.getColorCode() + ColoriAnsiEnum.ANSI_RED.getColorCode() + name + " €" + price + ColoriAnsiEnum.ANSI_RESET.getColorCode());
    }
}
