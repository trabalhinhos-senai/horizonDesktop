

package model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Jaison J. Vieira
 */
@Entity
@Table(name = "tabela_orcamento_produto")
@NamedQueries({
    @NamedQuery(name = "TabelaOrcamentoProduto.findAll", query = "SELECT t FROM TabelaOrcamentoProduto t")})
public class TabelaOrcamentoProduto implements Serializable {

    @Column(name = "p_unit_4")
    private BigDecimal pUnit4;

    @Column(name = "p_unit_7")
    private BigDecimal pUnit7;

    @Column(name = "d_prod_1")
    private String dProd1;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "p_unit_1")
    private BigDecimal pUnit1;
    @Column(name = "q_item_1")
    private Integer qItem1;
    @Column(name = "d_prod_2")
    private String dProd2;
    @Column(name = "p_unit_2")
    private BigDecimal pUnit2;
    @Column(name = "q_item_2")
    private Integer qItem2;
    @Column(name = "d_prod_3")
    private String dProd3;
    @Column(name = "p_unit_3")
    private BigDecimal pUnit3;
    @Column(name = "q_item_3")
    private Integer qItem3;
    @Column(name = "d_prod_4")
    private String dProd4;
    @Column(name = "p_prod_4")
    private BigDecimal pProd4;
    @Column(name = "q_item_4")
    private Integer qItem4;
    @Column(name = "d_prod_5")
    private String dProd5;
    @Column(name = "p_unit_5")
    private BigDecimal pUnit5;
    @Column(name = "q_item_5")
    private Integer qItem5;
    @Column(name = "d_prod_6")
    private String dProd6;
    @Column(name = "p_unit_6")
    private BigDecimal pUnit6;
    @Column(name = "q_item_6")
    private Integer qItem6;
    @Column(name = "d_prod_7")
    private String dProd7;
    @Column(name = "p_prod_7")
    private BigDecimal pProd7;
    @Column(name = "q_item_7")
    private Integer qItem7;
    @Column(name = "d_prod_8")
    private String dProd8;
    @Column(name = "p_unit_8")
    private BigDecimal pUnit8;
    @Column(name = "q_item_8")
    private Integer qItem8;
    @Column(name = "d_prod_9")
    private String dProd9;
    @Column(name = "p_unit_9")
    private BigDecimal pUnit9;
    @Column(name = "q_item_9")
    private Integer qItem9;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_orcamento")
    private Integer idOrcamento;
    @Column(name = "nome_produto")
    private String nomeProduto;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "preco_venda")
    private BigDecimal precoVenda;
    @Column(name = "qtd_item")
    private Integer qtdItem;
    @JoinColumn(name = "id_orcamento", referencedColumnName = "id_orcamento", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private TabelaOrcamento tabelaOrcamento;

    public TabelaOrcamentoProduto() {
    }

    public TabelaOrcamentoProduto(Integer idOrcamento) {
        this.idOrcamento = idOrcamento;
    }

    public Integer getIdOrcamento() {
        return idOrcamento;
    }

    public void setIdOrcamento(Integer idOrcamento) {
        this.idOrcamento = idOrcamento;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public BigDecimal getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(BigDecimal precoVenda) {
        this.precoVenda = precoVenda;
    }

    public Integer getQtdItem() {
        return qtdItem;
    }

    public void setQtdItem(Integer qtdItem) {
        this.qtdItem = qtdItem;
    }

    public TabelaOrcamento getTabelaOrcamento() {
        return tabelaOrcamento;
    }

    public void setTabelaOrcamento(TabelaOrcamento tabelaOrcamento) {
        this.tabelaOrcamento = tabelaOrcamento;
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
        if (!(object instanceof TabelaOrcamentoProduto)) {
            return false;
        }
        TabelaOrcamentoProduto other = (TabelaOrcamentoProduto) object;
        if ((this.idOrcamento == null && other.idOrcamento != null) || (this.idOrcamento != null && !this.idOrcamento.equals(other.idOrcamento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.TabelaOrcamentoProduto[ idOrcamento=" + idOrcamento + " ]";
    }

    public String getDProd1() {
        return dProd1;
    }

    public void setDProd1(String dProd1) {
        this.dProd1 = dProd1;
    }

    public BigDecimal getPUnit1() {
        return pUnit1;
    }

    public void setPUnit1(BigDecimal pUnit1) {
        this.pUnit1 = pUnit1;
    }

    public Integer getQItem1() {
        return qItem1;
    }

    public void setQItem1(Integer qItem1) {
        this.qItem1 = qItem1;
    }

    public String getDProd2() {
        return dProd2;
    }

    public void setDProd2(String dProd2) {
        this.dProd2 = dProd2;
    }

    public BigDecimal getPUnit2() {
        return pUnit2;
    }

    public void setPUnit2(BigDecimal pUnit2) {
        this.pUnit2 = pUnit2;
    }

    public Integer getQItem2() {
        return qItem2;
    }

    public void setQItem2(Integer qItem2) {
        this.qItem2 = qItem2;
    }

    public String getDProd3() {
        return dProd3;
    }

    public void setDProd3(String dProd3) {
        this.dProd3 = dProd3;
    }

    public BigDecimal getPUnit3() {
        return pUnit3;
    }

    public void setPUnit3(BigDecimal pUnit3) {
        this.pUnit3 = pUnit3;
    }

    public Integer getQItem3() {
        return qItem3;
    }

    public void setQItem3(Integer qItem3) {
        this.qItem3 = qItem3;
    }

    public String getDProd4() {
        return dProd4;
    }

    public void setDProd4(String dProd4) {
        this.dProd4 = dProd4;
    }

    public BigDecimal getPProd4() {
        return pProd4;
    }

    public void setPProd4(BigDecimal pProd4) {
        this.pProd4 = pProd4;
    }

    public Integer getQItem4() {
        return qItem4;
    }

    public void setQItem4(Integer qItem4) {
        this.qItem4 = qItem4;
    }

    public String getDProd5() {
        return dProd5;
    }

    public void setDProd5(String dProd5) {
        this.dProd5 = dProd5;
    }

    public BigDecimal getPUnit5() {
        return pUnit5;
    }

    public void setPUnit5(BigDecimal pUnit5) {
        this.pUnit5 = pUnit5;
    }

    public Integer getQItem5() {
        return qItem5;
    }

    public void setQItem5(Integer qItem5) {
        this.qItem5 = qItem5;
    }

    public String getDProd6() {
        return dProd6;
    }

    public void setDProd6(String dProd6) {
        this.dProd6 = dProd6;
    }

    public BigDecimal getPUnit6() {
        return pUnit6;
    }

    public void setPUnit6(BigDecimal pUnit6) {
        this.pUnit6 = pUnit6;
    }

    public Integer getQItem6() {
        return qItem6;
    }

    public void setQItem6(Integer qItem6) {
        this.qItem6 = qItem6;
    }

    public String getDProd7() {
        return dProd7;
    }

    public void setDProd7(String dProd7) {
        this.dProd7 = dProd7;
    }

    public BigDecimal getPProd7() {
        return pProd7;
    }

    public void setPProd7(BigDecimal pProd7) {
        this.pProd7 = pProd7;
    }

    public Integer getQItem7() {
        return qItem7;
    }

    public void setQItem7(Integer qItem7) {
        this.qItem7 = qItem7;
    }

    public String getDProd8() {
        return dProd8;
    }

    public void setDProd8(String dProd8) {
        this.dProd8 = dProd8;
    }

    public BigDecimal getPUnit8() {
        return pUnit8;
    }

    public void setPUnit8(BigDecimal pUnit8) {
        this.pUnit8 = pUnit8;
    }

    public Integer getQItem8() {
        return qItem8;
    }

    public void setQItem8(Integer qItem8) {
        this.qItem8 = qItem8;
    }

    public String getDProd9() {
        return dProd9;
    }

    public void setDProd9(String dProd9) {
        this.dProd9 = dProd9;
    }

    public BigDecimal getPUnit9() {
        return pUnit9;
    }

    public void setPUnit9(BigDecimal pUnit9) {
        this.pUnit9 = pUnit9;
    }

    public Integer getQItem9() {
        return qItem9;
    }

    public void setQItem9(Integer qItem9) {
        this.qItem9 = qItem9;
    }

    public BigDecimal getPUnit7() {
        return pUnit7;
    }

    public void setPUnit7(BigDecimal pUnit7) {
        this.pUnit7 = pUnit7;
    }

    public BigDecimal getPUnit4() {
        return pUnit4;
    }

    public void setPUnit4(BigDecimal pUnit4) {
        this.pUnit4 = pUnit4;
    }

}
