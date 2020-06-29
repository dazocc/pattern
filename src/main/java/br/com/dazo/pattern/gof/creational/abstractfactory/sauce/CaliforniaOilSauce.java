package br.com.dazo.pattern.gof.creational.abstractfactory.sauce;

public class CaliforniaOilSauce implements Sauce {

    public CaliforniaOilSauce(){
        prepareSauce();
    }
    @Override
    public void prepareSauce() {
        System.out.println("Preparing california oil sauce..");
    }
}
