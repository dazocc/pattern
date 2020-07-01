package br.com.dazo.pattern.gof.structural.bridge.message;

import br.com.dazo.pattern.gof.structural.bridge.sender.MessageSender;

public class TextMessage extends Message {

    public TextMessage(MessageSender messageSender){
        super(messageSender);
    }

    @Override
    public void send() {
        getMessageSender().sendMessage();
    }
}
