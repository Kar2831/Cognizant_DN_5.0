package org.karthikeyan.methods.ecommerceTests;

import org.junit.jupiter.api.Test;
import org.karthikeyan.methods.ecommerce.InventoryService;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class InventoryServiceTest {

    InventoryService inventoryService = new InventoryService();

    @Test
    public void itemInStock(){
        List<String> items = Arrays.asList("PROD-101", "PROD-102", "PROD-103");
        assertTrue(inventoryService.isItemInStock(items, "PROD-101"));
    }

    @Test
    public void itemNotInStock(){
        List<String> items = Arrays.asList("PROD-101", "PROD-102", "PROD-103");
        assertFalse(inventoryService.isItemInStock(items, "PROD-104"));
    }

}
