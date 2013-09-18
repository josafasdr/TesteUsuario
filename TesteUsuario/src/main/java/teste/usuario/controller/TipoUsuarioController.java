package teste.usuario.controller;

import java.util.List;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private HibernateDAO<TipoUsuario> tipoUsuarioDAO;

    public TipoUsuarioController() {
    }

    @RequestMapping("formTipoUsuario")
    public String form() {
        return "tipousuario/form-tipo-usuario";
    }

    @RequestMapping("insereTipoUsuario")
    public String insere(TipoUsuario tipoUsuario) {
        tipoUsuarioDAO.insere(tipoUsuario);
        return "ola";
    }

    @RequestMapping("listaTiposUsuario")
    public String lista(Model model) {
        List<TipoUsuario> tiposUsuario = tipoUsuarioDAO.getEntities(TipoUsuario.class);
        model.addAttribute("tiposUsuario", tiposUsuario);
        return "tipousuario/lista";
    }
}
