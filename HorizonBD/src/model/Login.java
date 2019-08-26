package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Login implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "user", length = 60)
    private String usuario;
    @Column(name = "senha", length = 60)
    private String senha_login;
    @Column(name = "permissao", length = 60)
    private Integer permissao_login;
    
    @ManyToOne
    private Config configuracao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

   

    public String getSenha_login() {
        return senha_login;
    }

    public void setSenha_login(String senha_login) {
        this.senha_login = senha_login;
    }

    public Integer getPermissao_login() {
        return permissao_login;
    }

    public void setPermissao_login(Integer permissao_login) {
        this.permissao_login = permissao_login;
    }

    public Config getConfiguracao() {
        return configuracao;
    }

    public void setConfiguracao(Config configuracao) {
        this.configuracao = configuracao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Login other = (Login) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    

}
