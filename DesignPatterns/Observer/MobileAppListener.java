package Observer;

public record MobileAppListener(String username) implements Listener {

    @Override
    public void update() {

        System.out.println("Sending mobile app push notification to " + username);
    }

}