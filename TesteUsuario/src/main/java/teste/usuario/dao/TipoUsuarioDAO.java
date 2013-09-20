/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.usuario.dao;

import org.hibernate.SessionFactory;
import teste.usuario.model.TipoUsuario;

/**
 *
 * @author Josafá
 */
public class TipoUsuarioDAO extends HibernateDAO<TipoUsuario> {
    
    public TipoUsuarioDAO(SessionFactory sessionFactory){
        super(sessionFactory);
    }
}
