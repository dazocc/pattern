package br.com.dazo.pattern.gof.behavior.memento;

/*
 * Memento. Provides the ability to restore an object to its previous state.
 * */
public class MementoTest {

    public static void main(String[] args) {
        InputCaretaker inputCaretaker = new InputCaretaker();

        Input input = new Input("Any string");

        InputMemento inputMemento = input.saveToMemento();
        inputCaretaker.addMemento(inputMemento);

        input.setText("Other string");
        inputMemento = input.saveToMemento();
        inputCaretaker.addMemento(inputMemento);

        input.setText("Another string");

        //Print all mementos
        InputMemento memento = null;

        do {
            System.out.println(input.getText());
            memento = inputCaretaker.getMemento();
            if(memento != null){
                input.restoreFromMemento(memento);
            }
        } while (memento != null);

    }
}
