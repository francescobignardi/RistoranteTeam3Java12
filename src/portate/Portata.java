package portate;

import enumaration.*;

public abstract class Portata {

    private String name;
    private Double price;
    private boolean isOutMenu;

    public Portata(String name, Double price, boolean isOutMenu) {
        this.name = name;
        this.price = price;
        this.isOutMenu=isOutMenu;
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

    public void setPrice(Double price) {
        this.price = price;
    }

    public boolean isOutMenu() {
        return isOutMenu;
    }

    public void setOutMenu(boolean outMenu) {
        isOutMenu = outMenu;
    }

    public void print() {
        System.out.print(ColoriAnsiEnum.ANSI_YELLOW.getColorCode() + name + " €" + price + "    " + ColoriAnsiEnum.ANSI_RESET.getColorCode());
    }
}
