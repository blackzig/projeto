/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mvc.projeto.dto;

import br.com.mvc.projeto.model.Endereco;

/**
 *
 * @author Michel A. Medeiros
 */
public class ContatosDTO {

    private Long idContatos;
    private String email;
    private String nome;
    private String sobrenome;
    private String telefone;
    private long version;
    private Endereco endereco;

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
    public String toString() {
        return "ContatosDTO{" + "idContatos=" + idContatos + ", email=" + email + ", nome=" + nome + ", sobrenome=" + sobrenome + ", telefone=" + telefone + ", version=" + version + ", endereco=" + endereco + '}';
    }
    
    
    
}
