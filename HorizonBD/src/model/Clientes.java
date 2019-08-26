package model;

import java.sql.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Clientes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    @Column(name = "nome")
    private String nome;
    @Column(name = "rg")
    private String RG;
    @Column(name = "im")
    private String IM;
    @Column(name = "data_cadastro")
    private Date dataCadastro;
    @Column(name = "data_aniversário")
    private Date dataAniversario;
    @Column(name = "sexo")
    private Integer sexo;
    @Column(name = "obs")
    private String observacao;
    @Column(name = "verifica_cpf_cnpj")
    private Integer verifica_cpf_cnpj;
    @Column(name = "situacao")
    private Integer situacao;
    @Column(name = "excluir")
    private Integer excluir;
    @Column(name = "cpf_ou_cnpj")
    private String cpf_ou_cnpj;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.ID);
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
        final Clientes other = (Clientes) obj;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getIM() {
        return IM;
    }

    public void setIM(String IM) {
        this.IM = IM;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Date getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(Date dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    public Integer getSexo() {
        return sexo;
    }

    public void setSexo(Integer sexo) {
        this.sexo = sexo;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Integer getVerifica_cpf_cnpj() {
        return verifica_cpf_cnpj;
    }

    public void setVerifica_cpf_cnpj(Integer verifica_cpf_cnpj) {
        this.verifica_cpf_cnpj = verifica_cpf_cnpj;
    }

    public Integer getSituacao() {
        return situacao;
    }

    public void setSituacao(Integer situacao) {
        this.situacao = situacao;
    }

    public Integer getExcluir() {
        return excluir;
    }

    public void setExcluir(Integer excluir) {
        this.excluir = excluir;
    }

    public String getCpf_ou_cnpj() {
        return cpf_ou_cnpj;
    }

    public void setCpf_ou_cnpj(String cpf_ou_cnpj) {
        this.cpf_ou_cnpj = cpf_ou_cnpj;
    }
}
