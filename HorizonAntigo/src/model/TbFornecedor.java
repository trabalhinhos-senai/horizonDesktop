

package model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Jaison J. Vieira
 */
@Entity
@Table(name = "tb_fornecedor")
@NamedQueries({
    @NamedQuery(name = "TbFornecedor.findAll", query = "SELECT t FROM TbFornecedor t")
    , @NamedQuery(name = "TbFornecedor.findByIdfornecedor", query = "SELECT t FROM TbFornecedor t WHERE t.idfornecedor = :idfornecedor")
    , @NamedQuery(name = "TbFornecedor.findByNomeFornecedor", query = "SELECT t FROM TbFornecedor t WHERE t.nomeFornecedor = :nomeFornecedor")})
public class TbFornecedor implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idfornecedor")
    private Integer idfornecedor;
    @Basic(optional = false)
    @Column(name = "nome_fornecedor")
    private String nomeFornecedor;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFornecedor")
    private Collection<TbProdutos> tbProdutosCollection;

    public TbFornecedor() {
    }

    public TbFornecedor(Integer idfornecedor) {
        this.idfornecedor = idfornecedor;
    }

    public TbFornecedor(Integer idfornecedor, String nomeFornecedor) {
        this.idfornecedor = idfornecedor;
        this.nomeFornecedor = nomeFornecedor;
    }

    public Integer getIdfornecedor() {
        return idfornecedor;
    }

    public void setIdfornecedor(Integer idfornecedor) {
        Integer oldIdfornecedor = this.idfornecedor;
        this.idfornecedor = idfornecedor;
        changeSupport.firePropertyChange("idfornecedor", oldIdfornecedor, idfornecedor);
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        String oldNomeFornecedor = this.nomeFornecedor;
        this.nomeFornecedor = nomeFornecedor;
        changeSupport.firePropertyChange("nomeFornecedor", oldNomeFornecedor, nomeFornecedor);
    }

    public Collection<TbProdutos> getTbProdutosCollection() {
        return tbProdutosCollection;
    }

    public void setTbProdutosCollection(Collection<TbProdutos> tbProdutosCollection) {
        this.tbProdutosCollection = tbProdutosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfornecedor != null ? idfornecedor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbFornecedor)) {
            return false;
        }
        TbFornecedor other = (TbFornecedor) object;
        if ((this.idfornecedor == null && other.idfornecedor != null) || (this.idfornecedor != null && !this.idfornecedor.equals(other.idfornecedor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.TbFornecedor[ idfornecedor=" + idfornecedor + " ]";
    }

    public Object get(int selectedRow) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
