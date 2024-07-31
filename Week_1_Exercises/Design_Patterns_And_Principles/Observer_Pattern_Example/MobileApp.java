package Observer_Pattern_Example;

public class MobileApp implements Observer {
    private StockMarket stockMarket;

    public MobileApp(StockMarket stockMarket) {
        this.stockMarket = stockMarket;
        stockMarket.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Stock price updated in the Mobile App is " + stockMarket.getStockPrice());
    }
}
