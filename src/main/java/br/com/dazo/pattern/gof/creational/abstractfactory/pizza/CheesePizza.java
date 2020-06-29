package br.com.dazo.pattern.gof.creational.abstractfactory.pizza;

import br.com.dazo.pattern.gof.creational.abstractfactory.topping.BaseToppingFactory;

public class CheesePizza extends Pizza {

    public CheesePizza(BaseToppingFactory toppingFactory){
        super(toppingFactory);
    }

    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for cheese pizza.");
        getToppingFactory().createCheese();
        getToppingFactory().createSauce();
    }
}
