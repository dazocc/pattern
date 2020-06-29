package br.com.dazo.pattern.gof.behavior.memento;

public class Input {
    private String text;

    public Input(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public InputMemento saveToMemento() {
        InputMemento empMemento =new InputMemento(text);
        return empMemento;
    }

    public  void restoreFromMemento(InputMemento inputMemento) {
        this.text = inputMemento.getText();
    }
}
