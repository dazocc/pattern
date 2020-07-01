package br.com.dazo.pattern.gof.structural.decorator;

public class Glitter extends FlowerBouquetDecorator {

    private FlowerBouquet flowerBouquet;

    public Glitter(FlowerBouquet flowerBouquet) {
        super(flowerBouquet.getDescription() + ", glitter");
        this.flowerBouquet = flowerBouquet;
    }

    public double cost() {
        return 4 + flowerBouquet.cost();
    }

}
