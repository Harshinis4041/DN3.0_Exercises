package Inventory_Management_System;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<Integer, InventoryProduct> productMap = new HashMap<>();

    public void addProduct(InventoryProduct product) {
        productMap.put(product.getProductId(), product);
    }

    public void updateProduct(InventoryProduct product) {
        if (productMap.containsKey(product.getProductId())) {
            productMap.put(product.getProductId(), product);
        } else {
            System.out.println("Product not found!");
        }
    }

    public void deleteProduct(int productId) {
        if (productMap.containsKey(productId)) {
            productMap.remove(productId);
        } else {
            System.out.println("Product not found!");
        }
    }

    public InventoryProduct getProduct(int productId) {
        return productMap.get(productId);
    }

    public void displayProducts() {
        for (InventoryProduct product : productMap.values()) {
            System.out.println(product);
        }
    }
}
