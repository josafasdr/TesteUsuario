package teste.usuario.controller;

import java.util.List;
import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import teste.usuario.dao.HibernateDAO;
import teste.usuario.model.TipoUsuario;
import teste.usuario.util.HibernateUtil;

/**
 * @author Josafá
 */
@Controller
public class TipoUsuarioController {

//    private HibernateDAO<TipoUsuario> tipoUsuarioDAO;
//    private Session session;
//    private Class<TipoUsuario> classe;
    public TipoUsuarioController() {
//        this.session = HibernateUtil.getSessionFactory().openSession();
//        this.classe = TipoUsuario.class;
//        this.tipoUsuarioDAO = new HibernateDAO<TipoUsuario>(session, classe);
    }

    @RequestMapping("formTipoUsuario")
    public String form() {
        return "tipousuario/form-tipo-usuario";
    }

    @RequestMapping("insereTipoUsuario")
    public String insere(TipoUsuario tipoUsuario) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        //tipoUsuario.setNomeTipoUsuario("Funcionario");
        HibernateDAO<TipoUsuario> tipoUsuarioDAO = new HibernateDAO<TipoUsuario>(session, TipoUsuario.class);
        tipoUsuarioDAO.insere(tipoUsuario);
        session.getTransaction().commit();
        return "tipousuario/lista";
    }

    @RequestMapping("listaTiposUsuario")
    public String lista(Model model) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        HibernateDAO<TipoUsuario> tipoUsuarioDAO = new HibernateDAO<TipoUsuario>(session, TipoUsuario.class);
        List<TipoUsuario> tiposUsuario = tipoUsuarioDAO.getEntities();
        session.getTransaction().commit();
        model.addAttribute("tiposUsuario", tiposUsuario);
        return "tipousuario/lista";
    }
}
