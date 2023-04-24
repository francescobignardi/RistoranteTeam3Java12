public class PrimoPiatto extends Portata {
    private boolean isIntegral;
    private boolean isGlutenFree;

    public PrimoPiatto(String name, double price /*,boolean isIntegral,boolean isGlutenFree*/) {
        super(name, price);
//        this.isIntegral=isIntegral;
//        this.isGlutenFree=isGlutenFree;
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
}