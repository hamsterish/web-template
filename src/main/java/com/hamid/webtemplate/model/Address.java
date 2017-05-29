package com.hamid.webtemplate.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {
    Long id;
    String firstLine;
    String secondLine;
    String city;
    String country;
    String postCode;

}
