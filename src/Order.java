public class Order {
    private OrderState state;

    public void complete() {
        if (state != null) {
            state.handle();
        } else {
            System.out.println("Order is in an invalid state.");
        }
    }

    public void setState(OrderState state) {
        this.state = state;
    }
}
