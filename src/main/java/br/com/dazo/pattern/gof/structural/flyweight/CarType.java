package br.com.dazo.pattern.gof.structural.flyweight;

public enum CarType {

    MIDGET(new MidgetCar("Midget Car", 140, 400)),
    SPRINT(new SprintCar("Sprint Car", 200, 1000));

    private RaceCar raceCar;

    CarType(RaceCar raceCar) {
        this.raceCar = raceCar;
    }

    public RaceCar getRaceCar() {
        return raceCar;
    }
}
