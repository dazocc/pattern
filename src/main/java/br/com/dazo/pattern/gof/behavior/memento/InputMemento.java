package br.com.dazo.pattern.gof.behavior.memento;

public class InputMemento {

    private String text;

    public InputMemento(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
