

package model;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Orcamentos implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    @Column
    private Date data_orcamento;
    @Column
    private String observacoes_orcamento;
    @Column(columnDefinition = "Decimal(10,2)")
    private Double valor_adicional;
    @Column
    private Integer situacao_orcamento;
    @ManyToOne
    private Clientes id_cliente;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Date getData_orcamento() {
        return data_orcamento;
    }

    public void setData_orcamento(Date data_orcamento) {
        this.data_orcamento = data_orcamento;
    }

    public String getObservacoes_orcamento() {
        return observacoes_orcamento;
    }

    public void setObservacoes_orcamento(String observacoes_orcamento) {
        this.observacoes_orcamento = observacoes_orcamento;
    }

    public Double getValor_adicional() {
        return valor_adicional;
    }

    public void setValor_adicional(Double valor_adicional) {
        this.valor_adicional = valor_adicional;
    }

    public Integer getSituacao_orcamento() {
        return situacao_orcamento;
    }

    public void setSituacao_orcamento(Integer situacao_orcamento) {
        this.situacao_orcamento = situacao_orcamento;
    }

    public Clientes getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Clientes id_cliente) {
        this.id_cliente = id_cliente;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.ID);
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
        final Orcamentos other = (Orcamentos) obj;
        if (!Objects.equals(this.ID, other.ID)) {
            return false;
        }
        return true;
    }
    
    
}
