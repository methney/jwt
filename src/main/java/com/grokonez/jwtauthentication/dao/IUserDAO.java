package com.grokonez.jwtauthentication.dao;
import java.util.List;
import com.grokonez.jwtauthentication.model.User;
public interface IUserDAO {
    List<User> getAllUsers();
    User getUserByUsername(String username);
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(int username);
}
 