import enumaration.TypeEnum;
import portate.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu("Il menu di casa", "Bastianich", TypeEnum.CARNIVORO);
        menu.addPortata(new PrimoPiatto("Carbonara", 11.00, false, false));
        menu.addPortata(new PrimoPiatto("Amatriciana", 10.00, false, false));
        menu.addPortata(new PrimoPiatto("Lasagne al ragu", 6.00, false, false));
        menu.addPortata(new PrimoPiatto("Boscaiola", 10.00, true, true));
        menu.addPortata(new PrimoPiatto("Tagliatelle al ragu di maialino dei Nebrodi", 16.00, false, true));

        menu.addPortata(new Antipasti("Patatine fritte", 4.00, false, true));
        menu.addPortata(new Antipasti("Misto caldo", 6.00, false, false));
        menu.addPortata(new Antipasti("Bruschette al pomodoro", 5.00, false, false));
        menu.addPortata(new Antipasti("Tagliere di salumi e formaggi", 12.00, true, false));
        menu.addPortata(new Antipasti("Caponata", 5.50, true, true));

        menu.addPortata(new SecondiPiatti("Tagliata", 22.00, false, true));
        menu.addPortata(new SecondiPiatti("Bistecca", 25.00, true, true));
        menu.addPortata(new SecondiPiatti("Coda alla vaccinara", 20.00, false, false));
        menu.addPortata(new SecondiPiatti("Cotoletta alla milanese", 14.00, false, true));
        menu.addPortata(new SecondiPiatti("Cotoletta alla bolognese", 16.00, false, false));

        menu.addPortata(new Bevande("Acqua naturale", 2.00, false, false, true));
        menu.addPortata(new Bevande("Acqua frizzante", 2.00, false, false, true));
        menu.addPortata(new Bevande("Birra", 4.00, true, true, false));
        menu.addPortata(new Bevande("Vino", 8.00, true, true, false));
        menu.addPortata(new Bevande("CocaCola", 3.00, false, false, true));

        menu.addPortata(new Dolci("Pannacotta", 3.00, false, true));
        menu.addPortata(new Dolci("Baba", 4.00, true, false));
        menu.addPortata(new Dolci("Zeppole", 2.50, false, false));
        menu.addPortata(new Dolci("Pastiera", 5.00, false, false));
        menu.addPortata(new Dolci("Sfogliatella", 4.50, false, false));
        List<Menu> list1=new ArrayList<>();
        list1.add(menu);

       Ristorante ristorante= new Ristorante("Pippolandia", list1,"Rinomato ristorante pluripremiato, per tutti i plati",4,"Via vatteneapesca, 13");
       ristorante.printRistorante();


    }
}