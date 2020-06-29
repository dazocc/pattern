package br.com.dazo.pattern.gof.structural.facade;

public class PaymentController {

    //Must inject FinanceFacadeImpl
    private IFinanceFacade iFinanceFacade = new FinanceFacadeImpl();

    public void makePayment(Purchase purchase){
        System.out.println("Call Facade");
        iFinanceFacade.makePayment(purchase);
    }

}
