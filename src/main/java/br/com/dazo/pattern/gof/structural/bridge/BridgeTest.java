package br.com.dazo.pattern.gof.structural.bridge;

import br.com.dazo.pattern.gof.structural.bridge.message.EmailMessage;
import br.com.dazo.pattern.gof.structural.bridge.message.TextMessage;
import br.com.dazo.pattern.gof.structural.bridge.sender.EmailMessageSender;
import br.com.dazo.pattern.gof.structural.bridge.sender.TextMessageSender;

/**
 * Bridge. Decouples an abstraction so two classes can vary independently.
 */
public class BridgeTest {

    public static void main(String[] args) {
        TextMessageSender textMessageSender = new TextMessageSender();
        TextMessage textMessage = new TextMessage(textMessageSender);
        textMessage.send();

        EmailMessageSender emailMessageSender = new EmailMessageSender();
        EmailMessage emailMessage = new EmailMessage(emailMessageSender);
        emailMessage.send();

    }
}
