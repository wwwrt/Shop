public class Main {
    public static void main(String[] args) {
        //Singleton
        EShopPlatform eShop = EShopPlatform.getInstance();

        //Factory
        Seller individualSeller = new IndividualSeller();
        Seller corporateSeller = new CorporateSeller();

        //înregistrare sellers
        individualSeller.register();
        corporateSeller.register();

        //products
        Product laptop = new Product("Laptop", "Electronics", 10, 1200.0);
        individualSeller.addProduct(laptop);

        Product smartphone = new Product("Smartphone", "Electronics", 20, 800.0);
        corporateSeller.addProduct(smartphone);

        //Observer
        Observer client = new Client();

        //decorator - promoții
        Promotion discountPromotion = new DiscountPromotion(10);
        double discountedPrice = discountPromotion.apply(laptop.getPrice());
        System.out.println("Discounted Price: " + discountedPrice);

        //Strategy
        PaymentStrategy cashPayment = new CashPayment();
        PaymentStrategy cardPayment = new CardPayment();
        PaymentStrategy loanPayment = new LoanPayment();

        //Command
        Cart cart = new Cart();
        Command addToCartCommand = new AddToCartCommand(cart, laptop);
        addToCartCommand.execute();

        //adăugare produse
        Product tablet = new Product("Tablet", "Electronics", 15, 500.0);
        Command addToCartTabletCommand = new AddToCartCommand(cart, tablet);
        addToCartTabletCommand.execute();

        //vizualizare cart
        System.out.println("Cart Contents:");
        cart.viewCart();

        //modificări cart
        System.out.println("Updated Cart Contents:");
        cart.viewCart();

        //State
        Order order = new Order();
        order.setState(new ShippedState());
        order.complete();

        //calculează și afișează totalul cart-ului
        double totalPrice = cart.calculateTotal();
        System.out.println("Total Price in Cart: " + totalPrice);

        //golește cart-ul
        cart.clearCart();

        //cart gol
        System.out.println("Cart Contents After Clearing:");
        cart.viewCart();

        //Chain of Responsibility - opțiuni de livrare
        DeliveryHandler locationHandler = new LocationDeliveryHandler();
        DeliveryHandler pickupPointHandler = new PickupPointDeliveryHandler();
        DeliveryHandler inStoreHandler = new InStoreDeliveryHandler();

        locationHandler.setNextHandler(pickupPointHandler);
        pickupPointHandler.setNextHandler(inStoreHandler);

        //simulare în diferite locații
        locationHandler.handleDelivery("at a location");
        locationHandler.handleDelivery("pickup point");
        locationHandler.handleDelivery("in-store");
        locationHandler.handleDelivery("unknown location");
    }
}
