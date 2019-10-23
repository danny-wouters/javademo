/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import domain.User;

/**
 *
 * @author Danny
 */
public class UserServiceImpl implements UserService {
    @Override
    public void add(User user) {
        //Persist the user object here. 
        System.out.println("User added successfully");
    }    
}
