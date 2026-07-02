package org.karthikeyan.methods.ecommerceTests;

import org.junit.jupiter.api.Test;
import org.karthikeyan.methods.ecommerce.CartService;

import java.util.Arrays;
import java.util.List;

public class CartServiceTest {
    CartService cartService = new CartService();

    @Test
    public void withoutDiscount(){
        List<Double> prices = Arrays.asList(20.0, 30.0);
        cartService.calculateTotal(prices);
    }

    @Test
    public void withDiscount(){
        List<Double> prices = Arrays.asList(80.0, 40.0);
        cartService.calculateTotal(prices);
    }
}
