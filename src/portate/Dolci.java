package portate;

import enumaration.ColoriAnsiEnum;

public class Dolci extends Portata {
    private boolean isSugarFree;
    private boolean isLactoseFree;

    public Dolci(String name, Double price,boolean isOutMenu, boolean isLactoseFree, boolean isSugarFree) {
        super(name, price,isOutMenu);
        this.isLactoseFree = isLactoseFree;
        this.isSugarFree = isSugarFree;
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
        if (super.isOutMenu()) {
            System.out.print(ColoriAnsiEnum.ANSI_GREEN.getColorCode() + "(È fuori dal menu, " + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        } else {
            System.out.print(ColoriAnsiEnum.ANSI_BLUE.getColorCode() + "(Non è fuori dal menu, " + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        }
        if (isSugarFree) {
            System.out.print(ColoriAnsiEnum.ANSI_GREEN.getColorCode() + "è senza zucchero, " + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        } else {
            System.out.print(ColoriAnsiEnum.ANSI_BLUE.getColorCode() + "non è senza zucchero, " + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        }
        if (isLactoseFree) {
            System.out.println(ColoriAnsiEnum.ANSI_GREEN.getColorCode() + "è senza lattosio.)" + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        } else {
            System.out.println(ColoriAnsiEnum.ANSI_BLUE.getColorCode() + "non è senza lattosio.)" + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        }
    }
}