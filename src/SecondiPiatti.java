public class SecondiPiatti extends  Portata{
    private boolean isOutMenu;
    private boolean hasSideDish;

    public SecondiPiatti(String name, double price/*, boolean isOutMenu, boolean hasSideDish*/) {
        super(name, price);
//        this.hasSideDish=hasSideDish;
//        this.isOutMenu=isOutMenu;
    }

    public boolean isOutMenu() {
        return isOutMenu;
    }
    public void setOutMenu(boolean outMenu) {
        isOutMenu = outMenu;
    }
    public boolean isHasSideDish() {
        return hasSideDish;
    }
    public void setHasSideDish(boolean hasSideDish) {
        this.hasSideDish = hasSideDish;
    }
}
