package com.example.fancrab_backened.service;

import com.example.fancrab_backened.exception.UserException;
import com.example.fancrab_backened.modal.User;


import java.util.List;

public interface  UserService {
    public User findUserById(Long userId) throws UserException;

    public User findUserProfileByJwt(String jwt) throws UserException;

    public List<User> findAllUsers();

}



