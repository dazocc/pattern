package br.com.dazo.pattern.gof.creational.builder;

public class LuxHouseBuilder implements HouseBuilder {

    private House house;

    public LuxHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildStructure() {
        house.setStructure("Wood");
        System.out.println("LuxHouseBuilder: Structure complete...");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Glass");
        System.out.println("LuxHouseBuilder: Roof complete...");
    }

    @Override
    public void buildFurnished() {
        house.setFurnished(true);
        System.out.println("LuxHouseBuilder: Furnished complete...");
    }

    @Override
    public void buildPainted() {
        house.setPainted(true);
        System.out.println("LuxHouseBuilder: Painted complete...");
    }

    public House getHouse() {
        System.out.println("LuxHouseBuilder");
        return this.house;
    }
}
