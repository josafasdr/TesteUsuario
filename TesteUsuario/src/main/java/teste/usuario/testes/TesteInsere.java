/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.usuario.testes;

import java.sql.Date;
import java.util.Calendar;
import org.hibernate.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import teste.usuario.dao.HibernateDAO;
import teste.usuario.model.TipoUsuario;
import teste.usuario.model.Usuario;
import teste.usuario.util.HibernateUtil;

/**
 *
 * @author Josafa
 */
public class TesteInsere {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext();
        HibernateDAO<TipoUsuario> hibernateDAO = (HibernateDAO<TipoUsuario>) applicationContext.getBean("hibernateDAO");
        
        TipoUsuario tipoUsuario = new TipoUsuario();
        tipoUsuario.setNomeTipoUsuario("Outro Tipo");
        
        hibernateDAO.insere(tipoUsuario);
//        try {
//            Session session = HibernateUtil.getSessionFactory().openSession();
//            session.beginTransaction();
//            
////            TipoUsuario tipoUsuario = new TipoUsuario();
////            tipoUsuario.setNomeTipoUsuario("Funcionario");
////            
////            HibernateDAO<TipoUsuario> tipoUsuarioDAO = new HibernateDAO<TipoUsuario>(session, TipoUsuario.class);            
////            
////            tipoUsuarioDAO.insere(tipoUsuario);
//            
//            Usuario usuario = new Usuario();
//            usuario.setNome("Josafa Santos");
//            
//             // usando java.sql.Date(java.util.Calendar()) para capturar a data atual
//            Date dataParaGravar = new Date(Calendar.getInstance().getTimeInMillis());
//            usuario.setDataDoCadastro(dataParaGravar);
//            // usando java.sql.Date(System()) para capturar a hora atual
//            Date horaParaGravar = new Date(System.currentTimeMillis());
//            usuario.setHoraDoCadastro(horaParaGravar);
//            
//            usuario.setTipoUsuarioCodigo(new TipoUsuario(2));
//            
//            HibernateDAO<Usuario> usuarioDAO = new HibernateDAO<Usuario>(session, Usuario.class);
//            usuarioDAO.insere(usuario);
//            session.getTransaction().commit();
//        } catch (Exception e) {
//            System.out.println("Erro: " + e.getMessage());
//        }
    }
}
