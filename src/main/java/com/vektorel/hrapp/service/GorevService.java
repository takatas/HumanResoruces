/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.hrapp.service;

import com.vektorel.hrapp.entity.Gorev;
import com.vektorel.hrapp.entity.Kullanici;
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
public class GorevService implements IBaseService<Gorev> {

    @Override
    public boolean save(Gorev entity) throws Exception {
//        if(entity.get==null || entity.getUsername().trim().equals("")){
//            throw  new HRException("Kullanıcı Adı Boş Olmamalıdır");
//        }
//        if(entity.getPass()==null || entity.getPass().trim().equals("")){
//            throw  new HRException("Kullanıcı Şifre Boş Olmamalıdır");
//        }
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        session.save(entity);
        trans.commit();
        session.close();
        return true;
    }

    @Override
    public boolean update(Gorev entity) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        session.update(entity);
        trans.commit();
        session.close();
        return true;

    }

    @Override
    public boolean delete(Gorev entity) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        session.delete(entity);
        trans.commit();
        session.close();
        return true;

    }

    @Override
    public List<Gorev> getAll(String query) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Gorev.class);
        criteria.addOrder(Order.asc("id"));
        return criteria.list();
    }

    @Override
    public Gorev getById(Long id) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Gorev.class);
        criteria.add(Restrictions.eq("id", id));
        return (Gorev) criteria.uniqueResult();

    }

}
