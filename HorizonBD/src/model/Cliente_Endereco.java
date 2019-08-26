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
public class Cliente_Endereco implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    @Column(name = "endereco_cliente", length = 100)
    private String endereco_cliente;
    @Column(name = "bairro_cliente", length = 50)
    private String bairro_cliente;
    @Column
    private Integer num_end_cliente;
    @Column
    private String complemento_endereco;
    @Column
    private String cep_cliente;
    @OneToOne
    private Cidade cidade;
    @OneToOne
    private Clientes cliente;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.ID);
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
        final Cliente_Endereco other = (Cliente_Endereco) obj;
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

    public String getEndereco_cliente() {
        return endereco_cliente;
    }

    public void setEndereco_cliente(String endereco_cliente) {
        this.endereco_cliente = endereco_cliente;
    }

    public String getBairro_cliente() {
        return bairro_cliente;
    }

    public void setBairro_cliente(String bairro_cliente) {
        this.bairro_cliente = bairro_cliente;
    }

    public Integer getNum_end_cliente() {
        return num_end_cliente;
    }

    public void setNum_end_cliente(Integer num_end_cliente) {
        this.num_end_cliente = num_end_cliente;
    }

    public String getComplemento_endereco() {
        return complemento_endereco;
    }

    public void setComplemento_endereco(String complemento_endereco) {
        this.complemento_endereco = complemento_endereco;
    }

    public String getCep_cliente() {
        return cep_cliente;
    }

    public void setCep_cliente(String cep_cliente) {
        this.cep_cliente = cep_cliente;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }
}
