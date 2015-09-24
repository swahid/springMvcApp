/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.service;

import com.spring.dao.UserDao;
import com.spring.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author shuvo
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;
    
    @Override
    @Transactional
    public boolean Login(User u) {
      return userDao.Login(u); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Transactional
    public void registration(User u) {
       userDao.registration(u); //To change body of generated methods, choose Tools | Templates.
    }
    
}
