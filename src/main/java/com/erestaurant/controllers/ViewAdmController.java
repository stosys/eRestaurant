package com.erestaurant.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 */
@Controller
@RequestMapping(Links.VIEWADMCR)

public class ViewAdmController {
    @RequestMapping(method = RequestMethod.GET)
    public String getIndex(){
        return "Admin/AdminVew";
    }

}
