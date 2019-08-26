

package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Jaison J. Vieira
 */
@Entity
@Table(name = "tb_login")
@NamedQueries({
    @NamedQuery(name = "TbLogin.findAll", query = "SELECT t FROM TbLogin t")})
public class TbLogin implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_login")
    private Integer idLogin;
    @Basic(optional = false)
    @Column(name = "nome_login")
    private String nomeLogin;
    @Basic(optional = false)
    @Column(name = "senha_login")
    private String senhaLogin;
    @Basic(optional = false)
    @Column(name = "permissao_login")
    private int permissaoLogin;

    public TbLogin() {
    }

    public TbLogin(Integer idLogin) {
        this.idLogin = idLogin;
    }

    public TbLogin(Integer idLogin, String nomeLogin, String senhaLogin, int permissaoLogin) {
        this.idLogin = idLogin;
        this.nomeLogin = nomeLogin;
        this.senhaLogin = senhaLogin;
        this.permissaoLogin = permissaoLogin;
    }

    public Integer getIdLogin() {
        return idLogin;
    }

    public void setIdLogin(Integer idLogin) {
        this.idLogin = idLogin;
    }

    public String getNomeLogin() {
        return nomeLogin;
    }

    public void setNomeLogin(String nomeLogin) {
        this.nomeLogin = nomeLogin;
    }

    public String getSenhaLogin() {
        return senhaLogin;
    }

    public void setSenhaLogin(String senhaLogin) {
        this.senhaLogin = senhaLogin;
    }

    public int getPermissaoLogin() {
        return permissaoLogin;
    }

    public void setPermissaoLogin(int permissaoLogin) {
        this.permissaoLogin = permissaoLogin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLogin != null ? idLogin.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbLogin)) {
            return false;
        }
        TbLogin other = (TbLogin) object;
        if ((this.idLogin == null && other.idLogin != null) || (this.idLogin != null && !this.idLogin.equals(other.idLogin))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.TbLogin[ idLogin=" + idLogin + " ]";
    }

    public TbLogin get(int selectedRow) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
