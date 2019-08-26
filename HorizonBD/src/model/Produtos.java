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
import javax.persistence.OneToOne;

@Entity
public class Produtos implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    @Column (name = "data_cadastro_produto") 
    private Date dataCadastroProduto;
    @Column (name = "data_alteracao_produto") 
    private Date dataAlteracaoProduto;
    @Column (name = "cod_barras_produto")
    private int codBarrasProduto;
    @Column (name = "cod_ref_produto")
    private int codRefProduto;
    @Column (name = "situacao_produto")
    private int situacaoProduto;
    @Column (name = "excluir_produto")
    private int excluirProduto;
    @Column (name = "nome_produto")
    private int nomeProduto;
    @ManyToOne 
    private int produtoIdUnidMedida;
    @ManyToOne
    private int produtoIdCategoria;
    @ManyToOne 
    private int IdFornecedor;
    @Column (name = "preco_custo_produto", columnDefinition="Decimal(10,2)")
    private double precoCustoProduto;
    @Column (name = "preco_venda_produto", columnDefinition="Decimal(10,2)")
    private double precoVendaProduto;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.ID);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produtos other = (Produtos) obj;
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

    public Date getDataCadastroProduto() {
        return dataCadastroProduto;
    }

    public void setDataCadastroProduto(Date dataCadastroProduto) {
        this.dataCadastroProduto = dataCadastroProduto;
    }

    public Date getDataAlteracaoProduto() {
        return dataAlteracaoProduto;
    }

    public void setDataAlteracaoProduto(Date dataAlteracaoProduto) {
        this.dataAlteracaoProduto = dataAlteracaoProduto;
    }

    public int getCodBarrasProduto() {
        return codBarrasProduto;
    }

    public void setCodBarrasProduto(int codBarrasProduto) {
        this.codBarrasProduto = codBarrasProduto;
    }

    public int getCodRefProduto() {
        return codRefProduto;
    }

    public void setCodRefProduto(int codRefProduto) {
        this.codRefProduto = codRefProduto;
    }

    public int getSituacaoProduto() {
        return situacaoProduto;
    }

    public void setSituacaoProduto(int situacaoProduto) {
        this.situacaoProduto = situacaoProduto;
    }

    public int getExcluirProduto() {
        return excluirProduto;
    }

    public void setExcluirProduto(int excluirProduto) {
        this.excluirProduto = excluirProduto;
    }

    public int getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(int nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getProdutoIdUnidMedida() {
        return produtoIdUnidMedida;
    }

    public void setProdutoIdUnidMedida(int produtoIdUnidMedida) {
        this.produtoIdUnidMedida = produtoIdUnidMedida;
    }

    public int getProdutoIdCategoria() {
        return produtoIdCategoria;
    }

    public void setProdutoIdCategoria(int produtoIdCategoria) {
        this.produtoIdCategoria = produtoIdCategoria;
    }

    public int getIdFornecedor() {
        return IdFornecedor;
    }

    public void setIdFornecedor(int IdFornecedor) {
        this.IdFornecedor = IdFornecedor;
    }

    public double getPrecoCustoProduto() {
        return precoCustoProduto;
    }

    public void setPrecoCustoProduto(double precoCustoProduto) {
        this.precoCustoProduto = precoCustoProduto;
    }

    public double getPrecoVendaProduto() {
        return precoVendaProduto;
    }

    public void setPrecoVendaProduto(double precoVendaProduto) {
        this.precoVendaProduto = precoVendaProduto;
    }
    
    
    
}
