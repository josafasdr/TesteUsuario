/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/
package teste.usuario.teste;

import org.hibernate.Session;
import org.hibernate.Transaction;
import teste.usuario.util.HibernateUtil;

/**
*
* @author Josafá
*/
public class TesteEsxclui {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            Transaction transaction = session.beginTransaction();
            
            System.out.println("Excluiu!");
            transaction.commit();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            session.close();
        }
    }
}
