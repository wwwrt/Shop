public interface DeliveryHandler {
    void handleDelivery(String location);
}

class LocationDeliveryHandler implements DeliveryHandler {
    private DeliveryHandler nextHandler;

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
