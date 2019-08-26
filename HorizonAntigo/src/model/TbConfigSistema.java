

package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Jaison J. Vieira
 */
@Entity
@Table(name = "tb_config_sistema")
@NamedQueries({
    @NamedQuery(name = "TbConfigSistema.findAll", query = "SELECT t FROM TbConfigSistema t")
    , @NamedQuery(name = "TbConfigSistema.findByIdEmpConfig", query = "SELECT t FROM TbConfigSistema t WHERE t.idEmpConfig = :idEmpConfig")
    , @NamedQuery(name = "TbConfigSistema.findByNomeEmpConfig", query = "SELECT t FROM TbConfigSistema t WHERE t.nomeEmpConfig = :nomeEmpConfig")
    , @NamedQuery(name = "TbConfigSistema.findByEnderecoEmpConfig", query = "SELECT t FROM TbConfigSistema t WHERE t.enderecoEmpConfig = :enderecoEmpConfig")
    , @NamedQuery(name = "TbConfigSistema.findByNumEmpConfig", query = "SELECT t FROM TbConfigSistema t WHERE t.numEmpConfig = :numEmpConfig")
    , @NamedQuery(name = "TbConfigSistema.findByBairroEmpConfig", query = "SELECT t FROM TbConfigSistema t WHERE t.bairroEmpConfig = :bairroEmpConfig")
    , @NamedQuery(name = "TbConfigSistema.findByCidadeEmpCliente", query = "SELECT t FROM TbConfigSistema t WHERE t.cidadeEmpCliente = :cidadeEmpCliente")
    , @NamedQuery(name = "TbConfigSistema.findByTelefoneEmpCliente", query = "SELECT t FROM TbConfigSistema t WHERE t.telefoneEmpCliente = :telefoneEmpCliente")
    , @NamedQuery(name = "TbConfigSistema.findByEmailEmpCliente", query = "SELECT t FROM TbConfigSistema t WHERE t.emailEmpCliente = :emailEmpCliente")})
public class TbConfigSistema implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_emp_config")
    private Integer idEmpConfig;
    @Basic(optional = false)
    @Column(name = "nome_emp_config")
    private String nomeEmpConfig;
    @Column(name = "endereco_emp_config")
    private String enderecoEmpConfig;
    @Column(name = "num_emp_config")
    private Integer numEmpConfig;
    @Column(name = "bairro_emp_config")
    private String bairroEmpConfig;
    @Column(name = "cidade_emp_cliente")
    private String cidadeEmpCliente;
    @Column(name = "telefone_emp_cliente")
    private String telefoneEmpCliente;
    @Column(name = "email_emp_cliente")
    private String emailEmpCliente;

    public TbConfigSistema() {
    }

    public TbConfigSistema(Integer idEmpConfig) {
        this.idEmpConfig = idEmpConfig;
    }

    public TbConfigSistema(Integer idEmpConfig, String nomeEmpConfig) {
        this.idEmpConfig = idEmpConfig;
        this.nomeEmpConfig = nomeEmpConfig;
    }

    public Integer getIdEmpConfig() {
        return idEmpConfig;
    }

    public void setIdEmpConfig(Integer idEmpConfig) {
        this.idEmpConfig = idEmpConfig;
    }

    public String getNomeEmpConfig() {
        return nomeEmpConfig;
    }

    public void setNomeEmpConfig(String nomeEmpConfig) {
        this.nomeEmpConfig = nomeEmpConfig;
    }

    public String getEnderecoEmpConfig() {
        return enderecoEmpConfig;
    }

    public void setEnderecoEmpConfig(String enderecoEmpConfig) {
        this.enderecoEmpConfig = enderecoEmpConfig;
    }

    public Integer getNumEmpConfig() {
        return numEmpConfig;
    }

    public void setNumEmpConfig(Integer numEmpConfig) {
        this.numEmpConfig = numEmpConfig;
    }

    public String getBairroEmpConfig() {
        return bairroEmpConfig;
    }

    public void setBairroEmpConfig(String bairroEmpConfig) {
        this.bairroEmpConfig = bairroEmpConfig;
    }

    public String getCidadeEmpCliente() {
        return cidadeEmpCliente;
    }

    public void setCidadeEmpCliente(String cidadeEmpCliente) {
        this.cidadeEmpCliente = cidadeEmpCliente;
    }

    public String getTelefoneEmpCliente() {
        return telefoneEmpCliente;
    }

    public void setTelefoneEmpCliente(String telefoneEmpCliente) {
        this.telefoneEmpCliente = telefoneEmpCliente;
    }

    public String getEmailEmpCliente() {
        return emailEmpCliente;
    }

    public void setEmailEmpCliente(String emailEmpCliente) {
        this.emailEmpCliente = emailEmpCliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmpConfig != null ? idEmpConfig.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbConfigSistema)) {
            return false;
        }
        TbConfigSistema other = (TbConfigSistema) object;
        if ((this.idEmpConfig == null && other.idEmpConfig != null) || (this.idEmpConfig != null && !this.idEmpConfig.equals(other.idEmpConfig))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.TbConfigSistema[ idEmpConfig=" + idEmpConfig + " ]";
    }

}
