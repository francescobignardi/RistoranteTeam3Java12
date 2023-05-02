import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Menu {
    private MenuType menuType;
    private String name;
    private String chef;
    private Set<Portata> portataList;

    public Menu(String menu, String chef, MenuType menuType) {
        this.name = menu;
        this.chef = chef;
        this.menuType = menuType;
        this.portataList = new HashSet<>();
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
        this.menuType = menuType;
    }

    public void print() {
        System.out.println("Antipasti\n");
        for (Portata portata : portataList) {
            if (portata.getClass() == Antipasti.class) {
                portata.print();
            }
        }
        System.out.println("\nPrimi piatti\n");
        for (Portata portata : portataList) {
            if (portata.getClass() == PrimoPiatto.class) {
                portata.print();
            }
        }
        System.out.println("\nSecondi piatti\n");
        for (Portata portata : portataList) {
            if (portata.getClass() == SecondiPiatti.class) {
                portata.print();
            }
        }
        System.out.println("\nDolci\n");
        for (Portata portata : portataList) {
            if (portata.getClass() == Dolci.class) {
                portata.print();
            }
        }
        System.out.println("\nBevande\n");
        for (Portata portata : portataList) {
            if (portata.getClass() == Bevande.class) {
                portata.print();
            }
        }


    }

    public void addPortata(Portata portata) {
        portataList.add(portata);
    }

    public void removePortata(Portata portata) {
        portataList.remove(portata);
    }
}
