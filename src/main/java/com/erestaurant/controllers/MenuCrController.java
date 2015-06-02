package com.erestaurant.controllers;

import com.erestaurant.models.Menu;
import com.erestaurant.services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 */
@Controller
@RequestMapping(Links.MENUC)
public class MenuCrController {
    @Autowired
    private MenuService menuService;

    @RequestMapping(method = RequestMethod.GET)
    public String getIndex()
    {
        return "Admin/AddToMenu";
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @ResponseBody
    public long creareMenu(@ModelAttribute Menu menu){
         menuService.create(menu);
        return menu.getIDm();
    }


}
