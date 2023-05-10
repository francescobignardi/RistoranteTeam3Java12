package portate;

import enumaration.ColoriAnsiEnum;

public class PrimoPiatto extends Portata {
    private boolean isIntegral;
    private boolean isGlutenFree;

    public PrimoPiatto(String name, double price, boolean isIntegral, boolean isGlutenFree) {
        super(name, price);
        this.isIntegral = isIntegral;
        this.isGlutenFree = isGlutenFree;
    }

    public boolean isIntegral() {
        return isIntegral;
    }

    public void setIntegral(boolean integral) {
        isIntegral = integral;
    }

    public boolean isGlutenFree() {
        return isGlutenFree;
    }

    public void setGlutenFree(boolean glutenFree) {
        isGlutenFree = glutenFree;
    }

    @Override
    public void print() {
        super.print();
        if (isIntegral) {
            System.out.println(ColoriAnsiEnum.ANSI_GREEN.getColorCode() + "e' integrale" + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        } else {
            System.out.println(ColoriAnsiEnum.ANSI_RED.getColorCode() + "non e' integrale" + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        }
        if (isGlutenFree) {
            System.out.println(ColoriAnsiEnum.ANSI_GREEN.getColorCode() + "contiene glutine" + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        } else {
            System.out.println(ColoriAnsiEnum.ANSI_RED.getColorCode() + "non contiene glutine" + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        }
    }
}