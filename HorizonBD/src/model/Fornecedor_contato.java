

package model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Fornecedor_contato implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    @Column
    private String email_fornecedor;
    @Column
    private String telefone_fornecedor;
    @Column
    private String whatsapp_fornecedor;
    @OneToOne
    private Fornecedor_p id_fornecedor;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getEmail_fornecedor() {
        return email_fornecedor;
    }

    public void setEmail_fornecedor(String email_fornecedor) {
        this.email_fornecedor = email_fornecedor;
    }

    public String getTelefone_fornecedor() {
        return telefone_fornecedor;
    }

    public void setTelefone_fornecedor(String telefone_fornecedor) {
        this.telefone_fornecedor = telefone_fornecedor;
    }

    public String getWhatsapp_fornecedor() {
        return whatsapp_fornecedor;
    }

    public void setWhatsapp_fornecedor(String whatsapp_fornecedor) {
        this.whatsapp_fornecedor = whatsapp_fornecedor;
    }

    public Fornecedor_p getId_fornecedor() {
        return id_fornecedor;
    }

    public void setId_fornecedor(Fornecedor_p id_fornecedor) {
        this.id_fornecedor = id_fornecedor;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.ID);
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
        final Fornecedor_contato other = (Fornecedor_contato) obj;
        if (!Objects.equals(this.ID, other.ID)) {
            return false;
        }
        return true;
    }
    
    
}
