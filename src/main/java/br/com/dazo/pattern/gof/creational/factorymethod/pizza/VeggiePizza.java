package br.com.dazo.pattern.gof.creational.factorymethod.pizza;

public class VeggiePizza extends Pizza {

    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for veggie pizza.");
    }
}
