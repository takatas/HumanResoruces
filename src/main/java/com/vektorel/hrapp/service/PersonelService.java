/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.hrapp.service;

import com.vektorel.hrapp.entity.Kullanici;
import com.vektorel.hrapp.entity.Personel;
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
public class PersonelService implements IBaseService<Personel> {

    @Override
    public boolean save(Personel entity) throws Exception {

        if (entity.getSicilNo() == null || entity.getSicilNo().trim().equals("")) {
            throw new HRException("Sicil No Boş Olmamalıdır");
        }
        if (entity.getKisi() == null || entity.getKisi().equals("")) {
            throw new HRException("Kişi Boş Olmamalıdır");
        }
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        session.save(entity);
        trans.commit();
        session.close();
        return true;
    }

    @Override
    public boolean update(Personel entity) throws Exception {
        if (entity.getSicilNo() == null || entity.getSicilNo().trim().equals("")) {
            throw new HRException("Sicil No Boş Olmamalıdır");
        }
        if (entity.getKisi() == null || entity.getKisi().equals("")) {
            throw new HRException("Kişi Boş Olmamalıdır");
        }
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        session.update(entity);
        trans.commit();
        session.close();
        return true;
    }

    @Override
    public boolean delete(Personel entity) throws Exception {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        session.delete(entity);
        trans.commit();
        session.close();
        return true;
    }

    @Override
    public List<Personel> getAll(String query) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Personel.class);
        criteria.addOrder(Order.asc("id"));
        return criteria.list();
    }

    @Override
    public Personel getById(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Personel.class);
        criteria.add(Restrictions.eq("id", id));
        return (Personel) criteria.uniqueResult();
    }

}
