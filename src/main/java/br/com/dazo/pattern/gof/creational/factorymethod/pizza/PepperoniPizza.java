package br.com.dazo.pattern.gof.creational.factorymethod.pizza;

public class PepperoniPizza extends Pizza {

    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for pepperoni pizza.");
    }
}
