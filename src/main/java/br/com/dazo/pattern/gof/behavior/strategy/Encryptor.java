package br.com.dazo.pattern.gof.behavior.strategy;

public class Encryptor {

    private Encryption strategy;
    private String text;

    public Encryptor(Encryption strategy) {
        this.strategy = strategy;
    }

    public void encrypt(String text){
        strategy.encrypt(text);
    }
}
