package br.com.dazo.pattern.gof.behavior.memento;

import java.util.ArrayDeque;
import java.util.Deque;

public class InputCaretaker {

    private Deque<InputMemento> mementos = new ArrayDeque<>();

    public InputMemento getMemento(){
        if(!mementos.isEmpty()){
            return mementos.pop();
        }else{
            return null;
        }
    }

    public void addMemento(InputMemento inputMemento){
        mementos.push(inputMemento);
    }

}
