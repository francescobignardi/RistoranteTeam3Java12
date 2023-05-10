package portate;

import enumaration.ColoriAnsiEnum;

public class Dolci extends Portata{
    private boolean isSugarFree;
    private boolean isLactoseFree;

    public Dolci(String name, double price,boolean isLactoseFree, boolean isSugarFree) {
        super(name, price);
        this.isLactoseFree=isLactoseFree;
        this.isSugarFree=isSugarFree;
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

    @Override
    public void print() {
        super.print();
        if (isSugarFree) {
            System.out.println(ColoriAnsiEnum.ANSI_GREEN.getColorCode() + "e' senza zucchero'" + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        } else {
            System.out.println(ColoriAnsiEnum.ANSI_RED.getColorCode() + "non e' senza zucchero" + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        }
        if (isLactoseFree) {
            System.out.println(ColoriAnsiEnum.ANSI_GREEN.getColorCode() + "è senza lattosio " + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        } else {
            System.out.println(ColoriAnsiEnum.ANSI_RED.getColorCode() + "non è senza lattosio" + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        }
    }
}