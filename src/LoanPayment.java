public class LoanPayment implements PaymentStrategy {
    private final int numberOfInstallments;

    public LoanPayment(int numberOfInstallments) {
        this.numberOfInstallments = numberOfInstallments;
    }

    @Override
    public void pay(double amount) {
        double installmentAmount = amount / numberOfInstallments;
        System.out.println("Initiating loan payment in " + numberOfInstallments + " installments.");

        for (int i = 1; i <= numberOfInstallments; i++) {
            System.out.println("Paying installment " + i + ": " + installmentAmount);
        }
        System.out.println("Loan payment completed.");
    }
}
