public interface Observer {
    void update(String message);
}

class Client implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Notification for client: " + message);
    }
}
