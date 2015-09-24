/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.dao;

import com.spring.entity.User;

/**
 *
 * @author shuvo
 */

public interface UserDao {
    
    public boolean Login(User u);
    public void registration(User u);
}
