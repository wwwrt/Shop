public interface OrderState {
    void handle();
}

class ProcessingState implements OrderState {
    @Override
    public void handle() {
        System.out.println("Order is being processed");
    }
}

class ShippedState implements OrderState {
    @Override
    public void handle() {
        System.out.println("Order has been shipped");
    }
}

class DeliveredState implements OrderState {
    @Override
    public void handle() {
        System.out.println("Order has been delivered");
    }
}
