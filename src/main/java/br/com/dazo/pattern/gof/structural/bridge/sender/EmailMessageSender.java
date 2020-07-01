package br.com.dazo.pattern.gof.structural.bridge.sender;

public class EmailMessageSender implements MessageSender {

    @Override
    public void sendMessage() {
        System.out.println("Send email!!!");
    }
}
