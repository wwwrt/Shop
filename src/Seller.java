public interface Seller {
    void register();
    void addProduct(Product product);
}

class IndividualSeller implements Seller {
    @Override
    public void register() {
        System.out.println("Individual Seller Registered");
    }

    @Override
    public void addProduct(Product product) {
        System.out.println("Product added by Individual Seller");
    }
}

class CorporateSeller implements Seller {
    @Override
    public void register() {
        System.out.println("Corporate Seller Registered");
    }

    @Override
    public void addProduct(Product product) {
        System.out.println("Product added by Corporate Seller");
    }
}


// aici am folosit Factory pentru că această metodă îmi ofera
// posibilitatea de a crea diferite tipuri de sellers (individual
// corporate) respectând o interfață comună