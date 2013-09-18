/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.usuario.dao;

import java.io.Serializable;
import java.util.List;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author josafa
 */
@Repository
public class HibernateDAO<T> implements InterfaceDAO<T>{
    
    @Autowired
    private Session session;

    public HibernateDAO() {
    }

    @Transactional
    public void insere(T entitie) {
        session.save(entitie);
    }

    @Transactional
    public void atualiza(T entitie) {
        session.update(entitie);
    }

    @Transactional
    public void exclui(T entitie) {
        session.delete(entitie);
    }

    @Transactional
    public T getEntity(Class<T> classe, Serializable codigo) {
        T entitie = (T) session.get(classe, codigo);
        return entitie;
    }

    @Transactional
    public List<T> getEntities(Class<T> classe) {
        List<T> entities = session.createCriteria(classe).list();
        return entities;
    }
}
