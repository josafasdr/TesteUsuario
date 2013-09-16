/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.usuario.dao;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author josafa
 */
public interface InterfaceDAO<T> {
    
    public void insere(T entitie);
    
    public void atualiza(T entitie);
    
    public void exclui(T entitie);
    
    public T getEntity(Serializable codigo);
    
    public List<T> getEntities();
}
