

package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Jaison J. Vieira
 */
@Embeddable
public class TbOrcamentoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_orcamento")
    private int idOrcamento;
    @Basic(optional = false)
    @Column(name = "qtd_item")
    private int qtdItem;

    public TbOrcamentoPK() {
    }

    public TbOrcamentoPK(int idOrcamento, int qtdItem) {
        this.idOrcamento = idOrcamento;
        this.qtdItem = qtdItem;
    }

    public int getIdOrcamento() {
        return idOrcamento;
    }

    public void setIdOrcamento(int idOrcamento) {
        this.idOrcamento = idOrcamento;
    }

    public int getQtdItem() {
        return qtdItem;
    }

    public void setQtdItem(int qtdItem) {
        this.qtdItem = qtdItem;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idOrcamento;
        hash += (int) qtdItem;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbOrcamentoPK)) {
            return false;
        }
        TbOrcamentoPK other = (TbOrcamentoPK) object;
        if (this.idOrcamento != other.idOrcamento) {
            return false;
        }
        if (this.qtdItem != other.qtdItem) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.TbOrcamentoPK[ idOrcamento=" + idOrcamento + ", qtdItem=" + qtdItem + " ]";
    }

}
