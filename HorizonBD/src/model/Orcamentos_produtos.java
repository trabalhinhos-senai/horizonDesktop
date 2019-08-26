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
public class Orcamentos_produtos implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    @Column
    private Integer qtd_prod;
    @Column(columnDefinition="Decimal(10,2)")
    private Double vlr_unidade_produto;
    @OneToOne
    private Orcamentos id_Orcamento;
    @OneToOne
    private Produtos id_Produto;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getQtd_prod() {
        return qtd_prod;
    }

    public void setQtd_prod(Integer qtd_prod) {
        this.qtd_prod = qtd_prod;
    }

    public Double getVlr_unidade_produto() {
        return vlr_unidade_produto;
    }

    public void setVlr_unidade_produto(Double vlr_unidade_produto) {
        this.vlr_unidade_produto = vlr_unidade_produto;
    }

    public Orcamentos getId_Orcamento() {
        return id_Orcamento;
    }

    public void setId_Orcamento(Orcamentos id_Orcamento) {
        this.id_Orcamento = id_Orcamento;
    }

    public Produtos getId_Produto() {
        return id_Produto;
    }

    public void setId_Produto(Produtos id_Produto) {
        this.id_Produto = id_Produto;
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Orcamentos_produtos other = (Orcamentos_produtos) obj;
        if (!Objects.equals(this.ID, other.ID)) {
            return false;
        }
        return true;
    }
    
    
}
