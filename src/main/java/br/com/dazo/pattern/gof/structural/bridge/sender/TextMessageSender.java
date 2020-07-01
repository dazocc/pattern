package br.com.dazo.pattern.gof.structural.bridge.sender;

public class TextMessageSender implements MessageSender {

    @Override
    public void sendMessage() {
        System.out.println("Send text!!");
    }
}
