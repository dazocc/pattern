package br.com.dazo.pattern.gof.creational.builder;

public class SimpleHouseBuilder implements HouseBuilder {

    private House house;

    public SimpleHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildStructure() {
        house.setStructure("Masonry");
        System.out.println("SimpleHouseBuilder: Structure complete...");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Ceramic");
        System.out.println("SimpleHouseBuilder: Roof complete...");
    }

    @Override
    public void buildFurnished() {
        house.setFurnished(false);
        System.out.println("SimpleHouseBuilder: Furnished complete...");
    }

    @Override
    public void buildPainted() {
        house.setPainted(false);
        System.out.println("SimpleHouseBuilder: Painted complete...");
    }

    public House getHouse() {
        System.out.println("SimpleHouseBuilder");
        return this.house;
    }
}
