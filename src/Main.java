public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu("Il menu di casa", "Bastianich", MenuType.CARNIVORO);
        menu.addPortata(new PrimoPiatto("Carbonara", 11.00));
        menu.addPortata(new PrimoPiatto("Amatriciana", 10.00));
        menu.addPortata(new PrimoPiatto("Lasagne al ragu", 6.00));
        menu.addPortata(new PrimoPiatto("Boscaiola", 10.00));
        menu.addPortata(new PrimoPiatto("Tagliatelle al ragu di maialino dei Nebrodi", 16.00));

        menu.addPortata(new Antipasti("Patatine fritte", 4.00));
        menu.addPortata(new Antipasti("Misto caldo", 6.00));
        menu.addPortata(new Antipasti("Bruschette al pomodoro", 5.00));
        menu.addPortata(new Antipasti("Tagliere di salumi e formaggi", 12.00));
        menu.addPortata(new Antipasti("Caponata", 5.50));

        menu.addPortata(new SecondiPiatti("Tagliata", 22.00));
        menu.addPortata(new SecondiPiatti("Bistecca", 25.00));
        menu.addPortata(new SecondiPiatti("Coda alla vaccinara", 20.00));
        menu.addPortata(new SecondiPiatti("Cotoletta alla milanese", 14.00));
        menu.addPortata(new SecondiPiatti("Cotoletta alla bolognese", 16.00));

        menu.addPortata(new Bevande("Acqua naturale", 2.00, false));
        menu.addPortata(new Bevande("Acqua frizzante", 2.00, false));
        menu.addPortata(new Bevande("Birra", 4.00, true));
        menu.addPortata(new Bevande("Vino", 8.00, true));
        menu.addPortata(new Bevande("CocaCola", 3.00, false));

        menu.addPortata(new Dolci("Pannacotta", 3.00));
        menu.addPortata(new Dolci("Baba", 4.00));
        menu.addPortata(new Dolci("Zeppole", 2.50));
        menu.addPortata(new Dolci("Pastiera", 5.00));
        menu.addPortata(new Dolci("Sfogliatella", 4.50));

        menu.print();

    }
}