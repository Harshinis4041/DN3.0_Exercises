package AdapterPatternExample;

public class SquareGateway {
    public void makePayment(double amount) {
        System.out.println("Completed payment of $" + amount + " using Square.");
    }
}
