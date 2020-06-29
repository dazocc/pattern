package br.com.dazo.pattern.gof.creational.abstractfactory.pizza;

import br.com.dazo.pattern.gof.creational.abstractfactory.topping.BaseToppingFactory;

public class PepperoniPizza extends Pizza {

    public PepperoniPizza(BaseToppingFactory toppingFactory){
        super(toppingFactory);
    }
    
    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for pepperoni pizza.");
        getToppingFactory().createCheese();
        getToppingFactory().createSauce();
    }
}
