public class Antipasti extends Portata {
    private boolean isCold;
    private boolean isFried;

    public Antipasti(String name, double price/*, boolean isCold, boolean isFried*/) {
        super(name, price);
//        this.isCold=isCold;
//        this.isFried=isFried;
    }

    public boolean isCold() {
        return isCold;
    }
    public void setCold(boolean cold) {
        isCold = cold;
    }
    public boolean isFried() {
        return isFried;
    }
    public void setFried(boolean fried) {
        isFried = fried;
    }
}