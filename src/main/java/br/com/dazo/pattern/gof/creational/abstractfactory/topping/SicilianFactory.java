package br.com.dazo.pattern.gof.creational.abstractfactory.topping;

import br.com.dazo.pattern.gof.creational.abstractfactory.cheese.Cheese;
import br.com.dazo.pattern.gof.creational.abstractfactory.cheese.MozzarellaCheese;
import br.com.dazo.pattern.gof.creational.abstractfactory.sauce.Sauce;
import br.com.dazo.pattern.gof.creational.abstractfactory.sauce.TomatoSauce;

public class SicilianFactory extends BaseToppingFactory {

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Sauce createSauce() {
        return new TomatoSauce();
    }
}
