/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.FornecedoresTto;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author tate
 */
public class Fornecedores_DAO extends DAO_Abstract {

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
        Criteria criteria = session.createCriteria(FornecedoresTto.class);
        criteria.add(Restrictions.eq("drfIdcompraProduto", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(FornecedoresTto.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public List listNomeTto(String nomeTto) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(FornecedoresTto.class);
//      criteria.add(Restrictions.like("nome", +nome+;
        criteria.add(Restrictions.like("nomeTto", nomeTto, MatchMode.ANYWHERE));
        List lista = criteria.list();
        session.getTransaction().commit();

        return lista;

    }

    public List listCnpjTto(String cnpjTto) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(FornecedoresTto.class);
//      criteria.add(Restrictions.like("nome", +nome+;
        criteria.add(Restrictions.like("cnpjTto", cnpjTto, MatchMode.ANYWHERE));
        List lista = criteria.list();
        session.getTransaction().commit();

        return lista;

    }

    public List listNomeCnpj(String nomeTto, String cnpjTto) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(FornecedoresTto.class);
//      criteria.add(Restrictions.like("nome", +nome+;
        criteria.add(Restrictions.like("nomeTto", nomeTto, MatchMode.ANYWHERE));
        criteria.add(Restrictions.like("cnpjTto", cnpjTto, MatchMode.ANYWHERE));
        List lista = criteria.list();
        session.getTransaction().commit();

        return lista;

    }
}
