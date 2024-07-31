package AdapterPatternExample;

public class PayPalGateway {
    public void makePayment(double amount) {
        System.out.println("Payment of $" + amount + " is processed using PayPal.");
    }
}
