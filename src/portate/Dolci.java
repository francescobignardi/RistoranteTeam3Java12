package portate;

import enumaration.ColoriAnsiEnum;

public class Dolci extends Portata{
    private boolean isSugarFree;
    private boolean isLactoseFree;
    private static int counterDolci = 0;

    public Dolci(String name, double price,boolean isLactoseFree, boolean isSugarFree) {
        super(name, price);
        this.isLactoseFree=isLactoseFree;
        this.isSugarFree=isSugarFree;
        counterDolci += 1;
    }

    public boolean isSugarFree() {
        return isSugarFree;
    }
    public void setSugarFree(boolean sugarFree) {
        isSugarFree = sugarFree;
    }
    public boolean isLactoseFree() {
        return isLactoseFree;
    }
    public void setLactoseFree(boolean lactoseFree) {
        isLactoseFree = lactoseFree;
    }
    public static int getCounterDolci(){return counterDolci;}

    @Override
    public void print() {
        super.print();
        if (isSugarFree) {
            System.out.println(ColoriAnsiEnum.ANSI_GREEN.getColorCode() + "è senza zucchero'" + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        } else {
            System.out.println(ColoriAnsiEnum.ANSI_RED.getColorCode() + "non è senza zucchero" + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        }
        if (isLactoseFree) {
            System.out.println(ColoriAnsiEnum.ANSI_GREEN.getColorCode() + "è senza lattosio " + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        } else {
            System.out.println(ColoriAnsiEnum.ANSI_RED.getColorCode() + "non è senza lattosio" + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        }
    }
}