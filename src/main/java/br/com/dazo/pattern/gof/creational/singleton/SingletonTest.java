package br.com.dazo.pattern.gof.creational.singleton;

/*
 * Singleton. Ensures only one instance of an object is created.
 * */
public class SingletonTest {

    public static void main(String[] args) {

        System.out.println("Look for the number of instance, is the same");
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);

        singleton = Singleton.getInstance();
        System.out.println(singleton);
    }
}
