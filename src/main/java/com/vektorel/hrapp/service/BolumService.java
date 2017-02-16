/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.hrapp.service;

import com.vektorel.hrapp.entity.Bolum;
import com.vektorel.hrapp.util.HRException;
import com.vektorel.hrapp.util.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author takatas
 */
public class BolumService implements IBaseService<Bolum> {

    @Override
    public boolean save(Bolum entity) throws Exception {
        
        if(entity.getTanim() == null && entity.getTanim().trim().equals("")){
            throw new HRException("Bölüm Tanımı Boş Olamaz");
        }
        if(entity.getKod()== null && entity.getKod().trim().equals("")){
            throw new HRException("Bölüm Kodu Boş Olamaz");
        }
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        session.save(entity);
        trans.commit();
        session.close();
        return true;
    }

    @Override
    public boolean update(Bolum entity) throws Exception {
        if(entity.getTanim() == null && entity.getTanim().trim().equals("")){
            throw new HRException("Bölüm Tanımı Boş Olamaz");
        }
        if(entity.getKod()== null && entity.getKod().trim().equals("")){
            throw new HRException("Bölüm Kodu Boş Olamaz");
        }
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(entity);
        transaction.commit();
        session.close();
        
        return true;

    }

    @Override
    public boolean delete(Bolum entity) throws Exception {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(entity);
        transaction.commit();
        session.close();
        
        return true;
    }

    @Override
    public List<Bolum> getAll(String query) {
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Bolum.class);
        criteria.addOrder(Order.asc("id"));
        return criteria.list();
    }

    @Override
    public Bolum getById(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Bolum.class);
        criteria.addOrder(Order.asc("id"));
        criteria.add(Restrictions.eq("id", id));
        
        return (Bolum) criteria.uniqueResult();


    }
    
}
