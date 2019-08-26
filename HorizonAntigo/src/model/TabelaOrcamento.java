

package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Jaison J. Vieira
 */
@Entity
@Table(name = "tabela_orcamento")
@NamedQueries({
    @NamedQuery(name = "TabelaOrcamento.findAll", query = "SELECT t FROM TabelaOrcamento t")})
public class TabelaOrcamento implements Serializable {

    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valor_adicional")
    private BigDecimal valorAdicional;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_orcamento")
    private Integer idOrcamento;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "vlr_venda_orcamento")
    private BigDecimal vlrVendaOrcamento;
    @Column(name = "vlr_lucro_orcamento")
    private BigDecimal vlrLucroOrcamento;
    @Column(name = "obs_geral_orcamento")
    private String obsGeralOrcamento;
    @Column(name = "status_orcamento")
    private Integer statusOrcamento;
    @Column(name = "data_orcamento")
    @Temporal(TemporalType.DATE)
    private Date dataOrcamento;
    @Basic(optional = false)
    @Column(name = "nome_cliente_orcamento")
    private String nomeClienteOrcamento;
    @Column(name = "telefone_orcamento")
    private String telefoneOrcamento;
    @Column(name = "cpf_ou_cnpj_orcamento")
    private String cpfOuCnpjOrcamento;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "tabelaOrcamento")
    private TabelaOrcamentoProduto tabelaOrcamentoProduto;

    public TabelaOrcamento() {
    }

    public TabelaOrcamento(Integer idOrcamento) {
        this.idOrcamento = idOrcamento;
    }

    public TabelaOrcamento(Integer idOrcamento, String nomeClienteOrcamento) {
        this.idOrcamento = idOrcamento;
        this.nomeClienteOrcamento = nomeClienteOrcamento;
    }

    public Integer getIdOrcamento() {
        return idOrcamento;
    }

    public void setIdOrcamento(Integer idOrcamento) {
        this.idOrcamento = idOrcamento;
    }

    public BigDecimal getVlrVendaOrcamento() {
        return vlrVendaOrcamento;
    }

    public void setVlrVendaOrcamento(BigDecimal vlrVendaOrcamento) {
        this.vlrVendaOrcamento = vlrVendaOrcamento;
    }

    public BigDecimal getVlrLucroOrcamento() {
        return vlrLucroOrcamento;
    }

    public void setVlrLucroOrcamento(BigDecimal vlrLucroOrcamento) {
        this.vlrLucroOrcamento = vlrLucroOrcamento;
    }

    public String getObsGeralOrcamento() {
        return obsGeralOrcamento;
    }

    public void setObsGeralOrcamento(String obsGeralOrcamento) {
        this.obsGeralOrcamento = obsGeralOrcamento;
    }

    public Integer getStatusOrcamento() {
        return statusOrcamento;
    }

    public void setStatusOrcamento(Integer statusOrcamento) {
        this.statusOrcamento = statusOrcamento;
    }

    public Date getDataOrcamento() {
        return dataOrcamento;
    }

    public void setDataOrcamento(Date dataOrcamento) {
        this.dataOrcamento = dataOrcamento;
    }

    public String getNomeClienteOrcamento() {
        return nomeClienteOrcamento;
    }

    public void setNomeClienteOrcamento(String nomeClienteOrcamento) {
        this.nomeClienteOrcamento = nomeClienteOrcamento;
    }

    public String getTelefoneOrcamento() {
        return telefoneOrcamento;
    }

    public void setTelefoneOrcamento(String telefoneOrcamento) {
        this.telefoneOrcamento = telefoneOrcamento;
    }

    public String getCpfOuCnpjOrcamento() {
        return cpfOuCnpjOrcamento;
    }

    public void setCpfOuCnpjOrcamento(String cpfOuCnpjOrcamento) {
        this.cpfOuCnpjOrcamento = cpfOuCnpjOrcamento;
    }

    public TabelaOrcamentoProduto getTabelaOrcamentoProduto() {
        return tabelaOrcamentoProduto;
    }

    public void setTabelaOrcamentoProduto(TabelaOrcamentoProduto tabelaOrcamentoProduto) {
        this.tabelaOrcamentoProduto = tabelaOrcamentoProduto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOrcamento != null ? idOrcamento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TabelaOrcamento)) {
            return false;
        }
        TabelaOrcamento other = (TabelaOrcamento) object;
        if ((this.idOrcamento == null && other.idOrcamento != null) || (this.idOrcamento != null && !this.idOrcamento.equals(other.idOrcamento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.TabelaOrcamento[ idOrcamento=" + idOrcamento + " ]";
    }

    public BigDecimal getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(BigDecimal valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

}
