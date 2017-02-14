/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.hrapp.service;

import com.vektorel.hrapp.entity.Il;
import com.vektorel.hrapp.service.IBaseService;
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
 * @author vektorel
 */
public class IlService implements IBaseService<Il> {

    @Override
    public boolean save(Il entity) throws Exception {

        if (entity.getAd() == null && entity.getAd().trim().equals("")) {
            throw new HRException("İlçe Adı Boş Olamaz!");
        }

        if (entity.getKod() == null && entity.getKod().trim().equals("")) {
            throw new HRException("İlçe Kodu Boş Olamaz!");
        }

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(entity);
        transaction.commit();
        session.close();

        return true;
    }

    @Override
    public boolean update(Il entity) throws Exception {
        if (entity.getAd() == null && entity.getAd().trim().equals("")) {
            throw new HRException("İlçe Adı Boş Olamaz!");
        }

        if (entity.getKod() == null && entity.getKod().trim().equals("")) {
            throw new HRException("İlçe Kodu Boş Olamaz!");
        }

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(entity);
        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public boolean delete(Il entity) throws Exception {
        if (entity.getAd() == null && entity.getAd().trim().equals("")) {
            throw new HRException("İlçe Adı Boş Olamaz!");
        }

        if (entity.getKod() == null && entity.getKod().trim().equals("")) {
            throw new HRException("İlçe Kodu Boş Olamaz!");
        }

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(entity);
        transaction.commit();
        session.close();
        return true;

    }

    @Override
    public List<Il> getAll(String query) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Il.class);
        criteria.addOrder(Order.asc("id"));
        return criteria.list();
    }

    @Override
    public Il getById(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Il.class);
        criteria.add(Restrictions.eq("id", id));

        return (Il) criteria.uniqueResult();
    }

    public Il getByIlAdi(String ad) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Il.class);
        criteria.add(Restrictions.eq("ad", ad));

        return (Il) criteria.uniqueResult();
    }

}
