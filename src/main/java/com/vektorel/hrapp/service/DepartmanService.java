/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.hrapp.service;

import com.vektorel.hrapp.entity.Departman;
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
public class DepartmanService implements IBaseService<Departman> {

    @Override
    public boolean save(Departman entity) throws Exception {
        if (entity.getKod() == null || entity.getKod().trim().equals("")) {
            throw new HRException("Departman Kodu Boş Olmamalıdır");
        }
        if (entity.getTanim() == null || entity.getTanim().trim().equals("")) {
            throw new HRException("Departman Tanımı Boş Olmamalıdır");
        }
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        session.save(entity);
        trans.commit();
        session.close();
        return true;
    }

    @Override
    public boolean update(Departman entity) throws Exception {
        if (entity.getKod() == null || entity.getKod().trim().equals("")) {
            throw new HRException("Departman Kodu Boş Olmamalıdır");
        }
        if (entity.getTanim() == null || entity.getTanim().trim().equals("")) {
            throw new HRException("Departman Tanımı Boş Olmamalıdır");
        }
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        session.update(entity);
        trans.commit();
        session.close();
        return true;
    }

    @Override
    public boolean delete(Departman entity) throws Exception {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        session.delete(entity);
        trans.commit();
        session.close();
        return true;
    }

    @Override
    public List<Departman> getAll(String query) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Departman.class);
        if (query != null) {
//            select * from kullanici where ad_soyad like '%KARA%' or username like '%KARA%'
            criteria.add(Restrictions.or(Restrictions.ilike("tanim", query, MatchMode.ANYWHERE),
                    Restrictions.ilike("kod", query, MatchMode.ANYWHERE)));
        }
        criteria.addOrder(Order.asc("id"));
        return criteria.list();
    }

    @Override
    public Departman getById(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Departman.class);
        criteria.add(Restrictions.eq("id", id));
        return (Departman) criteria.uniqueResult();
    }

}
