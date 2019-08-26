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
public class Config_Endereco implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    @Column(name="endereco_config",length = 100)
    private String endereco_config;
    @Column(name="bairro_config",length = 50)
    private String bairro_config;
    @OneToOne
    private Config configurcao;
    @OneToOne
    private Cidade cidade;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.ID);
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
        final Config_Endereco other = (Config_Endereco) obj;
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

    public String getEndereco_config() {
        return endereco_config;
    }

    public void setEndereco_config(String endereco_config) {
        this.endereco_config = endereco_config;
    }

    public String getBairro_config() {
        return bairro_config;
    }

    public void setBairro_config(String bairro_config) {
        this.bairro_config = bairro_config;
    }

    public Config getConfigurcao() {
        return configurcao;
    }

    public void setConfigurcao(Config configurcao) {
        this.configurcao = configurcao;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
}
