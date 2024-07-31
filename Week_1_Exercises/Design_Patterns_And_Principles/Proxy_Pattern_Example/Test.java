package ProxyPatternExample;

public class Test {
    public static void main(String[] args) {
        
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        // Testing image1: Should load and display the image
        System.out.println("Testing image1:");
        image1.display();
        System.out.println();

        // Testing image1 again: Should display from cache
        System.out.println("Testing image1 again:");
        image1.display();
        System.out.println();

        // Testing image2: Should load and display the image
        System.out.println("Testing image2:");
        image2.display();
        System.out.println();

        // Testing image2 again: Should display from cache
        System.out.println("Testing image2 again:");
        image2.display();
        System.out.println();
        
        // Additional Testing: Check error handling and logging
        System.out.println("Additional Testing: Error Handling and Logging");

        // Test with a simulated error (uncomment if you want to test error handling)
        // Image faultyImage = new ProxyImage("faulty_image.jpg");
        // faultyImage.display();
    }
}
