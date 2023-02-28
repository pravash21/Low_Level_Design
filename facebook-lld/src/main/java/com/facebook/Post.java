package com.facebook;

import java.util.List;

public class Post {
    private Integer postId;
    private String text;
    private int totalLikes;
    private int totalShares;
    private Member owner;
    private List<Comment> commentList;
}

