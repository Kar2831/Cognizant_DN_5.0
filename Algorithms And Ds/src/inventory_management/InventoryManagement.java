package inventory_management;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InventoryManagement {
    private List<Product> list;
    public InventoryManagement(List<Product> list){
        this.list = list;
    }
    public void addProduct(Product product){
        Product existingProduct = list.stream().filter(p -> p.getProductId() == product.getProductId()).findFirst().orElse(null);
        if(existingProduct == null)
            list.add(product);
        else
            System.out.println("Product Already Exists");
        Collections.sort(list);
    }

    public void update(int productId, Product product){
        Product existingProduct = list.stream().
                filter(p -> p.getProductId() == productId).
                findFirst().
                orElse(null);
        if(existingProduct != null){
            existingProduct.setProductId(product.getProductId());
            existingProduct.setProductName(product.getProductName());
            existingProduct.setQuantity(product.getQuantity());
            existingProduct.setPrice(product.getPrice());
        }else{
            System.out.println("No product exists with product ID: " + productId);
        }
    }

    public void remove(int productId){
        Product existingProduct = list.stream().filter(p -> p.getProductId() == productId).findFirst().orElse(null);
        boolean isRemoved = existingProduct != null && list.remove(existingProduct);
        if(isRemoved){
            System.out.println("Product with Product ID " + productId + " is removed successfully");
        }else{
            System.out.println("Product with Product ID " + productId + " is not found");
        }
    }

    public List<Product> getList(){
        return list;
    }

}
