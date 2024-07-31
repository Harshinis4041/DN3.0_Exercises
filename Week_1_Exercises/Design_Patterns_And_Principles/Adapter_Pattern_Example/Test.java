package AdapterPatternExample;

public class Test {
    public static void main(String[] args) {
        // PayPal test
        PayPalGateway payPalGateway = new PayPalGateway();
        PaymentProcessor payPalAdapter = new PayPalAdapter(payPalGateway);
        payPalAdapter.processPayment(150.0);

        // Stripe test
        StripeGateway stripeGateway = new StripeGateway();
        PaymentProcessor stripeAdapter = new StripeAdapter(stripeGateway);
        stripeAdapter.processPayment(200.0);

        // AuthorizeNet test
        AuthorizeNetGateway authorizeNetGateway = new AuthorizeNetGateway();
        PaymentProcessor authorizeNetAdapter = new AuthorizeNetAdapter(authorizeNetGateway);
        authorizeNetAdapter.processPayment(250.0);

        // Square test
        SquareGateway squareGateway = new SquareGateway();
        PaymentProcessor squareAdapter = new SquareAdapter(squareGateway);
        squareAdapter.processPayment(300.0);
    }
}
