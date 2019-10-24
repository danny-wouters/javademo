/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graduaat.it.www.beans.service;

import graduaat.it.www.beans.domain.User;

/**
 *
 * @author Danny
 */
public class UserServiceImplementation implements UserService{
    @Override
    public boolean add(User user) {
        //Persist the user object here.
        if (user.getPassword().equals(user.getConfirmpassword())) {
            System.out.println("User added successfully");
            return true;
        }
        return false;
    }
}
