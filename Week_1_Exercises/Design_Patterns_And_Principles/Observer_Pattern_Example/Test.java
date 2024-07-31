package Observer_Pattern_Example;

public class Test {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();
        
        // Create observers
        MobileApp mobileApp = new MobileApp(stockMarket);
        WebApp webApp = new WebApp(stockMarket);

        // Set stock prices and notify observers
        System.out.println("Setting stock price to 100.0");
        stockMarket.setStockPrice(100.0);

        // Wait to see asynchronous updates
        try {
            Thread.sleep(2000);  // Sleep to allow asynchronous updates to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Setting stock price to 105.0");
        stockMarket.setStockPrice(105.0);

        // Wait to see asynchronous updates
        try {
            Thread.sleep(2000);  // Sleep to allow asynchronous updates to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
