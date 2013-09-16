
package teste.usuario.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author josafa
 */
@Controller
public class TesteController {
    
    @RequestMapping("/olaUsuario")
    public String executa() {
        System.out.println("Executando teste do Spring MVC...");
        return "ola";
    }
    
}
