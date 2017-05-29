package com.hamid.webtemplate.model;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class User implements Serializable{
    Long id;
    Title title;
    Gender gender;
    String firstName;
    String lastName;
    ContactMethod contactMethod;
    String email;
}
