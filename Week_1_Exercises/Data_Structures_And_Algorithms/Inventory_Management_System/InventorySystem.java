package Inventory_Management_System;

public class InventorySystem {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        
        // Addition
        inventory.addProduct(new InventoryProduct(1, "Desktop", 10, 799.99));
        inventory.addProduct(new InventoryProduct(2, "Speakers", 20, 399.99));
        
        // Displaying
        System.out.println("Total List of Products:");
        inventory.displayProducts();
        
        // Update a product
        inventory.updateProduct(new InventoryProduct(1, "Desktop", 15, 749.99));
        
        // Retrieve and display updated product
        System.out.println("\nProducts after Updation:");
        System.out.println(inventory.getProduct(1));
        
        // Deletion
        inventory.deleteProduct(2);
        
        // Display products after deletion
        System.out.println("\nProducts after deletion:");
        inventory.displayProducts();
    }
}
