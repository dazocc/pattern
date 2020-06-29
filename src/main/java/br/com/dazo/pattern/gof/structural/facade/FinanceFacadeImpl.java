package br.com.dazo.pattern.gof.structural.facade;

public class FinanceFacadeImpl implements IFinanceFacade {

    @Override
    public void makePayment(Purchase purchase) {
        PaymentService payment = new PaymentService();
        ShippingService shipping = new ShippingService();

        //dont have payment
        if(!payment.hasPayment()){
            payment.executePayment(purchase);
            System.out.println("Payment confirmed...");
            shipping.shipProducts(purchase);
        }
    }

}
