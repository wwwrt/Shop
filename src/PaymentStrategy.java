public interface PaymentStrategy {
    void pay(double amount);
}

class CashPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " in cash");
    }
}

class CardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " with a card");
    }
}

class LoanPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        // Logic for loan payment
    }
}
