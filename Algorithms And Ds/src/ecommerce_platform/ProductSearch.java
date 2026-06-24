package ecommerce_platform;

import inventory_management.InventoryManagement;
import inventory_management.Product;

import java.util.Collections;
import java.util.List;

public class ProductSearch {
    InventoryManagement inventoryManagement;
    ProductSearch(InventoryManagement inventoryManagement){
        this.inventoryManagement = inventoryManagement;
    }
    public Product linearSearch(int productId){
        List<Product> productList = inventoryManagement.getList();
        for(Product product : productList){
            if(product.getProductId() == productId) {
                return product;
            }
        }
        return null;
    }
    public Product binarySearch(int targetId){
        List<Product> productList = inventoryManagement.getList();
        Collections.sort(productList);
        int n = productList.size();
        int low = 0;
        int high = n - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            int productId = productList.get(mid).getProductId();
            if(productId == targetId){
                return productList.get(mid);
            }else if(productId < targetId){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return null;
    }
}
