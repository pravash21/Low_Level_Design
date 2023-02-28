package com.facebook;

import java.util.*;

public class SearchIndex implements Search {
    HashMap<String, List<Member>> memberNames;
    HashMap<String, List<Group>> groupNames;
    HashMap<String, List<Page>> pageTitles;
    HashMap<String, List<Post>> posts;

    public boolean addMember(Member member) {
        if(memberNames.containsKey(member.getName())) {
            memberNames.get(member.getName()).add(member);
        } else {
            memberNames.put(member.getName(), (List<Member>) member);
        }
        return true;
    }

    public boolean addGroup(Group group) {
        return false;
    }

    public boolean addPage(Page page) {
        return false;
    }

    public boolean addPost(Post post) {
        return false;
    }

    public List<Member> searchMamber(String name) {
        return memberNames.get(name);
    }

    @Override
    public List<Member> searchMember(String name) {
        return null;
    }

    public List<Group> searchGroup(String name) {
        return groupNames.get(name);
    }
    public List<Page> searchPage(String title) {
        return pageTitles.get(title);
    }
    public List<Post> searchPost(String word) {
        return posts.get(word);
    }
}
