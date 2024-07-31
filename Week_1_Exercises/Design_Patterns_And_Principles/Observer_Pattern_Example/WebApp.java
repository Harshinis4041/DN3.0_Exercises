package Observer_Pattern_Example;

// Implementing the Observer interface
public class WebApp implements Observer {
    private StockMarket stockMarket;

    // Constructor to register WebApp as an observer
    public WebApp(StockMarket stockMarket) {
        this.stockMarket = stockMarket;
        stockMarket.registerObserver(this);  // Register this WebApp instance with the StockMarket
    }

    // Method called when the stock price changes
    @Override
    public void update() {
        // Print the updated stock price to the console
        System.out.println("Stock price updated in the Web App is " + stockMarket.getStockPrice());
    }
}
