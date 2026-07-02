package org.karthikeyan.methods.ecommerce;

public class PaymentService {
    public boolean processPayment(double amount, String cardNumber){
        return cardNumber.length() == 16 && amount > 0;
    }
}
