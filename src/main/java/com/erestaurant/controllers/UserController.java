package com.erestaurant.controllers;

import com.erestaurant.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.erestaurant.services.UserService;

/**
 *
 */
@Controller
@RequestMapping(Links.USERCR)
public class UserController {

    @RequestMapping(method = RequestMethod.GET)
    public String getIndex(){
        return "Employee/AddUser";
    }

    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.POST)
    public String createAcc(@RequestBody User user){
        if(userService.validate(user))
            return "Usercr/UserPop";
        return "Invalid ID or ...";
    }
}


