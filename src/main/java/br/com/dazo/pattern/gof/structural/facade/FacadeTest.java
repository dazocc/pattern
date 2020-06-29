package br.com.dazo.pattern.gof.structural.facade;

/*
* Facade. Provides a simple interface to a more complex underlying object.
* */
public class FacadeTest {

    public static void main(String[] args) {
        PaymentController paymentController = new PaymentController();

        System.out.println("Execute payment in front end or anything else");
        paymentController.makePayment(new Purchase());
    }
}
