import java.util.List;

public class Ristorante {
    private String name;
    private List<Menu> menuList;
    private String description;
    private int stelleMichelin;
    private String address;
    private int mediumPrice;


    public Ristorante(String name, List<Menu> menuList, String description, int stelleMichelin, String address, int mediumPrice) {
        this.name = name;
        this.menuList = menuList;
        this.description = description;
        this.stelleMichelin = stelleMichelin;
        this.address = address;
        this.mediumPrice = mediumPrice;
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
    public void printRistorante(){
        System.out.println("Ristrante "+name+" "+stelleMichelin+" Stelle Michelin\nPrezzo Medio "+mediumPrice+" €\n"+description+"\nSito im "+address+"\n");
        for (Menu menu:menuList){
            menu.print();
        }
    }
}
