/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.controller;

import com.spring.entity.Manufacture;
import com.spring.service.ManufactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author admin
 */
@Controller
public class CrudController {
    
    @Autowired
    private ManufactureService manufactureService;
    
    
    @RequestMapping(value = "/crud", method = RequestMethod.GET)
    public String crud(ModelMap m){
        
        m.addAttribute("manufacture", new Manufacture());
        m.addAttribute("manufacturelist", manufactureService.getAllManufacture());
        return "crud";
    }
    
    
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String insert(Manufacture m){
        if(m.getId() ==null){
            manufactureService.insert(m);
            return "redirect:/crud";
        }else{
            manufactureService.update(m);
            return "redirect:/crud";
        }
        
        
    }
    
    @RequestMapping(value = "/delete/{mid}", method = RequestMethod.GET)
    public String delete(@PathVariable("mid") Integer m){
        
        manufactureService.delete(m);
        return "redirect:/crud";
    }
    
    
    @RequestMapping(value = "/edit/{mid}", method = RequestMethod.GET)
    public String edit(@PathVariable("mid") Integer mi, ModelMap m){
        
        
       m.addAttribute("manufacture", manufactureService.getById(mi));
        m.addAttribute("manufacturelist", manufactureService.getAllManufacture());
        return "crud";
    }
}
