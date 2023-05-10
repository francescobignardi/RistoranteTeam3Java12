package portate;

import enumaration.ColoriAnsiEnum;

public class Bevande extends  Portata{
    private boolean isCold;
    private boolean isHomeMade;
    private boolean isAlcoholic;

    public Bevande(String name, double price, boolean isCold, boolean isHomeMade, boolean isAlcoholic) {
        super(name, price);
        this.isCold=isCold;
        this.isHomeMade=isHomeMade;
        this.isAlcoholic=isAlcoholic;
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
        if (isCold) {
            System.out.println(ColoriAnsiEnum.ANSI_GREEN.getColorCode() + "e' freddo" + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        } else {
            System.out.println(ColoriAnsiEnum.ANSI_RED.getColorCode() + "non e' freddo" + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        }
        if (isHomeMade) {
            System.out.println(ColoriAnsiEnum.ANSI_GREEN.getColorCode() + "è fatto in casa " + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        } else {
            System.out.println(ColoriAnsiEnum.ANSI_RED.getColorCode() + "non è  fatto in casa" + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        }
    }
}
