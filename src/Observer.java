public interface Observer {
    void update(String message);
}

class Client implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Notification for client: " + message);
    }
}

//am folosit Observer deoarece în felul acesta clienții
// pot fi notificați în legătură cu produsele de care sunt interesați