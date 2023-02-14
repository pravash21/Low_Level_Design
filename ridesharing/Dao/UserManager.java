/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import Exceptions.InvalidUser;
import Exceptions.UserAlreadyExists;
import Model.User;

public class UserManager {
    private Map<String,User> users;

    public UserManager() {
        this.users=new HashMap<>();
    }
    
    public void addUser(User user)
    {
        if(users.containsKey(user.getName()))
            throw new UserAlreadyExists();
        users.put(user.getName(), user);
    }
    
    public User getUser(String userName)
    {
        if(!users.containsKey(userName))
            throw new InvalidUser();
        return users.get(userName);
    }
    
    public Collection<User> getUsers()
    {
        //users.values()
        return users.values();
    }
    
}
