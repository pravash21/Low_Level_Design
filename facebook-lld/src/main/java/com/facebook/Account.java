package com.facebook;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Account {
    private String id;
    private String password;
    private AccountStatus status;
    public boolean resetPassword() {
        return true;
    }
}