public class Order {
    private OrderState state;

    public void complete() {
        state.handle();
    }

    public void setState(OrderState state) {
        this.state = state;
    }
}
