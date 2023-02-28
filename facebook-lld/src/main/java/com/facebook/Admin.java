package com.facebook;

public class Admin extends Person {
    public boolean blockUser(Member customer) {
        return true;
    }
    public boolean unblockUser(Member customer) {
        return true;
    }
    public boolean enablePage(Page page) {
        return true;
    }
    public boolean disablePage(Page page) {
        return true;
    }
}
