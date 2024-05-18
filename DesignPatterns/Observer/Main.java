package Observer;

public class Main {


    public static void main(String[] args) {

        Store store = new Store();
        store.getService().subscribe(new EmailMsgListener("xyz123@gmail.com"));
        store.getService().subscribe(new EmailMsgListener("xyz1234@gmail.com"));
        store.getService().subscribe(new EmailMsgListener("xyz12345@gmail.com"));
        store.getService().subscribe(new MobileAppListener("xyz"));

        store.newItemNotify();
        System.out.println("==========================================");
        store.getService().unsubscribe(new EmailMsgListener("xyz1234@gmail.com"));

        store.newItemNotify();
        System.out.println("==========================================");

    }

}