package com.example.myfirebase.modelo;

public class Pessoa {

    private String codigoPessoa;
    private String nomePessoa;
    private String emailPessoa;

    public Pessoa() {
    }

    public String getCodigoPessoa() {
        return codigoPessoa;
    }

    public void setCodigoPessoa(String codigoPessoa) {
        this.codigoPessoa = codigoPessoa;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getEmailPessoa() {
        return emailPessoa;
    }

    public void setEmailPessoa(String emailPessoa) {
        this.emailPessoa = emailPessoa;
    }

    @Override
    public String toString() {
        return this.nomePessoa;
    }
}
