package com.grokonez.jwtauthentication.service;

import java.util.List;
import com.grokonez.jwtauthentication.model.User;

public interface IUserService {
     List<User> getAllUsers();
     User getUserByUsername(String username);
     
     
}
