public class Tavolo {
    //TODO tutti le variabili devono essere wrapper
    private int coperti;
    private int numeroTavoli;
    //todo da rivedere.
    public Tavolo(int coperti) {
        this.coperti = coperti;
        if (coperti <= 4) {
            this.numeroTavoli = 1;
        } else {
            this.numeroTavoli = (int) (Math.floor(coperti/ 4) + 1);
        }
    }

    public int getCoperti() {
        return coperti;
    }

    public void setCoperti(int coperti) {
        this.coperti = coperti;
    }

    public int getNumeroTavoli() {
        return numeroTavoli;
    }

    public void setQuantitaTavoli(int quantitaTavoli) {
        this.numeroTavoli = quantitaTavoli;
    }
}
