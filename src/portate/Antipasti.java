package portate;

import enumaration.ColoriAnsiEnum;

public class Antipasti extends Portata {
    private boolean isCold;
    private boolean isFried;

    public Antipasti(String name, double price, boolean isCold, boolean isFried) {
        super(name, price);
        this.isCold=isCold;
        this.isFried=isFried;
    }

    public boolean isCold() {
        return isCold;
    }
    public void setCold(boolean cold) {
        isCold = cold;
    }
    public boolean isFried() {
        return isFried;
    }
    public void setFried(boolean fried) {
        isFried = fried;
    }

    @Override
    public void print() {
        super.print();
        if (isCold) {
            System.out.println(ColoriAnsiEnum.ANSI_GREEN.getColorCode() + "e' freddo" + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        } else {
            System.out.println(ColoriAnsiEnum.ANSI_RED.getColorCode() + "non e' freddo" + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        }
        if (isFried) {
            System.out.println(ColoriAnsiEnum.ANSI_GREEN.getColorCode() + "è fritto " + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        } else {
            System.out.println(ColoriAnsiEnum.ANSI_RED.getColorCode() + "non è fritto" + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        }
    }
}