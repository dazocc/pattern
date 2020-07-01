package br.com.dazo.pattern.gof.structural.decorator;

public class PaperWrapper extends FlowerBouquetDecorator {

    private FlowerBouquet flowerBouquet;

    public PaperWrapper(FlowerBouquet flowerBouquet) {
        super(flowerBouquet.getDescription() + ", paper wrap");
        this.flowerBouquet = flowerBouquet;
    }

    public double cost() {
        return 3 + flowerBouquet.cost();
    }

}
