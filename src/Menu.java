import enumaration.ColoriAnsiEnum;
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
        System.out.println("\n"+ColoriAnsiEnum.BACKGROUND_GREEN.getColorCode() + "Antipasti" + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        portataList.stream().filter(antipasto -> antipasto instanceof Antipasti).forEach(Portata::print);
        System.out.println("\n"+ColoriAnsiEnum.BACKGROUND_GREEN.getColorCode() + "Primi piatti" + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        portataList.stream().filter(primo -> primo instanceof PrimoPiatto).forEach(Portata::print);
        System.out.println("\n"+ColoriAnsiEnum.BACKGROUND_GREEN.getColorCode() + "Secondi piatti" + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        portataList.stream().filter(secondo -> secondo instanceof SecondiPiatti).forEach(Portata::print);
        System.out.println("\n"+ColoriAnsiEnum.BACKGROUND_GREEN.getColorCode() + "Dolci" + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        portataList.stream().filter(dolce -> dolce instanceof Dolci).forEach(Portata::print);
        System.out.println("\n"+ColoriAnsiEnum.BACKGROUND_GREEN.getColorCode() + "Bevande" + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        portataList.stream().filter(bevanda -> bevanda instanceof Bevande).forEach(Portata::print);
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
