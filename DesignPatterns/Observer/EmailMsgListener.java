package Observer;

public record EmailMsgListener(String email) implements Listener {

    @Override
    public void update() {

        System.out.println("Sending mail to " + email);
    }

}
