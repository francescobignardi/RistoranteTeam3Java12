import enumaration.TypeEnum;
import portate.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu("Il menu di casa", "Bastianich", TypeEnum.CARNIVORO);
        menu.addPortata(new PrimoPiatto("Carbonara", 11.00,false, false, false));
        menu.addPortata(new PrimoPiatto("Amatriciana", 10.00,false, false, false));
        menu.addPortata(new PrimoPiatto("Lasagne al ragu", 6.00,false, false, false));
        menu.addPortata(new PrimoPiatto("Boscaiola", 10.00,false, true, true));
        menu.addPortata(new PrimoPiatto("Tagliatelle al ragu di maialino dei Nebrodi", 16.00,true, false, true));

        menu.addPortata(new Antipasti("Patatine fritte", 4.00, false, false, true));
        menu.addPortata(new Antipasti("Misto caldo", 6.00, false, false, false));
        menu.addPortata(new Antipasti("Bruschette al pomodoro", 5.00, false, false, false));
        menu.addPortata(new Antipasti("Tagliere di salumi e formaggi", 12.00, false, true, false));
        menu.addPortata(new Antipasti("Caponata", 5.50, true, true, true));

        menu.addPortata(new SecondiPiatti("Tagliata", 22.00, false, true));
        menu.addPortata(new SecondiPiatti("Bistecca", 25.00, true, true));
        menu.addPortata(new SecondiPiatti("Coda alla vaccinara", 20.00, false, false));
        menu.addPortata(new SecondiPiatti("Cotoletta alla milanese", 14.00, false, true));
        menu.addPortata(new SecondiPiatti("Cotoletta alla bolognese", 16.00, false, false));

        menu.addPortata(new Bevande("Acqua naturale", 2.00,false, false, false, true));
        menu.addPortata(new Bevande("Acqua frizzante", 2.00,false, false, false, true));
        menu.addPortata(new Bevande("Birra", 4.00,false, true, true, false));
        menu.addPortata(new Bevande("Vino", 8.00,false, true, true, false));
        menu.addPortata(new Bevande("CocaCola", 3.00,true, false, false, true));

        menu.addPortata(new Dolci("Pannacotta", 3.00,false, false, true));
        menu.addPortata(new Dolci("Baba", 4.00,false, true, false));
        menu.addPortata(new Dolci("Zeppole", 2.50,false, false, false));
        menu.addPortata(new Dolci("Pastiera", 5.00,false, false, false));
        menu.addPortata(new Dolci("Sfogliatella", 4.50,false, false, false));

        Menu menuVegetariano = new Menu("Il menu per vegetariani", "Giorgio", TypeEnum.VEGETARIANO);
        menuVegetariano.addPortata(new PrimoPiatto("Pasta al pesto", 8.00,false, false, false));

        menuVegetariano.addPortata(new Antipasti("Patatine vegetariane", 5.00, false, false, true));

        menuVegetariano.addPortata(new SecondiPiatti("tagliere di formaggi", 19, false, true));

        menuVegetariano.addPortata(new Bevande("Acqua naturale", 2.00,false, false, false, true));
        menuVegetariano.addPortata(new Bevande("Acqua frizzante", 2.00,false, false, false, true));
        menuVegetariano.addPortata(new Bevande("Birra", 4.00,false, true, true, false));
        menuVegetariano.addPortata(new Bevande("Vino", 8.00,false, true, true, false));
        menuVegetariano.addPortata(new Bevande("CocaCola", 3.00,true, false, false, true));

        menuVegetariano.addPortata(new Dolci("Pannacotta", 3.00,false, false, true));
        menuVegetariano.addPortata(new Dolci("Baba", 4.00,false, true, false));
        menuVegetariano.addPortata(new Dolci("Zeppole", 2.50,false, false, false));
        menuVegetariano.addPortata(new Dolci("Pastiera", 5.00,false, false, false));
        menuVegetariano.addPortata(new Dolci("Sfogliatella", 4.50,false, false, false));



        List<Menu> list= new ArrayList<>(List.of(menu, menuVegetariano));



        Ristorante ristorante = new Ristorante("B12", "Rinomato ristorante pluripremiato, per tutti i palati", 4, "Via Roma, 13",100,25, list);






        Cliente cliente1 = new Cliente("Gabriele", "", "", "","", 24, TypeEnum.CARNIVORO);
        Cliente cliente2 = new Cliente("Raffaele", "", "", "","", 20, TypeEnum.VEGETARIANO);

        ristorante.printRistorante(cliente2);

        ristorante.prenota(cliente2, 12);
        ristorante.prenota(cliente2, 15);
        ristorante.prenota(cliente1, 25);
        ristorante.checkPrenotazioni();
    }
}