package com.hamid.webtemplate.utils;

import com.hamid.webtemplate.model.User;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class UserValidator implements Validator {


    @Override
    public boolean supports(Class<?> aClass)
    {
        return User.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors)
    {
        User user = (User) o;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName", "can't be empty!");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastName", "can't be empty!");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "can't be empty!");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "phoneNumber", "can't be empty!");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "gender", "can't be empty!");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "title", "can't be empty!");
    }
}
