package br.com.dazo.pattern.gof.structural.decorator;

public class OrchidBouquet extends FlowerBouquet {

    public OrchidBouquet() {
        super("Orchid bouquet");
    }

    public double cost() {
        return 29.0;
    }
}
