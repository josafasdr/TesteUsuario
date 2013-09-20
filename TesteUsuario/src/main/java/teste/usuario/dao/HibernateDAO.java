/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.usuario.dao;

import java.io.Serializable;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author josafa
 */
@Repository
public class HibernateDAO<T> implements InterfaceDAO<T>{
    
    private SessionFactory sessionFactory;

    @Autowired
    public HibernateDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    @Transactional(propagation=Propagation.REQUIRED,readOnly=false)
    public void insere(T entitie) {
        sessionFactory.getCurrentSession().save(entitie);
    }

    @Transactional
    public void atualiza(T entitie) {
        sessionFactory.getCurrentSession().update(entitie);
    }

    @Transactional
    public void exclui(T entitie) {
        sessionFactory.getCurrentSession().delete(entitie);
    }

    @Transactional
    public T getEntity(Class<T> classe, Serializable codigo) {
        T entitie = (T) sessionFactory.getCurrentSession().get(classe, codigo);
        return entitie;
    }

    @Transactional
    public List<T> getEntities(Class<T> classe) {
        List<T> entities = sessionFactory.getCurrentSession().createCriteria(classe).list();
        return entities;
    }
}
