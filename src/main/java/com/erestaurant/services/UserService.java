package com.erestaurant.services;

import com.erestaurant.models.User;

/**
 *
 */
public interface UserService {
    User create(User user);
    User getUser(int ID);
    User updateUser(int ID,User user);
    void deleteClient(int ID);
    boolean validate(User user);
}
