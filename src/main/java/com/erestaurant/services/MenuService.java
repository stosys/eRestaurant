package com.erestaurant.services;

import com.erestaurant.models.Menu;
import com.erestaurant.models.User;

/**
 *
 */
public interface MenuService {
    Menu create(Menu menu);
    Menu getMenu(int ID);
    Menu update(int ID,Menu menu);
    void delete(int ID);
    boolean validate(Menu menu);

}
