/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graduaat.it.www.beans.mavenspring.service;

import graduaat.it.www.beans.mavenspring.domain.User;

/**
 *
 * @author Danny
 */
public class UserServiceImplementation implements UserService{
    @Override
    public void add(User user) {
        //Persist the user object here. 
        System.out.println("User added successfully");
    } 
}
