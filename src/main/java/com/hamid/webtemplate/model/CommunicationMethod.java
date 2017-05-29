package com.hamid.webtemplate.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class CommunicationMethod implements Serializable{
    Long id;
    CommunicationMethodType communicationMethodType;
    String value;
}
