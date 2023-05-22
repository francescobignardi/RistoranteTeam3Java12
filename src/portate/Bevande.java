package portate;

import enumaration.ColoriAnsiEnum;

public class Bevande extends Portata {



    private boolean isOutMenu;
    private boolean isCold;
    private boolean isHomeMade;
    private boolean isAlcoholic;

    public Bevande(String name, Double price, boolean isOutMenu, boolean isCold, boolean isHomeMade, boolean isAlcoholic) {
        super(name, price);
        this.isOutMenu = isOutMenu;
        this.isCold = isCold;
        this.isHomeMade = isHomeMade;
        this.isAlcoholic = isAlcoholic;
    }

    public boolean isCold() {
        return isCold;
    }

    public void setCold(boolean cold) {
        isCold = cold;
    }

    public boolean isHomeMade() {
        return isHomeMade;
    }

    public void setHomeMade(boolean homeMade) {
        isHomeMade = homeMade;
    }

    @Override
    public void print() {
        super.print();
        if (isOutMenu) {
            System.out.print(ColoriAnsiEnum.ANSI_GREEN.getColorCode() + "(È fuori dal menu, " + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        } else {
            System.out.print(ColoriAnsiEnum.ANSI_BLUE.getColorCode() + "(Non è fuori dal menu, " + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        }
        if (isCold) {
            System.out.print(ColoriAnsiEnum.ANSI_GREEN.getColorCode() + "è freddo, " + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        } else {
            System.out.print(ColoriAnsiEnum.ANSI_BLUE.getColorCode() + "non è freddo, " + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        }
        if (isHomeMade) {
            System.out.println(ColoriAnsiEnum.ANSI_GREEN.getColorCode() + "è fatto in casa.)" + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        } else {
            System.out.println(ColoriAnsiEnum.ANSI_BLUE.getColorCode() + "non è fatto in casa.)" + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        }
    }
}
