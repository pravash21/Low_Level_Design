package com.facebook;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
    private String country;

}
