/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.usuario.teste;

import org.hibernate.Session;
import teste.usuario.dao.HibernateDAO;
import teste.usuario.model.TipoUsuario;
import teste.usuario.model.Usuario;
import teste.usuario.util.HibernateUtil;

/**
 *
 * @author josafa
 */
public class TesteGetEntity {
    
     public static void main(String[] args) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            
            HibernateDAO<Usuario> usuarioDAO = new HibernateDAO<Usuario>(session, Usuario.class);
            
            Usuario usuario = usuarioDAO.getEntity(2);
            
            session.getTransaction().commit();
            // dando erro
            System.out.println(usuario.getNome());
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
