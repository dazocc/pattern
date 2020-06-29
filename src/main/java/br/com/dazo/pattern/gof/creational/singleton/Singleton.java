package br.com.dazo.pattern.gof.creational.singleton;

public class Singleton {

    private static Singleton instance = null;

    private Singleton(){
    }

    /*THREAD SAFE: WE CAN CHANGE THE METHOD getInstance ADD synchronized*/
    public static Singleton getInstance() {
        if (instance == null){
            instance = new Singleton();
        }

        return instance;
    }
}
