package br.com.dazo.pattern.gof.creational.abstractfactory.pizza;

import br.com.dazo.pattern.gof.creational.abstractfactory.topping.BaseToppingFactory;

public abstract class Pizza {

    private BaseToppingFactory toppingFactory;

    public Pizza(BaseToppingFactory toppingFactory) {
        this.toppingFactory = toppingFactory;
    }

    public abstract void addIngredients();

    public void bakePizza() {
        System.out.println("Pizza baked at 400 for 20 minutes.");
    }

    public BaseToppingFactory getToppingFactory() {
        return toppingFactory;
    }
}
