package br.com.dazo.pattern.gof.creational.abstractfactory.topping;

import br.com.dazo.pattern.gof.creational.abstractfactory.cheese.Cheese;
import br.com.dazo.pattern.gof.creational.abstractfactory.cheese.GoatCheese;
import br.com.dazo.pattern.gof.creational.abstractfactory.sauce.CaliforniaOilSauce;
import br.com.dazo.pattern.gof.creational.abstractfactory.sauce.Sauce;

public class GourmetFactory extends BaseToppingFactory {

    @Override
    public Cheese createCheese() {
        return new GoatCheese();
    }

    @Override
    public Sauce createSauce() {
        return new CaliforniaOilSauce();
    }
}
