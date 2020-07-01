package br.com.dazo.pattern.gof.structural.bridge.message;

import br.com.dazo.pattern.gof.structural.bridge.sender.MessageSender;

public class EmailMessage extends Message {

    public EmailMessage(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void send() {
        getMessageSender().sendMessage();
    }
}
