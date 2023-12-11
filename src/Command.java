public interface Command {
    void execute();
}

class AddToCartCommand implements Command {
    private final Cart cart;
    private final Product product;

    public AddToCartCommand(Cart cart, Product product) {
        this.cart = cart;
        this.product = product;
    }

    @Override
    public void execute() {
        cart.addProduct(product);
    }
}

class CompleteOrderCommand implements Command {
    private final Order order;

    public CompleteOrderCommand(Order order) {
        this.order = order;
    }

    @Override
    public void execute() {
        order.complete();
    }
}
