package org.karthikeyan.methods.ecommerce;

import java.util.List;
import java.util.ListIterator;

public class CartService {
    public double calculateTotal(List<Double> list){
        ListIterator<Double> it = list.listIterator();
        double total = 0.0;
        while(it.hasNext()){
           total += it.next();
        }
        if(total > 100){
            total = total * 0.9;
        }
        return total;
    }
}
