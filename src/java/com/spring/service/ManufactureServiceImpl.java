/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.service;

import com.spring.dao.ManufactureDao;
import com.spring.entity.Manufacture;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author admin
 */
@Service
public class ManufactureServiceImpl implements ManufactureService{

    @Autowired
    private ManufactureDao manufactureDao;
    
    @Override
    @Transactional
    public void insert(Manufacture m) {
        manufactureDao.insert(m); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Transactional
    public void update(Manufacture m) {
        manufactureDao.update(m); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Transactional
    public void delete(Integer m) {
        manufactureDao.delete(m); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Transactional
    public List<Manufacture> getAllManufacture() {
     return manufactureDao.getAllManufacture(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Transactional
    public Manufacture getById(Integer m) {
        return manufactureDao.getById(m);//To change body of generated methods, choose Tools | Templates.
    }
    
}
