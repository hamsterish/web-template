package com.hamid.webtemplate.controller;


import com.hamid.webtemplate.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class MainController {

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public ResponseEntity<String> addUser(@RequestBody User user) {
        return new ResponseEntity<>(user.toString(), HttpStatus.OK);
    }

}
