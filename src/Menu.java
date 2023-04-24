import java.util.ArrayList;

public class Menu {
    private MenuType menuType;
    private String name;
    private String chef;
    private ArrayList<Portata> portataList;

    public Menu(String menu, String chef, MenuType menuType) {
        this.name = menu;
        this.chef = chef;
        this.menuType= menuType;
        this.portataList=new ArrayList<>();
    }

    public String getMenu() {
        return name;
    }
    public void setMenu(String menu) {
        this.name = menu;
    }
    public String getChef() {
        return chef;
    }
    public void setChef(String chef) {
        this.chef = chef;
    }
    public MenuType getMenuType() {
        return menuType;
    }
    public void setMenuType(MenuType menuType) {
        this.menuType =menuType;
    }

    public void print() {
      for (Portata portata:portataList){
          portata.print();
      }
    }
    public void addPortata(Portata portata) {
        portataList.add(portata);
    }
    public void removePortata(Portata portata){
        portataList.remove(portata);
    }
}
