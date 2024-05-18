package Observer;

public class Store {

    private final NotificationService notificationService;

    public Store() {
        notificationService = new NotificationService();
    }

    public void newItemNotify() {
        notificationService.notifyCustomers();
    }



    public NotificationService getService() {
        return notificationService;
    }

}