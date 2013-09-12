/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.usuario.teste;

import java.sql.Date;
import java.util.Calendar;
import org.hibernate.Session;
import org.hibernate.Transaction;
import teste.usuario.model.TipoUsuario;
import teste.usuario.model.Usuario;
import teste.usuario.util.HibernateUtil;

/**
 *
 * @author Josafá
 */
public class TesteInsere {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            Transaction transaction = session.beginTransaction();
//            TipoUsuario tipoUsuario = new TipoUsuario();
//            tipoUsuario.setNomeTipoUsuario("Professor");
//            session.save(tipoUsuario);
            TipoUsuario tipoUsuario = new TipoUsuario();
            tipoUsuario.setCodigo(1);
            
            Usuario usuario = new Usuario();
            usuario.setNome("Roque Trindade");
            
            // usando java.sql.Date(java.util.Calendar()) para capturar a data atual
            Date dataParaGravar = new Date(Calendar.getInstance().getTimeInMillis());
            usuario.setDataDoCadastro(dataParaGravar);
            
            // usando java.sql.Date(System()) para capturar a hora atual
            Date horaParaGravar = new Date(System.currentTimeMillis());
            usuario.setHoraDoCadastro(horaParaGravar);
            usuario.setTipoUsuarioCodigo(tipoUsuario);
            
            session.save(usuario);
            System.out.println("Gravou!!");
            transaction.commit();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            session.close();
        }
    }
}
