package Ecommerce_Platform_Search;

import java.util.Arrays;

public class SearchUtil {

    // Linear Search 
    public static ProductItem linearSearch(ProductItem[] products, int searchId) {
        for (ProductItem product : products) {
            if (product.getProductId() == searchId) {
                return product;
            }
        }
        return null;
    }

    // Binary Search
    public static ProductItem binarySearch(ProductItem[] products, int searchId) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (products[mid].getProductId() == searchId) {
                return products[mid];
            } else if (products[mid].getProductId() < searchId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
}
