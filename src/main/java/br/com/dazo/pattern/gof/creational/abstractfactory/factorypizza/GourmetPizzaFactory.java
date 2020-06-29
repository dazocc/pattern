package br.com.dazo.pattern.gof.creational.abstractfactory.factorypizza;

import br.com.dazo.pattern.gof.creational.abstractfactory.pizza.Pizza;
import br.com.dazo.pattern.gof.creational.abstractfactory.topping.BaseToppingFactory;
import br.com.dazo.pattern.gof.creational.abstractfactory.topping.GourmetFactory;

public class GourmetPizzaFactory extends BasePizzaFactory {

    @Override
    public Pizza createPizza(PizzaType type) {

        BaseToppingFactory toppingFactory= new GourmetFactory();
        Pizza pizza = type.getInstance(toppingFactory);

        pizza.addIngredients();
        pizza.bakePizza();

        return pizza;
    }
}
