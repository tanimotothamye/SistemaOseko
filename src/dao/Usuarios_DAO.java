/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.UsuariosTto;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author rafae
 */
public class Usuarios_DAO extends DAO_Abstract {

    @Override
    public void insert(Object object) {
        Transaction transaction = session.beginTransaction();
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
        Criteria criteria = session.createCriteria(UsuariosTto.class);
        criteria.add(Restrictions.eq("drfIdcompraProduto", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(UsuariosTto.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public UsuariosTto login(String usuario, String senha) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(UsuariosTto.class);
        criteria.add(Restrictions.eq("nicknameTto", usuario));
        criteria.add(Restrictions.eq("senhaTto", senha));
        UsuariosTto usuariosLogin = (UsuariosTto) criteria.uniqueResult();
        session.getTransaction().commit();

        return usuariosLogin;
    }

    public List listNomeTto(String nomeTto) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(UsuariosTto.class);
//      criteria.add(Restrictions.like("nome", +nome+;
        criteria.add(Restrictions.like("nomeTto", nomeTto, MatchMode.ANYWHERE));
        List lista = criteria.list();
        session.getTransaction().commit();

        return lista;

    }

    public List listCpfTto(String cpfTto) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(UsuariosTto.class);
//      criteria.add(Restrictions.like("nome", +nome+;
        criteria.add(Restrictions.like("cpfTto", cpfTto, MatchMode.ANYWHERE));
        List lista = criteria.list();
        session.getTransaction().commit();

        return lista;

    }

    public List listNomeCpf(String nomeTto, String cpfTto) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(UsuariosTto.class);
//      criteria.add(Restrictions.like("nome", +nome+;
        criteria.add(Restrictions.like("nomeTto", nomeTto, MatchMode.ANYWHERE));
        criteria.add(Restrictions.like("cpfTto", cpfTto, MatchMode.ANYWHERE));
        List lista = criteria.list();
        session.getTransaction().commit();

        return lista;

    }
    }

