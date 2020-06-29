package br.com.dazo.pattern.gof.creational.factorymethod.factory;

import br.com.dazo.pattern.gof.creational.factorymethod.pizza.CheesePizza;
import br.com.dazo.pattern.gof.creational.factorymethod.pizza.PepperoniPizza;
import br.com.dazo.pattern.gof.creational.factorymethod.pizza.Pizza;
import br.com.dazo.pattern.gof.creational.factorymethod.pizza.VeggiePizza;

public enum PizzaType {

    CHEESE {
        @Override
        public Pizza getInstance() {
            return new CheesePizza();
        }
    },

    PEPPERONI{
        @Override
        public Pizza getInstance() {
            return new PepperoniPizza();
        }
    },

    VEGGIE{
        @Override
        public Pizza getInstance() {
            return new VeggiePizza();
        }
    };

    public Pizza getInstance(){
        return null;
    }
}
