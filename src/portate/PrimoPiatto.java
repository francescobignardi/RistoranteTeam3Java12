package portate;

import enumaration.ColoriAnsiEnum;

public class PrimoPiatto extends Portata {

    private boolean isIntegral;
    private boolean isGlutenFree;

    public PrimoPiatto(String name, Double price, boolean isOutMenu, boolean isIntegral, boolean isGlutenFree) {
        super(name, price,isOutMenu);
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
        if (super.isOutMenu()) {
            System.out.print(ColoriAnsiEnum.ANSI_GREEN.getColorCode() + "(È fuori dal menu, " + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        } else {
            System.out.print(ColoriAnsiEnum.ANSI_BLUE.getColorCode() + "(Non è fuori dal menu, " + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        }
        if (isIntegral) {
            System.out.print(ColoriAnsiEnum.ANSI_GREEN.getColorCode() + "è integrale, " + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        } else {
            System.out.print(ColoriAnsiEnum.ANSI_BLUE.getColorCode() + "non è integrale, " + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        }
        if (isGlutenFree) {
            System.out.println(ColoriAnsiEnum.ANSI_GREEN.getColorCode() + "contiene glutine.)" + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        } else {
            System.out.println(ColoriAnsiEnum.ANSI_BLUE.getColorCode() + "non contiene glutine.)" + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        }
    }
}