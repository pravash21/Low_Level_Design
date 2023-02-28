package com.facebook;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
public class Work {
    private String title;
    private String company;
    private String location;
    private Date from;
    private Date to;
    private String description;
}
