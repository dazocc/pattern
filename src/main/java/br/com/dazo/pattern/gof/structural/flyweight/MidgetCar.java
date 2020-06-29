package br.com.dazo.pattern.gof.structural.flyweight;

public class MidgetCar extends RaceCar {

    public static int number;

    public MidgetCar(String name, Integer speed, Integer horsePower) {
        super(name, speed, horsePower);
        number++;
    }
}
