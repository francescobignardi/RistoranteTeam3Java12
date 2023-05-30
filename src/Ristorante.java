
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ristorante {
    private String name;
    private List<Menu> menuList;
    private String description;
    private Integer stelleMichelin;
    private String address;
    private Double mediumPrice;
    private Integer maxNumeroDiTavoli;
    private Map<Cliente, Tavolo> prenotazioni;

    public Ristorante(String name, String description, Integer stelleMichelin, String address, Integer maxNumeroDiTavoli, List<Menu> menuList) {
        this.name = name;
        this.description = description;
        this.stelleMichelin = stelleMichelin;
        this.address = address;
        this.maxNumeroDiTavoli = maxNumeroDiTavoli;
        this.prenotazioni = new HashMap<>();
        this.menuList = menuList;
        this.mediumPrice = prezzoMedioRistorante();
    }

    private Double prezzoMedioRistorante() {
        Double prezzo = 0.0;
        for (Menu menu : menuList) {
            prezzo += menu.getPrezzoMedioMenu();
        }
        return prezzo / menuList.size();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }

    public Double getMediumPrice() {
        return mediumPrice;
    }

    public void setMediumPrice(Double mediumPrice) {
        this.mediumPrice = mediumPrice;
    }

    public Integer getMAX_NUMERO_TAVOLI() {
        return maxNumeroDiTavoli;
    }

    public Map<Cliente, Tavolo> getPrenotazioni() {
        return prenotazioni;
    }

    public void setPrenotazioni(Map<Cliente, Tavolo> prenotazioni) {
        this.prenotazioni = prenotazioni;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStelleMichelin() {
        return stelleMichelin;
    }

    public void setStelleMichelin(Integer stelleMichelin) {
        this.stelleMichelin = stelleMichelin;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public void printRistorante(Cliente cliente) {
        System.out.println("Ristrante " + name + " " + stelleMichelin + " Stelle Michelin\nPrezzo Medio " + mediumPrice + " €\n" + description + "\nSito in " + address + "\n");
        menuList.stream().filter(n -> n.getMenuType() == cliente.getTipo()).forEach(Menu::print);
    }

    public void addMenu(Menu menu) {
        this.menuList.add(menu);
    }

    public boolean controlloDisponibilita(Cliente cliente) {
        int counter = 0;
        for (Map.Entry<Cliente, Tavolo> prenotazione : prenotazioni.entrySet()) {
            counter += prenotazione.getValue().getNumeroUnitaTavolo();
        }
        int unita = 0;
        if (cliente.getNumeroPersonePrenotazione() > 4) {
            unita = (int) Math.ceil(cliente.getNumeroPersonePrenotazione() / 4);
        } else {
            unita = 1;
        }
        boolean condiction = counter + unita <= maxNumeroDiTavoli;
        return condiction;
    }

    public void prenota(Cliente cliente) {
        if (controlloDisponibilita(cliente)) {
            int unita = 0;
            if (cliente.getNumeroPersonePrenotazione() > 4) {
                unita = (int) Math.ceil(cliente.getNumeroPersonePrenotazione() / 4);
            } else {
                unita = 1;
            }
            Tavolo tavolo = new Tavolo(unita);
            prenotazioni.put(cliente, tavolo);
        } else {
            System.out.println("Mi dispiace, posti esauriti! :(");
        }
    }

    public void checkPrenotazioni() {
        for (Map.Entry<Cliente, Tavolo> prenotazione : prenotazioni.entrySet()) {
            System.out.println("Il cliente: " + prenotazione.getKey().getName() + " " + prenotazione.getKey().getSurname() +
                    " ha prenotato per " + prenotazione.getKey().getNumeroPersonePrenotazione() + " presone. " +
                    "Servono " + prenotazione.getValue().getNumeroUnitaTavolo() + " tavoli.");
        }
    }
}
