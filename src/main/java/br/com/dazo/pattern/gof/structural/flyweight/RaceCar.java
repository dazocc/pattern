package br.com.dazo.pattern.gof.structural.flyweight;

public abstract class RaceCar {

    private String name;

    private Integer speed;

    private Integer horsePower;

    public RaceCar(String name, Integer speed, Integer horsePower) {
        this.name = name;
        this.speed = speed;
        this.horsePower = horsePower;
    }

    public String getName() {
        return name;
    }

    public Integer getSpeed() {
        return speed;
    }

    public Integer getHorsePower() {
        return horsePower;
    }

    public void moveCar(int currentX, int currentY, int newX, int newY) {
        System.out.println("New location of " + this.name + " is X" + newX + " - Y" + newY);
    }
}
