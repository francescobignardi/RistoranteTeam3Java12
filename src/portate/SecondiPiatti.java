package portate;

import enumaration.ColoriAnsiEnum;

public class SecondiPiatti extends Portata {
    private boolean isOutMenu;
    private boolean hasSideDish;

    public SecondiPiatti(String name, double price, boolean isOutMenu, boolean hasSideDish) {
        super(name, price);
        this.hasSideDish = hasSideDish;
        this.isOutMenu = isOutMenu;
    }

    public boolean isOutMenu() {
        return isOutMenu;
    }

    public void setOutMenu(boolean outMenu) {
        isOutMenu = outMenu;
    }

    public boolean isHasSideDish() {
        return hasSideDish;
    }

    public void setHasSideDish(boolean hasSideDish) {
        this.hasSideDish = hasSideDish;
    }

    @Override
    public void print() {
        super.print();
        if (isOutMenu) {
            System.out.println(ColoriAnsiEnum.ANSI_GREEN.getColorCode() + "è fuori dal menu'" + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        } else {
            System.out.println(ColoriAnsiEnum.ANSI_RED.getColorCode() + "non è fuori dal menu'" + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        }
        if (hasSideDish) {
            System.out.println(ColoriAnsiEnum.ANSI_GREEN.getColorCode() + "ha contorno " + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        } else {
            System.out.println(ColoriAnsiEnum.ANSI_RED.getColorCode() + "non ha contorno" + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        }
    }
}
