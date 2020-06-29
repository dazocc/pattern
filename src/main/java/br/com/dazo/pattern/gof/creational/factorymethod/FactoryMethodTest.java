package br.com.dazo.pattern.gof.creational.factorymethod;

import br.com.dazo.pattern.gof.creational.factorymethod.factory.PizzaBaseFactory;
import br.com.dazo.pattern.gof.creational.factorymethod.factory.PizzaFactory;
import br.com.dazo.pattern.gof.creational.factorymethod.factory.PizzaType;

/**
 * Factory Method. Creates objects without specifying the exact class to create.
 * */
public class FactoryMethodTest {

    public static void main(String[] args) {

        PizzaBaseFactory factory = new PizzaFactory();

        factory.createPizza(PizzaType.CHEESE);
        factory.createPizza(PizzaType.VEGGIE);
        factory.createPizza(PizzaType.PEPPERONI);
    }
}
