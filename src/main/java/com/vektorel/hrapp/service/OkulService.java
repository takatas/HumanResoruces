/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.hrapp.service;

import com.vektorel.hrapp.entity.Kullanici;
import com.vektorel.hrapp.entity.Okul;
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
public class OkulService implements IBaseService<Okul> {

    @Override
    public boolean save(Okul entity) throws Exception {
        if (entity.getAdi() == null || entity.getAdi().trim().equals("")) {
            throw new HRException("Okul Adı Boş Olmamalıdır");
        }
        if (entity.getKod() == null || entity.getKod().trim().equals("")) {
            throw new HRException("Okul Kodu Boş Olmamalıdır");
        }
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        session.save(entity);
        trans.commit();
        session.close();
        return true;
    }

    @Override
    public boolean update(Okul entity) throws Exception {
        if (entity.getAdi() == null || entity.getAdi().trim().equals("")) {
            throw new HRException("Okul Adı Boş Olmamalıdır");
        }
        if (entity.getKod() == null || entity.getKod().trim().equals("")) {
            throw new HRException("Okul Kodu Boş Olmamalıdır");
        }
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        session.update(entity);
        trans.commit();
        session.close();
        return true;
    }

    @Override
    public boolean delete(Okul entity) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        session.delete(entity);
        trans.commit();
        session.close();
        return true;
    }

    @Override
    public List<Okul> getAll(String query) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Okul.class);
        criteria.addOrder(Order.asc("id"));
        return criteria.list();
    }

    @Override
    public Okul getById(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Okul.class);
        criteria.add(Restrictions.eq("id", id));
        return (Okul) criteria.uniqueResult();
    }

}
