/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.FuncionariosTto;
import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author tate
 */
public class Funcionarios_DAO extends DAO_Abstract {

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
        Criteria criteria = session.createCriteria(FuncionariosTto.class);
        criteria.add(Restrictions.eq("IdcomprasProdutos", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(FuncionariosTto.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public List listNomeTto(String nomeTto) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(FuncionariosTto.class);
        criteria.add(Restrictions.like("nomeTto", "%" + nomeTto + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();

        return lista;

    }

    public List listData(Date dataNascimentoTto) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(FuncionariosTto.class);
        criteria.add(Restrictions.eq("dataNascimentoTto", dataNascimentoTto ));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public List listNomeData(String nomeTto, Date dataNascimentoTto) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(FuncionariosTto.class);
        criteria.add(Restrictions.like("nomeTto", "%" + nomeTto + "%"));
        criteria.add(Restrictions.eq("dataNascimentoTto", dataNascimentoTto));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
}
