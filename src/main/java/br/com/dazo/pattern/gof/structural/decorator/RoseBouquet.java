package br.com.dazo.pattern.gof.structural.decorator;

public class RoseBouquet extends FlowerBouquet {

    public RoseBouquet() {
        super("Rose bouquet");
    }

    public double cost() {
        return 12.0;
    }
}
