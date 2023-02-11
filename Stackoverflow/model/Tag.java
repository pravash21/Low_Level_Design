package stackoverflow.model;

import java.util.UUID;

public class Tag {
    private final String tagId;
    private final String tag;

    public Tag(String tag) {
        this.tagId = UUID.randomUUID().toString();
        this.tag = tag;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "tagId='" + tagId + '\'' +
                ", tag='" + tag + '\'' +
                '}';
    }
}
