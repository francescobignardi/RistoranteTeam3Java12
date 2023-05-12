import java.util.List;

public class Ristorante {
    private String name;
    private List<Menu> menuList;
    private String description;
    private int stelleMichelin;
    private String address;
    private double mediumPrice;

    //TODO inserire la capienza massima, una mappa che prende tavalo e cliente e un metodo per prenotare e quello che vi serve
    //TODO controllo per non andare in sopra prenotazioni


    public Ristorante(String name, List<Menu> menuList, String description, int stelleMichelin, String address) {
        this.name = name;
        this.menuList = menuList;
        this.description = description;
        this.stelleMichelin = stelleMichelin;
        this.address = address;
        this.mediumPrice = Menu.prezzoMedio();
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

    //TODO non è disponibile il menù
    public void printRistorante(Cliente cliente) {
        System.out.println("Ristrante " + name + " " + stelleMichelin + " Stelle Michelin\nPrezzo Medio " + mediumPrice + " €\n" + description + "\nSito in " + address + "\n");
        for (Menu menu : menuList) {
            if (cliente.getTipo() == menu.getMenuType()) {
                menu.print();
            }
        }
    }
}
