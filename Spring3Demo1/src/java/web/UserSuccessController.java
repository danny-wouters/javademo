/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Danny
 */
@Controller
public class UserSuccessController {
    @RequestMapping("/userSuccess.htm")
    public String redirect()
    {
        return "userSuccess";
    }
}
