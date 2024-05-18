package Observer;

import java.util.*;

public class NotificationService {

    private final List<Listener> customers;

    public NotificationService() {
        customers = new ArrayList<Listener>();
    }

    public void subscribe(Listener listener) {
        customers.add(listener);
    }

    public void unsubscribe(Listener listener) {
        customers.remove(listener);
    }

    public void notifyCustomers() {
        customers.forEach(listener -> listener.update());
    }

}