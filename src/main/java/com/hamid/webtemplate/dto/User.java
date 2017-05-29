package com.hamid.webtemplate.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
@ToString
@JsonPropertyOrder({ "id", "title", "gender", "firstName", "lastName", "email", "phoneNumber", "address" })
public class User implements Serializable{
    @JsonIgnore
    Long id;
    @NotNull
    Title title;
    @NotNull
    Gender gender;
    @NotNull
    String firstName;
    @NotNull
    String lastName;
    @NotNull
    String phoneNumber;
    @NotNull
    String email;
    @NotNull
    Address address;
}
