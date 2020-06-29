package br.com.dazo.pattern.gof.structural.flyweight;

/*
* Flyweight. Reduces the cost of complex object models.
* */
public class FlyweightTest {

    public static void main(String[] args) {

        RaceCarClient raceCars[] = {
                new RaceCarClient(CarType.MIDGET),
                new RaceCarClient(CarType.MIDGET),
                new RaceCarClient(CarType.MIDGET),
                new RaceCarClient(CarType.SPRINT),
                new RaceCarClient(CarType.SPRINT),
                new RaceCarClient(CarType.SPRINT)
        };

        raceCars[0].moveCar(29, 3112);
        raceCars[1].moveCar(39, 2002);
        raceCars[2].moveCar(49, 1985);
        raceCars[3].moveCar(59, 2543);
        raceCars[4].moveCar(69, 2322);
        raceCars[5].moveCar(79, 2135);

        /*Output and observe the number of instances created*/
        System.out.println("Midget Car Instances: " + MidgetCar.number);
        System.out.println("Sprint Car Instances: " + SprintCar.number);
    }
}
