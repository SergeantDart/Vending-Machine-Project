package com.company;

import java.util.HashMap;
import java.util.Map;

public class VendingStorage {

    Map<ProductItem, Integer> storedProductItems;

    public VendingStorage() {
        this.storedProductItems = new HashMap<>();
        storedProductItems.put(new ProductItem("apple", 1.3), 10);
        storedProductItems.put(new ProductItem("chips", 2), 5);
        storedProductItems.put(new ProductItem("chocolate", 3.3), 7);
        storedProductItems.put(new ProductItem("soda", 2.6), 5);
        storedProductItems.put(new ProductItem("water", 0.9), 10);

    }
}
