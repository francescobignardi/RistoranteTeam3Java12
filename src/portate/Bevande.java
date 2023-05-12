package portate;

import enumaration.ColoriAnsiEnum;

public class Bevande extends Portata {
    private boolean isCold;
    private boolean isHomeMade;
    private boolean isAlcoholic;
    private static int counterBevande = 0;

    public Bevande(String name, double price, boolean isCold, boolean isHomeMade, boolean isAlcoholic) {
        super(name, price);
        this.isCold = isCold;
        this.isHomeMade = isHomeMade;
        this.isAlcoholic = isAlcoholic;
        counterBevande += 1;
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

    public static int getCounterBevande() {
        return counterBevande;
    }

    @Override
    public void print() {
        super.print();
        if (isCold) {
            System.out.println(ColoriAnsiEnum.ANSI_GREEN.getColorCode() + "è freddo" + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        } else {
            System.out.println(ColoriAnsiEnum.ANSI_RED.getColorCode() + "non è freddo" + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        }
        if (isHomeMade) {
            System.out.println(ColoriAnsiEnum.ANSI_GREEN.getColorCode() + "è fatto in casa " + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        } else {
            System.out.println(ColoriAnsiEnum.ANSI_RED.getColorCode() + "non è fatto in casa" + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        }
    }
}
