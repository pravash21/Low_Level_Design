package stackoverflow.model;

public class Comment extends Entity {
    public Comment(String content, Member owner) {
        super(content, owner);
    }

    @Override
    public String toString() {
        return "Comment{ " +
                " Content= " + super.getContent() +
                " Owner= " + super.getOwner() +
                "}";
    }
}
