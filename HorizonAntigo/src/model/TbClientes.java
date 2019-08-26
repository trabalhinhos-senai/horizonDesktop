

package model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import repository.ClientesRep;

/**
 *
 * @author Jaison J. Vieira
 */
@Entity
@Table(name = "tb_clientes")
@NamedQueries({
    @NamedQuery(name = "TbClientes.findAll", query = "SELECT t FROM TbClientes t")
    , @NamedQuery(name = "TbClientes.findByIdCliente", query = "SELECT t FROM TbClientes t WHERE t.idCliente = :idCliente")
    , @NamedQuery(name = "TbClientes.findByNomeCliente", query = "SELECT t FROM TbClientes t WHERE t.nomeCliente = :nomeCliente")
    , @NamedQuery(name = "TbClientes.findByEnderecoCliente", query = "SELECT t FROM TbClientes t WHERE t.enderecoCliente = :enderecoCliente")
    , @NamedQuery(name = "TbClientes.findByNumEnderecoCliente", query = "SELECT t FROM TbClientes t WHERE t.numEnderecoCliente = :numEnderecoCliente")
    , @NamedQuery(name = "TbClientes.findByComplementoEnderecoCliente", query = "SELECT t FROM TbClientes t WHERE t.complementoEnderecoCliente = :complementoEnderecoCliente")
    , @NamedQuery(name = "TbClientes.findByEmailCliente", query = "SELECT t FROM TbClientes t WHERE t.emailCliente = :emailCliente")
    , @NamedQuery(name = "TbClientes.findByBairroCliente", query = "SELECT t FROM TbClientes t WHERE t.bairroCliente = :bairroCliente")
    , @NamedQuery(name = "TbClientes.findByCidadeCliente", query = "SELECT t FROM TbClientes t WHERE t.cidadeCliente = :cidadeCliente")
    , @NamedQuery(name = "TbClientes.findByCepCliente", query = "SELECT t FROM TbClientes t WHERE t.cepCliente = :cepCliente")
    , @NamedQuery(name = "TbClientes.findByEstadoCliente", query = "SELECT t FROM TbClientes t WHERE t.estadoCliente = :estadoCliente")
    , @NamedQuery(name = "TbClientes.findByCpfCnpjCliente", query = "SELECT t FROM TbClientes t WHERE t.cpfCnpjCliente = :cpfCnpjCliente")
    , @NamedQuery(name = "TbClientes.findByRgIeCliente", query = "SELECT t FROM TbClientes t WHERE t.rgIeCliente = :rgIeCliente")
    , @NamedQuery(name = "TbClientes.findByImCliente", query = "SELECT t FROM TbClientes t WHERE t.imCliente = :imCliente")
    , @NamedQuery(name = "TbClientes.findByTelefoneCliente", query = "SELECT t FROM TbClientes t WHERE t.telefoneCliente = :telefoneCliente")
    , @NamedQuery(name = "TbClientes.findByCelularCliente", query = "SELECT t FROM TbClientes t WHERE t.celularCliente = :celularCliente")
    , @NamedQuery(name = "TbClientes.findByDataCadastroCliente", query = "SELECT t FROM TbClientes t WHERE t.dataCadastroCliente = :dataCadastroCliente")
    , @NamedQuery(name = "TbClientes.findByDataAlteracaoCliente", query = "SELECT t FROM TbClientes t WHERE t.dataAlteracaoCliente = :dataAlteracaoCliente")
    , @NamedQuery(name = "TbClientes.findBySexoCliente", query = "SELECT t FROM TbClientes t WHERE t.sexoCliente = :sexoCliente")
    , @NamedQuery(name = "TbClientes.findByDataAniversarioCliente", query = "SELECT t FROM TbClientes t WHERE t.dataAniversarioCliente = :dataAniversarioCliente")
    , @NamedQuery(name = "TbClientes.findByObservacaoCliente", query = "SELECT t FROM TbClientes t WHERE t.observacaoCliente = :observacaoCliente")})
public class TbClientes implements Serializable {

    @Column(name = "verificaCnpj")
    private Integer verificaCnpj;

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cliente")
    private Integer idCliente;
    @Basic(optional = false)
    @Column(name = "nome_cliente")
    private String nomeCliente;
    @Column(name = "endereco_cliente")
    private String enderecoCliente;
    @Column(name = "num_endereco_cliente")
    private Integer numEnderecoCliente;
    @Column(name = "complemento_endereco_cliente")
    private String complementoEnderecoCliente;
    @Column(name = "email_cliente")
    private String emailCliente;
    @Column(name = "bairro_cliente")
    private String bairroCliente;
    @Column(name = "cidade_cliente")
    private String cidadeCliente;
    @Column(name = "cep_cliente")
    private String cepCliente;
    @Column(name = "estado_cliente")
    private String estadoCliente;
    @Column(name = "cpf_cnpj_cliente")
    private String cpfCnpjCliente;
    @Column(name = "rg_ie_cliente")
    private String rgIeCliente;
    @Column(name = "im_cliente")
    private String imCliente;
    @Column(name = "telefone_cliente")
    private String telefoneCliente;
    @Column(name = "celular_cliente")
    private String celularCliente;
    @Column(name = "data_cadastro_cliente")
    @Temporal(TemporalType.DATE)
    private Date dataCadastroCliente;
    @Column(name = "data_alteracao_cliente")
    @Temporal(TemporalType.DATE)
    private Date dataAlteracaoCliente;
    @Column(name = "sexo_cliente")
    private Integer sexoCliente;
    @Column(name = "data_aniversario_cliente")
    @Temporal(TemporalType.DATE)
    private Date dataAniversarioCliente;
    @Column(name = "observacao_cliente")
    private String observacaoCliente;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCliente")
    private Collection<TbOrcamento> tbOrcamentoCollection;

    
    public TbClientes() {
    }

    public TbClientes(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public TbClientes(Integer idCliente, String nomeCliente) {
        this.idCliente = idCliente;
        this.nomeCliente = nomeCliente;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        Integer oldIdCliente = this.idCliente;
        this.idCliente = idCliente;
        changeSupport.firePropertyChange("idCliente", oldIdCliente, idCliente);
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        String oldNomeCliente = this.nomeCliente;
        this.nomeCliente = nomeCliente;
        changeSupport.firePropertyChange("nomeCliente", oldNomeCliente, nomeCliente);
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(String enderecoCliente) {
        String oldEnderecoCliente = this.enderecoCliente;
        this.enderecoCliente = enderecoCliente;
        changeSupport.firePropertyChange("enderecoCliente", oldEnderecoCliente, enderecoCliente);
    }

    public Integer getNumEnderecoCliente() {
        return numEnderecoCliente;
    }

    public void setNumEnderecoCliente(Integer numEnderecoCliente) {
        Integer oldNumEnderecoCliente = this.numEnderecoCliente;
        this.numEnderecoCliente = numEnderecoCliente;
        changeSupport.firePropertyChange("numEnderecoCliente", oldNumEnderecoCliente, numEnderecoCliente);
    }

    public String getComplementoEnderecoCliente() {
        return complementoEnderecoCliente;
    }

    public void setComplementoEnderecoCliente(String complementoEnderecoCliente) {
        String oldComplementoEnderecoCliente = this.complementoEnderecoCliente;
        this.complementoEnderecoCliente = complementoEnderecoCliente;
        changeSupport.firePropertyChange("complementoEnderecoCliente", oldComplementoEnderecoCliente, complementoEnderecoCliente);
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        String oldEmailCliente = this.emailCliente;
        this.emailCliente = emailCliente;
        changeSupport.firePropertyChange("emailCliente", oldEmailCliente, emailCliente);
    }

    public String getBairroCliente() {
        return bairroCliente;
    }

    public void setBairroCliente(String bairroCliente) {
        String oldBairroCliente = this.bairroCliente;
        this.bairroCliente = bairroCliente;
        changeSupport.firePropertyChange("bairroCliente", oldBairroCliente, bairroCliente);
    }

    public String getCidadeCliente() {
        return cidadeCliente;
    }

    public void setCidadeCliente(String cidadeCliente) {
        String oldCidadeCliente = this.cidadeCliente;
        this.cidadeCliente = cidadeCliente;
        changeSupport.firePropertyChange("cidadeCliente", oldCidadeCliente, cidadeCliente);
    }

    public String getCepCliente() {
        return cepCliente;
    }

    public void setCepCliente(String cepCliente) {
        String oldCepCliente = this.cepCliente;
        this.cepCliente = cepCliente;
        changeSupport.firePropertyChange("cepCliente", oldCepCliente, cepCliente);
    }

    public String getEstadoCliente() {
        return estadoCliente;
    }

    public void setEstadoCliente(String estadoCliente) {
        String oldEstadoCliente = this.estadoCliente;
        this.estadoCliente = estadoCliente;
        changeSupport.firePropertyChange("estadoCliente", oldEstadoCliente, estadoCliente);
    }

    public String getCpfCnpjCliente() {
        return cpfCnpjCliente;
    }

    public void setCpfCnpjCliente(String cpfCnpjCliente) {
        String oldCpfCnpjCliente = this.cpfCnpjCliente;
        this.cpfCnpjCliente = cpfCnpjCliente;
        changeSupport.firePropertyChange("cpfCnpjCliente", oldCpfCnpjCliente, cpfCnpjCliente);
    }

    public String getRgIeCliente() {
        return rgIeCliente;
    }

    public void setRgIeCliente(String rgIeCliente) {
        String oldRgIeCliente = this.rgIeCliente;
        this.rgIeCliente = rgIeCliente;
        changeSupport.firePropertyChange("rgIeCliente", oldRgIeCliente, rgIeCliente);
    }

    public String getImCliente() {
        return imCliente;
    }

    public void setImCliente(String imCliente) {
        String oldImCliente = this.imCliente;
        this.imCliente = imCliente;
        changeSupport.firePropertyChange("imCliente", oldImCliente, imCliente);
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        String oldTelefoneCliente = this.telefoneCliente;
        this.telefoneCliente = telefoneCliente;
        changeSupport.firePropertyChange("telefoneCliente", oldTelefoneCliente, telefoneCliente);
    }

    public String getCelularCliente() {
        return celularCliente;
    }

    public void setCelularCliente(String celularCliente) {
        String oldCelularCliente = this.celularCliente;
        this.celularCliente = celularCliente;
        changeSupport.firePropertyChange("celularCliente", oldCelularCliente, celularCliente);
    }

    public Date getDataCadastroCliente() {
        return dataCadastroCliente;
    }

    public void setDataCadastroCliente(Date dataCadastroCliente) {
        Date oldDataCadastroCliente = this.dataCadastroCliente;
        this.dataCadastroCliente = dataCadastroCliente;
        changeSupport.firePropertyChange("dataCadastroCliente", oldDataCadastroCliente, dataCadastroCliente);
    }

    public Date getDataAlteracaoCliente() {
        return dataAlteracaoCliente;
    }

    public void setDataAlteracaoCliente(Date dataAlteracaoCliente) {
        Date oldDataAlteracaoCliente = this.dataAlteracaoCliente;
        this.dataAlteracaoCliente = dataAlteracaoCliente;
        changeSupport.firePropertyChange("dataAlteracaoCliente", oldDataAlteracaoCliente, dataAlteracaoCliente);
    }

    public Integer getSexoCliente() {
        return sexoCliente;
    }

    public void setSexoCliente(Integer sexoCliente) {
        Integer oldSexoCliente = this.sexoCliente;
        this.sexoCliente = sexoCliente;
        changeSupport.firePropertyChange("sexoCliente", oldSexoCliente, sexoCliente);
    }

    public Date getDataAniversarioCliente() {
        return dataAniversarioCliente;
    }

    public void setDataAniversarioCliente(Date dataAniversarioCliente) {
        Date oldDataAniversarioCliente = this.dataAniversarioCliente;
        this.dataAniversarioCliente = dataAniversarioCliente;
        changeSupport.firePropertyChange("dataAniversarioCliente", oldDataAniversarioCliente, dataAniversarioCliente);
    }

    public String getObservacaoCliente() {
        return observacaoCliente;
    }

    public void setObservacaoCliente(String observacaoCliente) {
        String oldObservacaoCliente = this.observacaoCliente;
        this.observacaoCliente = observacaoCliente;
        changeSupport.firePropertyChange("observacaoCliente", oldObservacaoCliente, observacaoCliente);
    }

    public Collection<TbOrcamento> getTbOrcamentoCollection() {
        return tbOrcamentoCollection;
    }

    public void setTbOrcamentoCollection(Collection<TbOrcamento> tbOrcamentoCollection) {
        this.tbOrcamentoCollection = tbOrcamentoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCliente != null ? idCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbClientes)) {
            return false;
        }
        TbClientes other = (TbClientes) object;
        if ((this.idCliente == null && other.idCliente != null) || (this.idCliente != null && !this.idCliente.equals(other.idCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.TbClientes[ idCliente=" + idCliente + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

    public Integer getVerificaCnpj() {
        return verificaCnpj;
    }

    public void setVerificaCnpj(Integer verificaCnpj) {
        this.verificaCnpj = verificaCnpj;
    }

}
