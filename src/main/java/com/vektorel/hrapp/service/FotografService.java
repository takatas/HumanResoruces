/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.hrapp.service;

import com.vektorel.hrapp.entity.Fotograf;
import com.vektorel.hrapp.entity.Kullanici;
import com.vektorel.hrapp.util.HRException;
import com.vektorel.hrapp.util.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author takatas
 */
public class FotografService implements IBaseService<Fotograf> {

    @Override
    public boolean save(Fotograf entity) throws Exception {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        session.save(entity);
        trans.commit();
        session.close();
        return true;
    }

    @Override
    public boolean update(Fotograf entity) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        session.update(entity);
        trans.commit();
        session.close();
        return true;
    }

    @Override
    public boolean delete(Fotograf entity) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        session.delete(entity);
        trans.commit();
        session.close();
        return true;

    }

    @Override
    public List<Fotograf> getAll(String query) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Fotograf.class);
//        if(query!=null){
////            select * from kullanici where ad_soyad like '%KARA%' or username like '%KARA%'
//            criteria.add(Restrictions.or(Restrictions.ilike("username", query,MatchMode.ANYWHERE),
//                    Restrictions.ilike("adSoyad", query,MatchMode.ANYWHERE)));
//        }
        criteria.addOrder(Order.asc("id"));
        return criteria.list();
    }

    @Override
    public Fotograf getById(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Fotograf.class);
        criteria.add(Restrictions.eq("id", id));
        return (Fotograf) criteria.uniqueResult();
    }

}
