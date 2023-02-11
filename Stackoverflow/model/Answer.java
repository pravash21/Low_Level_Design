package stackoverflow.model;

import java.util.ArrayList;
import java.util.List;

public class Answer extends Entity {
    private final List<Comment> comments;

    public Answer(String content, Member owner) {
        super(content, owner);
        this.comments = new ArrayList<>();
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void addComment(Comment comment) {
        this.comments.add(comment);
    }

    @Override
    public String toString() {
        return "Answer{" +
                ", Content= " + super.getContent() +
                ", comments=" + comments +
                ", owner=" + super.getOwner() +
                '}';
    }
}
