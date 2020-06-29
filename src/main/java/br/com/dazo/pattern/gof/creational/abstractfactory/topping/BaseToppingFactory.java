package br.com.dazo.pattern.gof.creational.abstractfactory.topping;

import br.com.dazo.pattern.gof.creational.abstractfactory.cheese.Cheese;
import br.com.dazo.pattern.gof.creational.abstractfactory.sauce.Sauce;

public abstract class BaseToppingFactory {

    public abstract Cheese createCheese();
    public abstract Sauce createSauce();
}
