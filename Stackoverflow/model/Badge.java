package stackoverflow.model;

public class Badge {
    private final String name;

    public Badge(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Badge{" +
                "name='" + name + '\'' +
                '}';
    }
}
