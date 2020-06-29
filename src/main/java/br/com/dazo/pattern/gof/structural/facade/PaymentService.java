package br.com.dazo.pattern.gof.structural.facade;

public class PaymentService {

    public boolean hasPayment(){
        return false;
    }

    public void executePayment(Purchase purchase) {
        System.out.println("Do stuffs for payment");
    }

}
