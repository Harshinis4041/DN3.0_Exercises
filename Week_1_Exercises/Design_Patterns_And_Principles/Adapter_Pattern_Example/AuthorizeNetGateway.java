package AdapterPatternExample;

public class AuthorizeNetGateway {
    public void processTransaction(double amount) {
        System.out.println("Transaction of $" + amount + " which is being processed using AuthorizeNet.");
    }
}
