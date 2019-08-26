

package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name = "tb_produtos")
@NamedQueries({
    @NamedQuery(name = "TbProdutos.findAll", query = "SELECT t FROM TbProdutos t")
    , @NamedQuery(name = "TbProdutos.findByIdProduto", query = "SELECT t FROM TbProdutos t WHERE t.idProduto = :idProduto")
    , @NamedQuery(name = "TbProdutos.findByCodBarrasProd", query = "SELECT t FROM TbProdutos t WHERE t.codBarrasProd = :codBarrasProd")
    , @NamedQuery(name = "TbProdutos.findByCodRefProd", query = "SELECT t FROM TbProdutos t WHERE t.codRefProd = :codRefProd")
    , @NamedQuery(name = "TbProdutos.findByCategoriaProd", query = "SELECT t FROM TbProdutos t WHERE t.categoriaProd = :categoriaProd")
    , @NamedQuery(name = "TbProdutos.findByUnidMedidaProd", query = "SELECT t FROM TbProdutos t WHERE t.unidMedidaProd = :unidMedidaProd")
    , @NamedQuery(name = "TbProdutos.findByPrecoCustoProd", query = "SELECT t FROM TbProdutos t WHERE t.precoCustoProd = :precoCustoProd")
    , @NamedQuery(name = "TbProdutos.findByPrecoVendaProd", query = "SELECT t FROM TbProdutos t WHERE t.precoVendaProd = :precoVendaProd")
    , @NamedQuery(name = "TbProdutos.findByMargemLucroProd", query = "SELECT t FROM TbProdutos t WHERE t.margemLucroProd = :margemLucroProd")
    , @NamedQuery(name = "TbProdutos.findBySituacaoProd", query = "SELECT t FROM TbProdutos t WHERE t.situacaoProd = :situacaoProd")
    , @NamedQuery(name = "TbProdutos.findByDataCadastroProd", query = "SELECT t FROM TbProdutos t WHERE t.dataCadastroProd = :dataCadastroProd")
    , @NamedQuery(name = "TbProdutos.findByDataAlteracaoProd", query = "SELECT t FROM TbProdutos t WHERE t.dataAlteracaoProd = :dataAlteracaoProd")
    , @NamedQuery(name = "TbProdutos.findByObservacaoProd", query = "SELECT t FROM TbProdutos t WHERE t.observacaoProd = :observacaoProd")
    , @NamedQuery(name = "TbProdutos.findByNomeProd", query = "SELECT t FROM TbProdutos t WHERE t.nomeProd = :nomeProd")})
public class TbProdutos implements Serializable {

    @Column(name = "nome_fornecedor")
    private String nomeFornecedor;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_produto")
    private Integer idProduto;
    @Column(name = "cod_barras_prod")
    private Integer codBarrasProd;
    @Column(name = "cod_ref_prod")
    private Integer codRefProd;
    @Basic(optional = false)
    @Column(name = "categoria_prod")
    private String categoriaProd;
    @Basic(optional = false)
    @Column(name = "unid_medida_prod")
    private String unidMedidaProd;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "preco_custo_prod")
    private BigDecimal precoCustoProd;
    @Basic(optional = false)
    @Column(name = "preco_venda_prod")
    private BigDecimal precoVendaProd;
    @Column(name = "margem_lucro_prod")
    private Double margemLucroProd;
    @Basic(optional = false)
    @Column(name = "situacao_prod")
    private int situacaoProd;
    @Column(name = "data_cadastro_prod")
    @Temporal(TemporalType.DATE)
    private Date dataCadastroProd;
    @Column(name = "data_alteracao_prod")
    @Temporal(TemporalType.DATE)
    private Date dataAlteracaoProd;
    @Column(name = "observacao_prod")
    private String observacaoProd;
    @Basic(optional = false)
    @Column(name = "nome_prod")
    private String nomeProd;
    @ManyToMany(mappedBy = "tbProdutosCollection")
    private Collection<TbOrcamento> tbOrcamentoCollection;
    @JoinColumn(name = "id_fornecedor", referencedColumnName = "idfornecedor")
    @ManyToOne(optional = false)
    private TbFornecedor idFornecedor;

    public TbProdutos() {
    }

    public TbProdutos(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public TbProdutos(Integer idProduto, String categoriaProd, String unidMedidaProd, BigDecimal precoVendaProd, int situacaoProd, String nomeProd) {
        this.idProduto = idProduto;
        this.categoriaProd = categoriaProd;
        this.unidMedidaProd = unidMedidaProd;
        this.precoVendaProd = precoVendaProd;
        this.situacaoProd = situacaoProd;
        this.nomeProd = nomeProd;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public Integer getCodBarrasProd() {
        return codBarrasProd;
    }

    public void setCodBarrasProd(Integer codBarrasProd) {
        this.codBarrasProd = codBarrasProd;
    }

    public Integer getCodRefProd() {
        return codRefProd;
    }

    public void setCodRefProd(Integer codRefProd) {
        this.codRefProd = codRefProd;
    }

    public String getCategoriaProd() {
        return categoriaProd;
    }

    public void setCategoriaProd(String categoriaProd) {
        this.categoriaProd = categoriaProd;
    }

    public String getUnidMedidaProd() {
        return unidMedidaProd;
    }

    public void setUnidMedidaProd(String unidMedidaProd) {
        this.unidMedidaProd = unidMedidaProd;
    }

    public BigDecimal getPrecoCustoProd() {
        return precoCustoProd;
    }

    public void setPrecoCustoProd(BigDecimal precoCustoProd) {
        this.precoCustoProd = precoCustoProd;
    }

    public BigDecimal getPrecoVendaProd() {
        return precoVendaProd;
    }

    public void setPrecoVendaProd(BigDecimal precoVendaProd) {
        this.precoVendaProd = precoVendaProd;
    }

    public Double getMargemLucroProd() {
        return margemLucroProd;
    }

    public void setMargemLucroProd(Double margemLucroProd) {
        this.margemLucroProd = margemLucroProd;
    }

    public int getSituacaoProd() {
        return situacaoProd;
    }

    public void setSituacaoProd(int situacaoProd) {
        this.situacaoProd = situacaoProd;
    }

    public Date getDataCadastroProd() {
        return dataCadastroProd;
    }

    public void setDataCadastroProd(Date dataCadastroProd) {
        this.dataCadastroProd = dataCadastroProd;
    }

    public Date getDataAlteracaoProd() {
        return dataAlteracaoProd;
    }

    public void setDataAlteracaoProd(Date dataAlteracaoProd) {
        this.dataAlteracaoProd = dataAlteracaoProd;
    }

    public String getObservacaoProd() {
        return observacaoProd;
    }

    public void setObservacaoProd(String observacaoProd) {
        this.observacaoProd = observacaoProd;
    }

    public String getNomeProd() {
        return nomeProd;
    }

    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }

    public Collection<TbOrcamento> getTbOrcamentoCollection() {
        return tbOrcamentoCollection;
    }

    public void setTbOrcamentoCollection(Collection<TbOrcamento> tbOrcamentoCollection) {
        this.tbOrcamentoCollection = tbOrcamentoCollection;
    }

    public TbFornecedor getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(TbFornecedor idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProduto != null ? idProduto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbProdutos)) {
            return false;
        }
        TbProdutos other = (TbProdutos) object;
        if ((this.idProduto == null && other.idProduto != null) || (this.idProduto != null && !this.idProduto.equals(other.idProduto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.TbProdutos[ idProduto=" + idProduto + " ]";
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

}
