/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.usuario.dao;

import java.io.Serializable;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author josafa
 */
public class HibernateDAO<T> implements InterfaceDAO<T>{
    
    private Session session;
    private Class<T> classe;

    public HibernateDAO(Session session, Class<T> classe) {
        super();
        this.session = session;
        this.classe = classe;
    }

    public void insere(T entitie) {
        session.save(entitie);
    }

    public void atualiza(T entitie) {
        session.update(entitie);
    }

    public void exclui(T entitie) {
        session.delete(entitie);
    }

    public T getEntity(Serializable codigo) {
        session.beginTransaction();
        T entitie = (T) session.get(classe, codigo);
        session.getTransaction().commit();
        return entitie;
    }

    public List<T> getEntities() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
