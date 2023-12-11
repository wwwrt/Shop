public interface DeliveryHandler {
    void handleDelivery(String location);
    void setNextHandler(DeliveryHandler nextHandler);
}

class LocationDeliveryHandler implements DeliveryHandler {
    private DeliveryHandler nextHandler;

    @Override
    public void setNextHandler(DeliveryHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleDelivery(String location) {
        if ("at a location".equals(location)) {
            System.out.println("Delivering at a specified location");
        } else if (nextHandler != null) {
            nextHandler.handleDelivery(location);
        }
    }
}

class PickupPointDeliveryHandler implements DeliveryHandler {
    private DeliveryHandler nextHandler;

    @Override
    public void setNextHandler(DeliveryHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleDelivery(String location) {
        if ("pickup point".equals(location)) {
            System.out.println("Delivering to a pickup point");
        } else if (nextHandler != null) {
            nextHandler.handleDelivery(location);
        }
    }
}

class InStoreDeliveryHandler implements DeliveryHandler {
    private DeliveryHandler nextHandler;

    @Override
    public void setNextHandler(DeliveryHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleDelivery(String location) {
        if ("in-store".equals(location)) {
            System.out.println("Customer will pick up in-store");
        } else if (nextHandler != null) {
            nextHandler.handleDelivery(location);
        }
    }
}


//aici am folosit un pattern nou, Chain of Responsibility,
//mi se pare mult mai potrivit pentru ce am nevoie aici,
//pentru că acesta permite un lanț de gestionări pentru
//a procesa o cerere și decuplează obiectele expeditor
//și receptor