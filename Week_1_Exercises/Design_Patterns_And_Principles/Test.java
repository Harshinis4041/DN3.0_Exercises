package Strategy_Pattern_Example;

public class Test {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Credit Card payment process
        context.setPaymentStrategy(new CreditCardPayment("4567-5678-9876-5432", "HARSHINI S", "123"));
        context.pay(100.0);

        // PayPal payment process
        context.setPaymentStrategy(new PayPalPayment("harshini@example.com", "password123"));
        context.pay(200.0);

        // Bank Transfer payment process
        context.setPaymentStrategy(new BankTransferPayment("9876543210", "Bank of Baroda"));
        context.pay(300.0);

        // Cryptocurrency payment process
        context.setPaymentStrategy(new CryptoPayment("crypto-wallet-12345"));
        context.pay(400.0);
    }
}
