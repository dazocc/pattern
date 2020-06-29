package br.com.dazo.pattern.gof.creational.abstractfactory.cheese;

public class MozzarellaCheese implements Cheese {

    public MozzarellaCheese() {
        prepareCheese();
    }

    @Override
    public void prepareCheese() {
        System.out.println("Preparing mozzarella cheese...");
    }
}