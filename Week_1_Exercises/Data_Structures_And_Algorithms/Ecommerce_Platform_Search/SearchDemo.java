package Ecommerce_Platform_Search;

import java.util.Arrays;

public class SearchDemo {
    public static void main(String[] args) {
        // Array of Product Item
        ProductItem[] products = {
            new ProductItem(1, "Laptop", "Electronics"),
            new ProductItem(2, "Speakers", "Electronics"),
            new ProductItem(3, "Coffee Maker", "Home Appliances")
        };

        // Sorting using Binary search
        Arrays.sort(products, (p1, p2) -> Integer.compare(p1.getProductId(), p2.getProductId()));

        // Demonstrating the Linear Search
        System.out.println("Linear Search:");
        ProductItem foundProductLinear = SearchUtil.linearSearch(products, 2);
        System.out.println(foundProductLinear != null ? foundProductLinear : "Product not found");

        // Demonstrating the Binary Search
        System.out.println("\nBinary Search:");
        ProductItem foundProductBinary = SearchUtil.binarySearch(products, 2);
        System.out.println(foundProductBinary != null ? foundProductBinary : "Product not found");
    }
}
