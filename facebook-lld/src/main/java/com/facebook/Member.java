package com.facebook;

import java.util.*;

public class Member extends Person {
    private Integer memberId;
    private Date dateOfMembership;
    private String name;
    private Profile profile;
    private HashSet<Integer> memberFollows;
    private HashSet<Integer> memberConnections;
    private HashSet<Integer> pageFollows;
    private HashSet<Integer> memberSuggestions;
    private HashSet<ConnectionInvitation> connectionInvitations;
    private HashSet<Integer> groupFollows;
    public boolean sendMessage(Message message) {
        return true;
    }
    public boolean createPost(Post post) {
        return true;
    }
    public boolean sendConnectionInvitation(ConnectionInvitation invitation) {
        return true;
    }
}

