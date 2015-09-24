/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.dao;

import com.spring.entity.Manufacture;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author admin
 */

@Repository
public class ManufactureDaoImpl implements ManufactureDao{

    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public void insert(Manufacture m) {
       sessionFactory.getCurrentSession().save(m); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Manufacture m) {
        sessionFactory.getCurrentSession().update(m);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Integer m) {
       Manufacture mf = (Manufacture) sessionFactory.getCurrentSession().load(Manufacture.class, m);
       
       sessionFactory.getCurrentSession().delete(mf);
                        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Manufacture> getAllManufacture() {
    return sessionFactory.getCurrentSession().createQuery("from Manufacture").list(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Manufacture getById(Integer m) {
        Manufacture mf = (Manufacture) sessionFactory.openSession().load(Manufacture.class, m);//To change body of generated methods, choose Tools | Templates.
    return mf;
    }
    
}
