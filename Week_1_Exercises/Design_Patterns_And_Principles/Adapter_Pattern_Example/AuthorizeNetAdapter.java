package AdapterPatternExample;

public class AuthorizeNetAdapter implements PaymentProcessor {
    private AuthorizeNetGateway authorizeNetGateway;

    public AuthorizeNetAdapter(AuthorizeNetGateway authorizeNetGateway) {
        this.authorizeNetGateway = authorizeNetGateway;
    }

    @Override
    public void processPayment(double amount) {
        authorizeNetGateway.processTransaction(amount);
    }
}
