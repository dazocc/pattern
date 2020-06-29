package br.com.dazo.pattern.gof.creational.factorymethod.factory;

import br.com.dazo.pattern.gof.creational.factorymethod.pizza.Pizza;

public abstract class PizzaBaseFactory {

    public abstract Pizza createPizza(PizzaType type);
}
