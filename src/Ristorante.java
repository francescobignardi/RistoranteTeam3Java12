
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ristorante {
    private String name;
    private List<Menu> menuList;
    private String description;
    private int stelleMichelin;
    private String address;
    private double mediumPrice;
    private final int MAX_NUMERO_COPERTI;
    private final int MAX_NUMERO_TAVOLI;
    private Map<Cliente, Tavolo> prenotazioni;


    public Ristorante(String name, String description, int stelleMichelin, String address, int MAX_NUMERO_COPERTI, int MAX_NUMERO_TAVOLI, List<Menu> menuList) {
        this.name = name;
        this.description = description;
        this.stelleMichelin = stelleMichelin;
        this.address = address;
        this.MAX_NUMERO_COPERTI = MAX_NUMERO_COPERTI;
        this.MAX_NUMERO_TAVOLI = MAX_NUMERO_TAVOLI;
        this.prenotazioni = new HashMap<>();
        this.menuList = menuList;
        this.mediumPrice=prezzoMedioRistorante();
    }

    private double prezzoMedioRistorante() {
        double prezzo = 0;
        for (Menu menu:menuList){
            prezzo+=menu.getPrezzoMedioMenu();
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

    public double getMediumPrice() {
        return mediumPrice;
    }

    public void setMediumPrice(double mediumPrice) {
        this.mediumPrice = mediumPrice;
    }

    public int getMAX_NUMERO_COPERTI() {
        return MAX_NUMERO_COPERTI;
    }

    public int getMAX_NUMERO_TAVOLI() {
        return MAX_NUMERO_TAVOLI;
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

    public int getStelleMichelin() {
        return stelleMichelin;
    }

    public void setStelleMichelin(int stelleMichelin) {
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
        menuList.stream().filter(n->n.getMenuType()==cliente.getTipo()).forEach(Menu::print);
//        for (Menu menu : menuList) {
//            if (menu.getMenuType() == cliente.getTipo()) {
//                menu.print();
//            }
//        }
    }

    public void addMenu(Menu menu){
        this.menuList.add(menu);
    }
    public boolean controlloDisponibilita(Tavolo tavolo) {
        int tavoliOccupati = tavolo.getNumeroTavoli();
        int copertiOccupati = tavolo.getCoperti();
        for (Map.Entry<Cliente, Tavolo> check : prenotazioni.entrySet()) {
            tavoliOccupati += check.getValue().getNumeroTavoli();
            copertiOccupati += check.getValue().getCoperti();
        }
        return tavoliOccupati <= MAX_NUMERO_TAVOLI && copertiOccupati <= MAX_NUMERO_COPERTI;
    }

    public void prenota(Cliente cliente, int numeroPersone) {
        Tavolo tavolo = new Tavolo(numeroPersone);
        if (controlloDisponibilita(tavolo)) {
            prenotazioni.put(cliente, tavolo);
        } else {
            System.out.println("Mi dispiace, posti esauriti! :(");
        }
    }

    public void checkPrenotazioni() {
        for (Map.Entry<Cliente, Tavolo> prenotazione : prenotazioni.entrySet()) {
            System.out.println("Il cliente: " + prenotazione.getKey().getName() + " " + prenotazione.getKey().getSurname() +
                    " ha prenotato per " + prenotazione.getValue().getCoperti() + " presone. " +
                    "Servono " + prenotazione.getValue().getNumeroTavoli() + " tavoli.");
        }
    }
}
