/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.dao;

import com.spring.entity.User;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author shuvo
 */
@Repository
public class UserDaoImpl implements UserDao{
    
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public boolean Login(User u) {
       List l= sessionFactory.getCurrentSession().createQuery("from User where uname='"+u.getUname()+"' and pass='"+u.getPass()+"'").list(); //To change body of generated methods, choose Tools | Templates.
    
       if(l.size()>0){
          User ur= (User) l.get(0);
        if(u.getUname().equalsIgnoreCase(ur.getUname()) & u.getPass().equalsIgnoreCase(u.getPass())){
            return true;
        }else{
           
         
           return false; 
        } 
       }else{
           
         
           return false; 
        } 
       
        
    }

    @Override
    public void registration(User u) {
        sessionFactory.getCurrentSession().saveOrUpdate(u); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
