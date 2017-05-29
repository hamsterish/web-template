package com.hamid.webtemplate.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContactMethod {
    Long id;
    User user;
    ContactMethodType contactMethod;
}
