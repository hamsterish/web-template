package com.hamid.webtemplate.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class User implements Serializable{
    Long id;
    Title title;
    Gender gender;
    String firstName;
    String lastName;
    String phoneNumber;
    String email;
}
