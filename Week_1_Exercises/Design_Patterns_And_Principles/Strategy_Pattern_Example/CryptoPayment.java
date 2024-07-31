package Strategy_Pattern_Example;


public class CryptoPayment implements PaymentStrategy {
    private String cryptoWalletAddress;

    public CryptoPayment(String cryptoWalletAddress) {
        this.cryptoWalletAddress = cryptoWalletAddress;
    }

    @Override
    public void pay(double amount) {
        System.out.println("The amount has been successfully paid " + amount + " using Cryptocurrency.");
    }
}
