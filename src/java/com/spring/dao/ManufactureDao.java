/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.dao;

import com.spring.entity.Manufacture;
import java.util.List;

/**
 *
 * @author admin
 */
public interface ManufactureDao {
    public void insert(Manufacture m);
     public void update(Manufacture m);
      public void delete(Integer m);
       public List<Manufacture> getAllManufacture();
       public Manufacture getById(Integer m);
}
