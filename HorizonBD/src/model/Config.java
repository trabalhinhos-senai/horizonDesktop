package model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Config implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nome_emp")
    private String nome_empresa;
    @OneToOne(mappedBy = "configuracoes", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    Config_Contato config_contato;
    @OneToOne(mappedBy = "configurcao", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    Config_Endereco config_Endereco; 

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + this.id;
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
        final Config other = (Config) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome_empresa() {
        return nome_empresa;
    }

    public void setNome_empresa(String nome_empresa) {
        this.nome_empresa = nome_empresa;
    }

    public Config_Contato getConfig_contato() {
        return config_contato;
    }

    public void setConfig_contato(Config_Contato config_contato) {
        this.config_contato = config_contato;
    }

    public Config_Endereco getConfig_Endereco() {
        return config_Endereco;
    }

    public void setConfig_Endereco(Config_Endereco config_Endereco) {
        this.config_Endereco = config_Endereco;
    }   
}
