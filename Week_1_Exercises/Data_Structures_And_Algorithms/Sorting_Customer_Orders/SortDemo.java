package Sorting_Customer_Orders;

import java.util.Arrays;

public class SortDemo {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(1, "A", 250.50),
            new Order(2, "B", 150.75),
            new Order(3, "C", 320.00)
        };

        // Demonstrate Bubble Sort
        System.out.println("Bubble Sort:");
        BubbleSort.bubbleSort(orders);
        System.out.println(Arrays.toString(orders));

        // Reset the array
        orders = new Order[] {
            new Order(1, "A", 250.50),
            new Order(2, "B", 150.75),
            new Order(3, "C", 320.00)
        };

        // Demonstrate Quick Sort
        System.out.println("\nQuick Sort:");
        QuickSort.quickSort(orders, 0, orders.length - 1);
        System.out.println(Arrays.toString(orders));
    }
}
