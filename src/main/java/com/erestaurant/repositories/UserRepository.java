package com.erestaurant.repositories;

import com.erestaurant.models.User;

/**
 *
 */
public interface UserRepository {
    User create(User user);
    User update(User user);
    void delete(User user);
    User getByEmail(String email);

}
