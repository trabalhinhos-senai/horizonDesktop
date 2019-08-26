package model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Config_Contato implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    @Column(name="tel_config", length = 20)
    private String telefone_config;
    @Column(name="email_config", length = 60)
    private String email_config;
    @OneToOne
    private Config configuracoes;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.ID);
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
        final Config_Contato other = (Config_Contato) obj;
        if (!Objects.equals(this.ID, other.ID)) {
            return false;
        }
        return true;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getTelefone_config() {
        return telefone_config;
    }

    public void setTelefone_config(String telefone_config) {
        this.telefone_config = telefone_config;
    }

    public String getEmail_config() {
        return email_config;
    }

    public void setEmail_config(String email_config) {
        this.email_config = email_config;
    }

    public Config getConfiguracoes() {
        return configuracoes;
    }

    public void setConfiguracoes(Config configuracoes) {
        this.configuracoes = configuracoes;
    }
}
