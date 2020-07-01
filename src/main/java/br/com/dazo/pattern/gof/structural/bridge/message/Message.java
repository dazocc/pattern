package br.com.dazo.pattern.gof.structural.bridge.message;

import br.com.dazo.pattern.gof.structural.bridge.sender.MessageSender;

public abstract class Message {

    private MessageSender messageSender;

    public Message(MessageSender messageSender){
        this.messageSender = messageSender;
    }

    abstract public void send();

    public MessageSender getMessageSender() {
        return messageSender;
    }

    public void setMessageSender(MessageSender messageSender) {
        this.messageSender = messageSender;
    }
}
