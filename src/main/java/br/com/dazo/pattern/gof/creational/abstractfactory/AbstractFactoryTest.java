package br.com.dazo.pattern.gof.creational.abstractfactory;

import br.com.dazo.pattern.gof.creational.abstractfactory.factorypizza.BasePizzaFactory;
import br.com.dazo.pattern.gof.creational.abstractfactory.factorypizza.GourmetPizzaFactory;
import br.com.dazo.pattern.gof.creational.abstractfactory.factorypizza.PizzaType;
import br.com.dazo.pattern.gof.creational.abstractfactory.factorypizza.SicilianPizzaFactory;
import br.com.dazo.pattern.gof.creational.abstractfactory.pizza.Pizza;

/**
 * Factory Method. Creates objects without specifying the exact class to create.
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {

        BasePizzaFactory pizzaFactory = new GourmetPizzaFactory();

        Pizza cheesePizza = pizzaFactory.createPizza(PizzaType.CHEESE);
        Pizza veggiePizza = pizzaFactory.createPizza(PizzaType.PEPPERONI);

        pizzaFactory = new SicilianPizzaFactory();

        cheesePizza = pizzaFactory.createPizza(PizzaType.CHEESE);
        veggiePizza = pizzaFactory.createPizza(PizzaType.PEPPERONI);
    }
}
