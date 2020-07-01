package br.com.dazo.pattern.gof.structural.decorator;

public class RibbonBow extends FlowerBouquetDecorator {

    private FlowerBouquet flowerBouquet;

    public RibbonBow(FlowerBouquet flowerBouquet) {
        super(flowerBouquet.getDescription() + ", ribbon bow");
        this.flowerBouquet = flowerBouquet;
    }

    public double cost() {
        return 6.5 + flowerBouquet.cost();
    }
}
