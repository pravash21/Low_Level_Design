package com.facebook;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Person extends Account{
    private String name;
    private Address address;
    private String email;
    private String phone;
    private Account account;
}
