package Strategy_Pattern_Example;

public class BankTransferPayment implements PaymentStrategy {
    private String bankAccountNumber;
    private String bankName;

    public BankTransferPayment(String bankAccountNumber, String bankName) {
        this.bankAccountNumber = bankAccountNumber;
        this.bankName = bankName;
    }

    @Override
    public void pay(double amount) {
        System.out.println("The amount has been successfully paid " + amount + " using Bank Transfer.");
    }
}
