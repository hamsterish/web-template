package com.hamid.webtemplate.controller;


import com.hamid.webtemplate.dto.User;
import com.hamid.webtemplate.utils.UserValidator;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
public class MainController {

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.setValidator(new UserValidator());
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public ResponseEntity<String> addUser(@Valid @RequestBody User user) {
        return new ResponseEntity<>(user.toString(), HttpStatus.OK);
    }

}
