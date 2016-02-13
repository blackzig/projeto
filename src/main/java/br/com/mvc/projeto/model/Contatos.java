/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mvc.projeto.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Michel A. Medeiros
 */
@Entity
@Table(name = "contatos")
@NamedQueries({
    @NamedQuery(name = "Contatos.findAll", query = "SELECT c FROM Contatos c"),
    @NamedQuery(name = "Contatos.findByIdContatos", query = "SELECT c FROM Contatos c WHERE c.idContatos = :idContatos"),
    @NamedQuery(name = "Contatos.findByEmail", query = "SELECT c FROM Contatos c WHERE c.email = :email"),
    @NamedQuery(name = "Contatos.findByNome", query = "SELECT c FROM Contatos c WHERE c.nome = :nome"),
    @NamedQuery(name = "Contatos.findBySobrenome", query = "SELECT c FROM Contatos c WHERE c.sobrenome = :sobrenome"),
    @NamedQuery(name = "Contatos.findByTelefone", query = "SELECT c FROM Contatos c WHERE c.telefone = :telefone"),
    @NamedQuery(name = "Contatos.findByVersion", query = "SELECT c FROM Contatos c WHERE c.version = :version")})
public class Contatos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_contatos")
    private Long idContatos;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="E-mail inválido")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "sobrenome")
    private String sobrenome;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "telefone")
    private String telefone;
    @Basic(optional = false)
    @NotNull
    @Column(name = "version")
    private long version;
    @JoinColumn(name = "endereco", referencedColumnName = "id_endereco")
    @ManyToOne(optional = false)
    private Endereco endereco;

    public Contatos() {
    }

    public Contatos(Long idContatos) {
        this.idContatos = idContatos;
    }

    public Contatos(Long idContatos, String email, String nome, String sobrenome, String telefone, long version) {
        this.idContatos = idContatos;
        this.email = email;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        this.version = version;
    }

    public Long getIdContatos() {
        return idContatos;
    }

    public void setIdContatos(Long idContatos) {
        this.idContatos = idContatos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idContatos != null ? idContatos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contatos)) {
            return false;
        }
        Contatos other = (Contatos) object;
        if ((this.idContatos == null && other.idContatos != null) || (this.idContatos != null && !this.idContatos.equals(other.idContatos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.mvc.projeto.model.Contatos[ idContatos=" + idContatos + " ]";
    }
    
}
