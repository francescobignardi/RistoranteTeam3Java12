public class Dolci extends Portata{
    private boolean isSugarFree;
    private boolean isLactoseFree;

    public Dolci(String name, double price/* ,boolean isLactoseFree, boolean isSugarFree*/) {
        super(name, price);
//        this.isLactoseFree=isLactoseFree;
//        this.isSugarFree=isSugarFree;
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
}