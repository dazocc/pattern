package br.com.dazo.pattern.gof.creational.abstractfactory.pizza;

import br.com.dazo.pattern.gof.creational.abstractfactory.topping.BaseToppingFactory;

public class VeggiePizza extends Pizza {

    public VeggiePizza(BaseToppingFactory toppingFactory){
        super(toppingFactory);
    }
    
    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for veggie pizza.");
        getToppingFactory().createCheese();
        getToppingFactory().createSauce();
    }
}
