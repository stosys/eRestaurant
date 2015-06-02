package com.erestaurant.services;

import com.erestaurant.models.User;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
import com.erestaurant.repositories.UserRepository;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User create(User user) {
        User creat = userRepository.create(user);
        if(creat == null){
            throw new RuntimeException();
        }
        return creat;
    }

    @Override
    public User getUser(int ID) {
        return null;
    }

    @Override
    public User updateUser(int ID, User user) {
        return null;
    }

    @Override
    public void deleteClient(int ID) {

    }

    @Override
    public boolean validate(User user) {

        if(userRepository.getByEmail(user.getEmail())!= null)
            if(userRepository.getByEmail(user.getEmail()).getEmail().compareTo(user.getEmail())== 0)
                return true;
        return false;
    }
}
