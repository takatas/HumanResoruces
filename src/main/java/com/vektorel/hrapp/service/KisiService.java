/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.hrapp.service;

import com.vektorel.hrapp.entity.Kisi;
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
public class KisiService implements IBaseService<Kisi> {

    @Override
    public boolean save(Kisi entity) throws Exception {

        if (entity.getAd() == null || entity.getAd().trim().equals("")) {
            throw new HRException("Adı Boş Olmamalıdır");
        }
        if (entity.getSoyad() == null || entity.getSoyad().trim().equals("")) {
            throw new HRException("Soyadı Boş Olmamalıdır");
        }
        if (entity.getTc() == null || entity.getTc().toString().equals("")) {
            throw new HRException("TC No Boş Olmamalıdır");
        }

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        session.save(entity);
        trans.commit();
        session.close();
        return true;
    }

    @Override
    public boolean update(Kisi entity) throws Exception {
        if (entity.getAd() == null || entity.getAd().trim().equals("")) {
            throw new HRException("Adı Boş Olmamalıdır");
        }
        if (entity.getSoyad() == null || entity.getSoyad().trim().equals("")) {
            throw new HRException("Soyadı Boş Olmamalıdır");
        }
        if (entity.getTc() == null || entity.getTc().toString().equals("")) {
            throw new HRException("TC No Boş Olmamalıdır");
        }

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        session.update(entity);
        trans.commit();
        session.close();
        return true;
    }

    @Override
    public boolean delete(Kisi entity) throws Exception {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        session.delete(entity);
        trans.commit();
        session.close();
        return true;
    }

    @Override
    public List<Kisi> getAll(String query) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Kisi.class);
        criteria.addOrder(Order.asc("id"));
        return criteria.list();
    }

    @Override
    public Kisi getById(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Kisi.class);
        criteria.add(Restrictions.eq("id", id));
        return (Kisi) criteria.uniqueResult();
    }

    public Kisi getByName(String ad) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Kisi.class);
        criteria.add(Restrictions.eq("adSoyad", ad));
        return (Kisi) criteria.uniqueResult();
    }

}
