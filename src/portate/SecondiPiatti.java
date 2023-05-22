package portate;

import enumaration.ColoriAnsiEnum;

public class SecondiPiatti extends Portata {
    private boolean hasSideDish;

    public SecondiPiatti(String name, Double price, boolean isOutMenu, boolean hasSideDish) {
        super(name, price, isOutMenu);
        this.hasSideDish = hasSideDish;
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
        if (super.isOutMenu()) {
            System.out.print(ColoriAnsiEnum.ANSI_GREEN.getColorCode() + "(È fuori dal menu, " + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        } else {
            System.out.print(ColoriAnsiEnum.ANSI_BLUE.getColorCode() + "(Non è fuori dal menu, " + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        }
        if (hasSideDish) {
            System.out.println(ColoriAnsiEnum.ANSI_GREEN.getColorCode() + "ha contorno.)" + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        } else {
            System.out.println(ColoriAnsiEnum.ANSI_BLUE.getColorCode() + "non ha contorno.)" + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        }
    }
}
