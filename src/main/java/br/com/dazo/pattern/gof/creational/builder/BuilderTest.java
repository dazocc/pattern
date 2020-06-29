package br.com.dazo.pattern.gof.creational.builder;

/*
 * Builder. Uses to create complex objects.
 * */
public class BuilderTest {

    public static void main(String[] args) {
        mountSimple();

        mountLux();
    }

    private static void mountSimple() {
        HouseBuilder simpleHouseBuilder = new SimpleHouseBuilder();
        ConstructionEngineer engineerA = new ConstructionEngineer(simpleHouseBuilder);
        House houseA = engineerA.constructHouse();
        System.out.println("House is: " + houseA);
    }

    private static void mountLux() {
        HouseBuilder luxHouseBuilder = new LuxHouseBuilder();
        ConstructionEngineer engineerB = new ConstructionEngineer(luxHouseBuilder);
        House houseB = engineerB.constructHouse();
        System.out.println("House is: " + houseB);
    }
}
