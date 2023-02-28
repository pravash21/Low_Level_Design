package com.facebook;

import java.util.List;

public class Group {
    private Integer groupId;
    private String name;
    private String description;
    private int totalMembers;
    private List<Member> members;
    public boolean addMember(Member member) {
        return true;
    }
    public boolean updateDescription(String description) {
        return true;
    }

}
