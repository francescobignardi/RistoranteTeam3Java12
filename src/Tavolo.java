public class Tavolo {
    //TODO tutti le variabili devono essere wrapper
    private Integer coperti;
    private Integer numeroTavoli;
    //todo da rivedere.
    public Tavolo(Integer coperti) {
        this.coperti = coperti;
        if (coperti <= 4) {
            this.numeroTavoli = 1;
        } else {
            this.numeroTavoli = (int) (Math.floor(coperti/ 4) + 1);
        }
    }

    public Integer getCoperti() {
        return coperti;
    }

    public void setCoperti(Integer coperti) {
        this.coperti = coperti;
    }

    public Integer getNumeroTavoli() {
        return numeroTavoli;
    }

    public void setQuantitaTavoli(Integer quantitaTavoli) {
        this.numeroTavoli = quantitaTavoli;
    }
}
