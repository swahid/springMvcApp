/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.controller;

import com.spring.entity.Manufacture;
import com.spring.entity.User;
import com.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author shuvo
 */
@Controller
public class LoginController {
    
    @Autowired
    private UserService userService;
     
     @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(ModelMap m){
        
        m.addAttribute("user", new User());
      
        return "login";
    }
    
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String checkLogin(User u, ModelMap m){
        
       
        if( userService.Login(u)){
            return "redirect:/crud";
        }else{
           
           m.addAttribute("msg", "Login Failed Please Login");
           return "redirect:/login"; 
        }
        
        
        
    }
    
}
