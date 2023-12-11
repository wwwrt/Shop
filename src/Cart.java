import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added to the cart: " + product.getName());
    }

    public void removeProduct(Product product) {
        products.remove(product);
        System.out.println("Product removed from the cart: " + product.getName());
    }

    public void viewCart() {
        System.out.println("Products in the cart:");
        for (Product product : products) {
            System.out.println("- " + product.getName() + " | Price: " + product.getPrice());
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public void clearCart() {
        products.clear();
        System.out.println("Cart cleared.");
    }
}
