package design_patterns.adapter;

import design_patterns.adapter.adaptee_class.CardPaymentGateway;
import design_patterns.adapter.adaptee_class.UPIPaymentGateway;
import design_patterns.adapter.adapter_class.GatewayAdapter;

public class Test {
    public static void main(String[] args) {
        GatewayAdapter gatewayAdapter = new GatewayAdapter(new UPIPaymentGateway());
        gatewayAdapter.processPayment();
        gatewayAdapter = new GatewayAdapter(new CardPaymentGateway());
        gatewayAdapter.processPayment();
    }
}
