

package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Jaison J. Vieira
 */
@Entity
@Table(name = "tb_orcamento")
@NamedQueries({
    @NamedQuery(name = "TbOrcamento.findAll", query = "SELECT t FROM TbOrcamento t")
    , @NamedQuery(name = "TbOrcamento.findByIdOrcamento", query = "SELECT t FROM TbOrcamento t WHERE t.tbOrcamentoPK.idOrcamento = :idOrcamento")
    , @NamedQuery(name = "TbOrcamento.findByVlrVenda", query = "SELECT t FROM TbOrcamento t WHERE t.vlrVenda = :vlrVenda")
    , @NamedQuery(name = "TbOrcamento.findByQtdItem", query = "SELECT t FROM TbOrcamento t WHERE t.tbOrcamentoPK.qtdItem = :qtdItem")
    , @NamedQuery(name = "TbOrcamento.findByVlrNfeOrcamento", query = "SELECT t FROM TbOrcamento t WHERE t.vlrNfeOrcamento = :vlrNfeOrcamento")
    , @NamedQuery(name = "TbOrcamento.findByVlrLucro", query = "SELECT t FROM TbOrcamento t WHERE t.vlrLucro = :vlrLucro")
    , @NamedQuery(name = "TbOrcamento.findByObsCondPagOrcamento", query = "SELECT t FROM TbOrcamento t WHERE t.obsCondPagOrcamento = :obsCondPagOrcamento")
    , @NamedQuery(name = "TbOrcamento.findByStatusOrcamento", query = "SELECT t FROM TbOrcamento t WHERE t.statusOrcamento = :statusOrcamento")
    , @NamedQuery(name = "TbOrcamento.findByObsUsuario", query = "SELECT t FROM TbOrcamento t WHERE t.obsUsuario = :obsUsuario")
    , @NamedQuery(name = "TbOrcamento.findByDataOrcamento", query = "SELECT t FROM TbOrcamento t WHERE t.dataOrcamento = :dataOrcamento")})
public class TbOrcamento implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TbOrcamentoPK tbOrcamentoPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "vlr_venda")
    private BigDecimal vlrVenda;
    @Column(name = "vlr_nfe_orcamento")
    private Double vlrNfeOrcamento;
    @Column(name = "vlr_lucro")
    private BigDecimal vlrLucro;
    @Column(name = "obs_cond_pag_orcamento")
    private String obsCondPagOrcamento;
    @Column(name = "status_orcamento")
    private Integer statusOrcamento;
    @Column(name = "obs_usuario")
    private String obsUsuario;
    @Column(name = "data_orcamento")
    @Temporal(TemporalType.DATE)
    private Date dataOrcamento;
    @JoinTable(name = "tb_orcamento_produto", joinColumns = {
        @JoinColumn(name = "id_orcamento", referencedColumnName = "id_orcamento")
        , @JoinColumn(name = "qtd_item", referencedColumnName = "qtd_item")}, inverseJoinColumns = {
        @JoinColumn(name = "id_produto", referencedColumnName = "id_produto")})
    @ManyToMany
    private Collection<TbProdutos> tbProdutosCollection;
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
    @ManyToOne(optional = false)
    private TbClientes idCliente;

    public TbOrcamento() {
    }

    public TbOrcamento(TbOrcamentoPK tbOrcamentoPK) {
        this.tbOrcamentoPK = tbOrcamentoPK;
    }

    public TbOrcamento(int idOrcamento, int qtdItem) {
        this.tbOrcamentoPK = new TbOrcamentoPK(idOrcamento, qtdItem);
    }

    public TbOrcamentoPK getTbOrcamentoPK() {
        return tbOrcamentoPK;
    }

    public void setTbOrcamentoPK(TbOrcamentoPK tbOrcamentoPK) {
        this.tbOrcamentoPK = tbOrcamentoPK;
    }

    public BigDecimal getVlrVenda() {
        return vlrVenda;
    }

    public void setVlrVenda(BigDecimal vlrVenda) {
        this.vlrVenda = vlrVenda;
    }

    public Double getVlrNfeOrcamento() {
        return vlrNfeOrcamento;
    }

    public void setVlrNfeOrcamento(Double vlrNfeOrcamento) {
        this.vlrNfeOrcamento = vlrNfeOrcamento;
    }

    public BigDecimal getVlrLucro() {
        return vlrLucro;
    }

    public void setVlrLucro(BigDecimal vlrLucro) {
        this.vlrLucro = vlrLucro;
    }

    public String getObsCondPagOrcamento() {
        return obsCondPagOrcamento;
    }

    public void setObsCondPagOrcamento(String obsCondPagOrcamento) {
        this.obsCondPagOrcamento = obsCondPagOrcamento;
    }

    public Integer getStatusOrcamento() {
        return statusOrcamento;
    }

    public void setStatusOrcamento(Integer statusOrcamento) {
        this.statusOrcamento = statusOrcamento;
    }

    public String getObsUsuario() {
        return obsUsuario;
    }

    public void setObsUsuario(String obsUsuario) {
        this.obsUsuario = obsUsuario;
    }

    public Date getDataOrcamento() {
        return dataOrcamento;
    }

    public void setDataOrcamento(Date dataOrcamento) {
        this.dataOrcamento = dataOrcamento;
    }

    public Collection<TbProdutos> getTbProdutosCollection() {
        return tbProdutosCollection;
    }

    public void setTbProdutosCollection(Collection<TbProdutos> tbProdutosCollection) {
        this.tbProdutosCollection = tbProdutosCollection;
    }

    public TbClientes getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(TbClientes idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tbOrcamentoPK != null ? tbOrcamentoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbOrcamento)) {
            return false;
        }
        TbOrcamento other = (TbOrcamento) object;
        if ((this.tbOrcamentoPK == null && other.tbOrcamentoPK != null) || (this.tbOrcamentoPK != null && !this.tbOrcamentoPK.equals(other.tbOrcamentoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.TbOrcamento[ tbOrcamentoPK=" + tbOrcamentoPK + " ]";
    }

}
