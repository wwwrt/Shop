public interface Command {
    void execute();
}

class AddToCartCommand implements Command {
    private Cart cart;
    private Product product;

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
    private Order order;

    public CompleteOrderCommand(Order order) {
        this.order = order;
    }

    @Override
    public void execute() {
        order.complete();
    }
}
