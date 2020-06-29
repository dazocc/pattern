package br.com.dazo.pattern.gof.structural.flyweight;

public class SprintCar extends RaceCar {

    public static int number;

    public SprintCar(String name, Integer speed, Integer horsePower) {
        super(name, speed, horsePower);
        number++;
    }
}
