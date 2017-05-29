package com.hamid.webtemplate.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Address implements Serializable{
    Long id;
    String firstLine;
    String secondLine;
    String city;
    String country;
    String postCode;

}
