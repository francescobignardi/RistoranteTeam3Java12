package portate;

import enumaration.ColoriAnsiEnum;

public class Antipasti extends Portata {

    private boolean isCold;
    private boolean isFried;

    public Antipasti(String name, Double price, boolean isOutMenu, boolean isCold, boolean isFried) {
        super(name, price,isOutMenu);
        this.isCold = isCold;
        this.isFried = isFried;
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
        if (super.isOutMenu()) {
            System.out.print(ColoriAnsiEnum.ANSI_GREEN.getColorCode() + "(È fuori dal menu, " + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        } else {
            System.out.print(ColoriAnsiEnum.ANSI_BLUE.getColorCode() + "(Non è fuori dal menu, " + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        }
        if (isCold) {
            System.out.print(ColoriAnsiEnum.ANSI_GREEN.getColorCode() + "è freddo, " + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        } else {
            System.out.print(ColoriAnsiEnum.ANSI_BLUE.getColorCode() + "non è freddo, " + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        }
        if (isFried) {
            System.out.println(ColoriAnsiEnum.ANSI_GREEN.getColorCode() + "è fritto.)" + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        } else {
            System.out.println(ColoriAnsiEnum.ANSI_BLUE.getColorCode() + "non è fritto.)" + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        }
    }
}