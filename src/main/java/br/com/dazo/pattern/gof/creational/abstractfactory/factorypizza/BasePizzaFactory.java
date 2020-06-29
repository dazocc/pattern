package br.com.dazo.pattern.gof.creational.abstractfactory.factorypizza;

import br.com.dazo.pattern.gof.creational.abstractfactory.pizza.Pizza;

public abstract class BasePizzaFactory {

    public abstract Pizza createPizza(PizzaType type);
}
