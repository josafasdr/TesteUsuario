/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.usuario.testes;

import java.util.List;
import org.hibernate.Session;
import teste.usuario.dao.HibernateDAO;
import teste.usuario.model.Usuario;
import teste.usuario.util.HibernateUtil;

/**
 *
 * @author josafa
 */
public class TesteGetEntities {

    public static void main(String[] args) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();

            HibernateDAO<Usuario> usuarioDAO = new HibernateDAO<Usuario>(session, Usuario.class);

            List<Usuario> usuarios = usuarioDAO.getEntities();

            session.getTransaction().commit();
            for (Usuario usuario : usuarios) {
                System.out.println("Codigo: " + usuario.getCodigo() + " - Nome: " + usuario.getNome());
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
