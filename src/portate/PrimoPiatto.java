package portate;

import enumaration.ColoriAnsiEnum;

public class PrimoPiatto extends Portata {
    private boolean isIntegral;
    private boolean isGlutenFree;
    private static int counterPrimoPiatto = 0;

    public PrimoPiatto(String name, double price, boolean isIntegral, boolean isGlutenFree) {
        super(name, price);
        this.isIntegral = isIntegral;
        this.isGlutenFree = isGlutenFree;
        counterPrimoPiatto += 1;
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

    public static int getCounterPrimoPiatto(){return counterPrimoPiatto;}

    @Override
    public void print() {
        super.print();
        if (isIntegral) {
            System.out.println(ColoriAnsiEnum.ANSI_GREEN.getColorCode() + "è integrale" + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        } else {
            System.out.println(ColoriAnsiEnum.ANSI_RED.getColorCode() + "non è integrale" + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        }
        if (isGlutenFree) {
            System.out.println(ColoriAnsiEnum.ANSI_GREEN.getColorCode() + "contiene glutine" + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        } else {
            System.out.println(ColoriAnsiEnum.ANSI_RED.getColorCode() + "non contiene glutine" + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        }
    }
}