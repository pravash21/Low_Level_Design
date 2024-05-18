package builder;

public class Client {
    public static void main(String args[]) {
        User user = User.getBuilder()
                .setName("Raman")
                .setAge(19)
                .build();
        System.out.println("object created");
        System.out.println(user);
    }
}
