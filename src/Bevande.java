public class Bevande extends  Portata{
    private boolean isCold;
    private boolean isHomeMade;
    private boolean isAlcoholic;

    public Bevande(String name, double price,/* boolean isCold, boolean isHomeMade,*/ boolean isAlcoholic) {
        super(name, price);
//        this.isCold=isCold;
//        this.isHomeMade=isHomeMade;
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
}
