package design_patterns.adapter.adapter_class;

import design_patterns.adapter.adaptee_class.Gateway;
import design_patterns.adapter.target_interface.PaymentProcessor;

public class GatewayAdapter implements PaymentProcessor {
    Gateway gateway;
    public GatewayAdapter(Gateway gateway){
        this.gateway = gateway;
    }
    public void processPayment(){
        gateway.pay();
    }
}
