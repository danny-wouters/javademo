/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graduaat.it.www.beans.mavenspring.controllers;

import graduaat.it.www.beans.mavenspring.domain.User;
import graduaat.it.www.beans.mavenspring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 *
 * @author Danny
 */
@Controller
@RequestMapping("/userregistration.htm")
@SessionAttributes("user")
public class UserController {
    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String showUserForm(ModelMap model)	{
        User user = new User();
        model.addAttribute(user);
        return "userForm";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String onSubmit(@ModelAttribute("user") User user) {
        userService.add(user);
        return "redirect:usersuccess.htm";
    }  
}
