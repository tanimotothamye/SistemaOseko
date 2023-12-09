/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.ComprasTto;
import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author tate
 */
public class Compras_DAO extends DAO_Abstract {

    @Override
    public void insert(Object object) {
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
    }

    @Override
    public void update(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.update(object);
        session.getTransaction().commit();
    }

    @Override
    public void delete(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.delete(object);
        session.getTransaction().commit();
    }

    @Override
    public Object list(int id) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ComprasTto.class);
        criteria.add(Restrictions.eq("drfIdcompraProduto", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ComprasTto.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

        public List listData(Date dataTto) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ComprasTto.class);
        criteria.add(Restrictions.eq("dataTto", dataTto));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public List listTotalTto(double totalTto) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ComprasTto.class);
        criteria.add(Restrictions.ge("totalTto", new Double(totalTto)));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public List listDataTotal(Date dataTto, double totalTto) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ComprasTto.class);
        criteria.add(Restrictions.eq("dataTto", dataTto));
        criteria.add(Restrictions.ge("totalTto", new Double(totalTto)));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
}
