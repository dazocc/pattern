package br.com.dazo.pattern.gof.creational.factorymethod.factory;

import br.com.dazo.pattern.gof.creational.factorymethod.pizza.Pizza;

public class PizzaFactory extends PizzaBaseFactory{
    @Override
    public Pizza createPizza(PizzaType type) {

        Pizza pizza = type.getInstance();

        pizza.addIngredients();
        pizza.bakePizza();

        return pizza;
    }
}
