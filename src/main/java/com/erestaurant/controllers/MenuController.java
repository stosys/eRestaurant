package com.erestaurant.controllers;

import com.erestaurant.models.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.erestaurant.services.MenuService;

import javax.annotation.Resource;

/**
 *
 */

@Controller
@RequestMapping(Links.MENUCR)
public class MenuController {

    @RequestMapping(method = RequestMethod.GET)
    public String getIndex()
    {
        return "Admin/AddToMenu";
    }

    @Autowired
    MenuService menuService;
    private boolean ok = false;

    @RequestMapping(method = RequestMethod.POST)
    public String getIndex(@RequestBody Menu menu){
        if(menuService.validate(menu))
            return "Menu/MenuPop";
        return "Invalid ID or ...";
    }
}
