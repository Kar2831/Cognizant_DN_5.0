package org.karthikeyan.methods.ecommerce;

import java.util.List;

public class InventoryService {
    public boolean isItemInStock(List<String> items, String item){
        if(item == null || item.isEmpty()){
            return false;
        }
        String matchingItem = items.stream().filter(str -> str.equals(item)).findFirst().orElse(null);
        return matchingItem != null;
    }
}
