package br.com.dazo.pattern.gof.structural.decorator;

public abstract class FlowerBouquet {

    private String description;

    public FlowerBouquet(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
