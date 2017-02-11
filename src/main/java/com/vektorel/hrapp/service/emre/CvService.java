package com.vektorel.hrapp.service.emre;

import com.vektorel.hrapp.entity.emre.Cv;
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
 * @author eaytac
 */
public class CvService implements IBaseService<Cv> {

    @Override
    public boolean save(Cv entity) throws Exception {
        if(entity.getAd()==null || entity.getAd().trim().equals("")){
            throw  new HRException("Ad alanı boş olmamalıdır");
        }
        if(entity.getSoyad()==null || entity.getSoyad().trim().equals("")){
            throw  new HRException("Ad alanı boş olmamalıdır");
        }
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        session.save(entity);
        trans.commit();
        session.close();
        return true;
    }

    @Override
    public boolean update(Cv entity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        session.update(entity);
        trans.commit();
        session.close();
        return true;
    }

    @Override
    public boolean delete(Cv entity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        session.delete(entity);
        trans.commit();
        session.close();
        return true;
    }

    @Override
    public List<Cv> getAll(String query) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Cv.class);
//        if(query!=null){
//            criteria.add(Restrictions.or(Restrictions.ilike("username", query,MatchMode.ANYWHERE),
//                    Restrictions.ilike("adSoyad", query,MatchMode.ANYWHERE)));
//        }
        criteria.addOrder(Order.asc("id"));
        return criteria.list();
    }

    @Override
    public Cv getById(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Cv.class);
        criteria.add(Restrictions.eq("id", id));
        return (Cv) criteria.uniqueResult();
    }

}
