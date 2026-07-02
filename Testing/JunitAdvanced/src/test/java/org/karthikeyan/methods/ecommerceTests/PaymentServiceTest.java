package org.karthikeyan.methods.ecommerceTests;

import org.junit.jupiter.api.Test;
import org.karthikeyan.methods.ecommerce.PaymentService;

import static org.junit.jupiter.api.Assertions.*;

public class PaymentServiceTest {
    PaymentService paymentService = new PaymentService();

    @Test
    public void validInputs(){
        String cardNumber = "1234567891011123";
        double amount = 100.0;
        assertTrue(paymentService.processPayment(amount, cardNumber));
    }

    @Test
    public void validCardNumberInvalidAmount(){
        String cardNumber = "1234567891011123";
        double amount = 0.0;
        assertFalse(paymentService.processPayment(amount,    cardNumber));
    }

    @Test
    public void invalidCardNumberValidAmount(){
        String cardNumber = "12345";
        double amount = 100.0;
        assertFalse(paymentService.processPayment(amount, cardNumber));
    }

}
