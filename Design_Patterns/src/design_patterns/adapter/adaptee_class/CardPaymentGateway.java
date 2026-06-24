package design_patterns.adapter.adaptee_class;

public class CardPaymentGateway implements Gateway{
    @Override
    public void pay(){
        System.out.println("Payment via Card");
    }
}
