package br.com.dazo.pattern.gof.structural.flyweight;

public class RaceCarClient {

    private RaceCar raceCar;

    public RaceCarClient(CarType name) {
        /*Ask factory for a RaceCar*/
        raceCar = CarFactory.getRaceCar(name);
    }

    /**
     * The extrinsic state of the flyweight is maintained by the client
     */
    private int currentX = 0;
    private int currentY = 0;

    public void moveCar(int newX, int newY) {
        raceCar.moveCar(currentX, currentY, newX, newY);
        currentX = newX;
        currentY = newY;
    }
}
