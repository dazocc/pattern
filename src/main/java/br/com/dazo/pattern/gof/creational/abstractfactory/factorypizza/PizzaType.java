package br.com.dazo.pattern.gof.creational.abstractfactory.factorypizza;

import br.com.dazo.pattern.gof.creational.abstractfactory.pizza.CheesePizza;
import br.com.dazo.pattern.gof.creational.abstractfactory.pizza.PepperoniPizza;
import br.com.dazo.pattern.gof.creational.abstractfactory.topping.BaseToppingFactory;
import br.com.dazo.pattern.gof.creational.abstractfactory.pizza.Pizza;

public enum PizzaType {

    CHEESE {
        @Override
        public Pizza getInstance(BaseToppingFactory toppingFactory) {
            return new CheesePizza(toppingFactory);
        }
    },

    PEPPERONI{
        @Override
        public Pizza getInstance(BaseToppingFactory toppingFactory) {
            return new PepperoniPizza(toppingFactory);
        }
    };

    public Pizza getInstance(BaseToppingFactory toppingFactory){
        return null;
    }
}
