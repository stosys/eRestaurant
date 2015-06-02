package com.erestaurant.repositories;

import com.erestaurant.models.Menu;

import java.util.List;

/**
 *
 */
public interface MenuRepository {

    Menu create(Menu menu);
    Menu update(Menu menu);
    void delete(Menu menu);
    List<Menu> getMenus();
    Menu getID(long ID);
}
