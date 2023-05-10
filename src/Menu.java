import enumaration.TypeEnum;
import portate.*;

import java.util.HashSet;
import java.util.Set;

public class Menu {
    private TypeEnum menuType;
    private String name;
    private String chef;
    private static Set<Portata> portataList;

    public Menu(String menu, String chef, TypeEnum menuType) {
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

    public TypeEnum getMenuType() {
        return menuType;
    }

    public void setMenuType(TypeEnum menuType) {
        this.menuType = menuType;
    }

    public void print() {
        //TODO sistemare
        System.out.println("portate.Antipasti\n");
        for (Portata portata : portataList) {
            if (portata.getClass() == Antipasti.class) {
                portata.print();
            }
            if (portata.getClass() == PrimoPiatto.class) {
                portata.print();
            }
            System.out.println("\nPrimi piatti\n");
            if (portata.getClass() == SecondiPiatti.class) {
                portata.print();
            }
        }
        for (Portata portata : portataList) {
        }
        System.out.println("\nSecondi piatti\n");
        for (Portata portata : portataList) {
        }
        System.out.println("\nportate.Dolci\n");
        for (Portata portata : portataList) {
            //TODO sistemare
            if (portata instanceof Dolci) {
                portata.print();
            }
        }
        System.out.println("\nportate.Bevande\n");
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

    public static double prezzoMedio() {
        int prezzo = 0;
        int prezzoAntipasti = 0;
        int prezzoPrimoPiatto = 0;
        int prezzoSecondoPiatto = 0;
        int prezzoDolci = 0;
        int prezzoBevande = 0;
        for (Portata portata : portataList) {
            if (portata instanceof Antipasti) {
                prezzoAntipasti += portata.getPrice();
            }
            if (portata instanceof PrimoPiatto) {
                prezzoPrimoPiatto += portata.getPrice();
            }
            if (portata instanceof SecondiPiatti) {
                prezzoSecondoPiatto += portata.getPrice();
            }
            if (portata instanceof Dolci) {
                prezzoDolci += portata.getPrice();
            }
            if (portata instanceof Bevande) {
                prezzoBevande += portata.getPrice();
            }
        }
        prezzo = prezzoAntipasti / Antipasti.getCounterAntipasti() +
                 prezzoPrimoPiatto / PrimoPiatto.getCounterPrimoPiatto() +
                 prezzoSecondoPiatto / SecondiPiatti.getCounterSecondoPiatto() +
                 prezzoDolci / Dolci.getCounterDolci() +
                 prezzoBevande / Bevande.getCounterBevande();
        return prezzo;
    }
}
