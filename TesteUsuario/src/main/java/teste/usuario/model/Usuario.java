/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.usuario.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Josafá
 */
@Entity
@Table(schema = "public", name = "usuario")
@SequenceGenerator(name = "usuario_codigo_seq", sequenceName = "public.usuario_codigo_seq")
//@NamedQueries({
//    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u")})
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "usuario_codigo_seq")
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    
    @Column(name = "nome")
    private String nome;
    
    @Column(name = "data_do_cadastro")
    @Temporal(TemporalType.DATE)
    private Date dataDoCadastro;
    
    @Column(name = "hora_do_cadastro")
    @Temporal(TemporalType.TIME)
    private Date horaDoCadastro;
    
    @JoinColumn(name = "tipo_usuario_codigo", referencedColumnName = "codigo")
    @ManyToOne(optional = false)
    private TipoUsuario tipoUsuarioCodigo;

    public Usuario() {
    }

    public Usuario(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataDoCadastro() {
        return dataDoCadastro;
    }

    public void setDataDoCadastro(Date dataDoCadastro) {
        this.dataDoCadastro = dataDoCadastro;
    }

    public Date getHoraDoCadastro() {
        return horaDoCadastro;
    }

    public void setHoraDoCadastro(Date horaDoCadastro) {
        this.horaDoCadastro = horaDoCadastro;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public TipoUsuario getTipoUsuarioCodigo() {
        return tipoUsuarioCodigo;
    }

    public void setTipoUsuarioCodigo(TipoUsuario tipoUsuarioCodigo) {
        this.tipoUsuarioCodigo = tipoUsuarioCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "teste.usuario.model.Usuario[ codigo=" + codigo + " ]";
    }
    
}
