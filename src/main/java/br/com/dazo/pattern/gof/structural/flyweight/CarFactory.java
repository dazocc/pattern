package br.com.dazo.pattern.gof.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CarFactory {

    private static Map<CarType, RaceCar> flyweights = new HashMap<>();

    public static RaceCar getRaceCar(CarType key) {

        if(flyweights.containsKey(key)){
            return flyweights.get(key);
        }

        flyweights.put(key, key.getRaceCar());

        return key.getRaceCar();
    }
}
