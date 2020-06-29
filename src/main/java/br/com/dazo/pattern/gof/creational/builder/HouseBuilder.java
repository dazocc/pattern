package br.com.dazo.pattern.gof.creational.builder;

public interface HouseBuilder {

    void buildStructure();

    void buildRoof();

    void buildFurnished();

    void buildPainted();

    House getHouse();
}
