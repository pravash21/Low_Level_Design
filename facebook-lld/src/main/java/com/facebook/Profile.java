package com.facebook;

import java.util.List;

public class Profile {
    private byte[] profilePicture;
    private byte[] coverPhoto;
    private String gender;
    private List<Work> workExperiences;


    public boolean addWorkExperience(Work work) {
        return true;
    }
}
