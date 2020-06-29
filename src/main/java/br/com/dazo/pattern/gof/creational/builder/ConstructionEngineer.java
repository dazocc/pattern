package br.com.dazo.pattern.gof.creational.builder;

public class ConstructionEngineer {

    private HouseBuilder houseBuilder;

    public ConstructionEngineer(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }

    public House constructHouse() {

        this.houseBuilder.buildStructure();
        this.houseBuilder.buildRoof();
        this.houseBuilder.buildFurnished();
        this.houseBuilder.buildPainted();

        return this.houseBuilder.getHouse();
    }
}
