package com.facebook;

import java.util.List;

public interface Search {
    public List<Member> searchMember(String name);
    public List<Group> searchGroup(String name);
    public List<Page> searchPage(String name);
    public List<Post> searchPost(String word);
}
