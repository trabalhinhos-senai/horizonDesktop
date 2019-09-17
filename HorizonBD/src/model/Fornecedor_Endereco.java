

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
public class Fornecedor_Endereco implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    @Column
    private String endereco;
    
    private int num_endereco;
    @Column
    private String cep_fornecedor;
    @OneToOne
    private Fornecedor_p id_fornecedor;
    @OneToOne
    private Cidade id_cidade;
    @Column
    private String bairro;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + Objects.hashCode(this.ID);
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
        final Fornecedor_Endereco other = (Fornecedor_Endereco) obj;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNum_endereco() {
        return num_endereco;
    }

    public void setNum_endereco(int num_endereco) {
        this.num_endereco = num_endereco;
    }

    public String getCep_fornecedor() {
        return cep_fornecedor;
    }

    public void setCep_fornecedor(String cep_fornecedor) {
        this.cep_fornecedor = cep_fornecedor;
    }

    public Fornecedor_p getId_fornecedor() {
        return id_fornecedor;
    }

    public void setId_fornecedor(Fornecedor_p id_fornecedor) {
        this.id_fornecedor = id_fornecedor;
    }

    public Cidade getId_cidade() {
        return id_cidade;
    }

    public void setId_cidade(Cidade id_cidade) {
        this.id_cidade = id_cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
    
    
}
