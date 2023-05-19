import enumaration.ColoriAnsiEnum;
import enumaration.TypeEnum;
import portate.*;

import java.util.HashSet;
import java.util.Set;

public class Menu {
    private TypeEnum menuType;
    private String name;
    private String chef;
    private Set<Portata> portataList;
    private double prezzoMedioMenu;

    public Menu(String name, String chef, TypeEnum menuType) {
        this.name = name;
        this.chef = chef;
        this.menuType = menuType;
        this.portataList = new HashSet<>();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Set<Portata> getPortataList() {
        return portataList;
    }

    public void setPortataList(Set<Portata> portataList) {
        this.portataList = portataList;
    }

    public double getPrezzoMedioMenu() {
        return prezzoMedioMenu;
    }

    public void setPrezzoMedioMenu(double prezzoMedioMenu) {
        this.prezzoMedioMenu = prezzoMedioMenu;
    }

    public void print() {
        System.out.println("\n" + ColoriAnsiEnum.BACKGROUND_GREEN.getColorCode() + "Antipasti" + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        portataList.stream().filter(antipasto -> antipasto instanceof Antipasti).forEach(Portata::print);
        System.out.println("\n" + ColoriAnsiEnum.BACKGROUND_GREEN.getColorCode() + "Primi piatti" + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        portataList.stream().filter(primo -> primo instanceof PrimoPiatto).forEach(Portata::print);
        System.out.println("\n" + ColoriAnsiEnum.BACKGROUND_GREEN.getColorCode() + "Secondi piatti" + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        portataList.stream().filter(secondo -> secondo instanceof SecondiPiatti).forEach(Portata::print);
        System.out.println("\n" + ColoriAnsiEnum.BACKGROUND_GREEN.getColorCode() + "Dolci" + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        portataList.stream().filter(dolce -> dolce instanceof Dolci).forEach(Portata::print);
        System.out.println("\n" + ColoriAnsiEnum.BACKGROUND_GREEN.getColorCode() + "Bevande" + ColoriAnsiEnum.ANSI_RESET.getColorCode());
        portataList.stream().filter(bevanda -> bevanda instanceof Bevande).forEach(Portata::print);
    }

    public void addPortata(Portata portata) {
        portataList.add(portata);
        this.prezzoMedioMenu = prezzoMedio();
    }

    public void removePortata(Portata portata) {
        portataList.remove(portata);
        this.prezzoMedioMenu = prezzoMedio();
    }

    public double prezzoMedio() {
        double prezzo =0;
        double prezzoAntipasti = 0;
        double countA = 0;
        double prezzoPrimoPiatto = 0;
        double countP = 0;
        double prezzoSecondoPiatto = 0;
        double countS = 0;
        double prezzoDolci = 0;
        double countD = 0;
        double prezzoBevande = 0;
        double countB = 0;
        for (Portata portata : portataList) {
            if (portata instanceof Antipasti) {
                prezzoAntipasti += portata.getPrice();
                countA += 1;
            }
            if (portata instanceof PrimoPiatto) {
                prezzoPrimoPiatto += portata.getPrice();
                countP+=1;
            }
            if (portata instanceof SecondiPiatti) {
                prezzoSecondoPiatto += portata.getPrice();
                countS+=1;
            }
            if (portata instanceof Dolci) {
                prezzoDolci += portata.getPrice();
                countD +=1;
            }
            if (portata instanceof Bevande) {
                prezzoBevande += portata.getPrice();
                countB+=1;
            }
        }

            prezzo = prezzoAntipasti / countA +
                    prezzoPrimoPiatto / countP +
                    prezzoSecondoPiatto / countS +
                    prezzoDolci / countD +
                    prezzoBevande / countB;

        return prezzo;
    }
}
