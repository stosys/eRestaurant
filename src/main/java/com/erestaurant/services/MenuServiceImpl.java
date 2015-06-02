package com.erestaurant.services;

import com.erestaurant.models.Menu;
import com.erestaurant.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import com.erestaurant.repositories.MenuRepository;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class MenuServiceImpl implements MenuService {

    @Autowired

    private MenuRepository menuRepository;

    @Override
    public Menu create(Menu menu) {
        Menu menuNou = menuRepository.create(menu);
        if (menuNou == null)
            throw new RuntimeException();
            return menuNou;

    }

    @Override
    public Menu getMenu(int ID) {
        return null;
    }

    @Override
    public Menu update(int ID, Menu menu) {
        return null;
    }

    @Override
    public void delete(int ID) {

    }

    @Override
    public boolean validate(Menu menu) {
        if(menuRepository.getID(menu.getIDm())!= null)
            if(menuRepository.getID(menu.getIDm()).getTip().compareTo(menu.getTip())== 0)
                return true;
        return false;
    }


}
