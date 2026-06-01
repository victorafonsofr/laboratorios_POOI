/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appheranca;

/**
 *
 * @author afonsvfdeb
 */
public class Pessoa {
    
    protected String nome;
    protected String CPF;
    protected String dataNasc;

    public Pessoa(){
       nome = "";
       CPF = "";
       dataNasc = "";
            
    }
    
    public Pessoa(String nome, String CPF, String dataNasc){
        
        this.nome = nome;
        this.CPF = CPF;
        this.dataNasc = dataNasc;
        
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }
    
    public void imprimirPessoa(){
        System.out.println("nome: "+nome+"\nCPF: "+CPF+"\nData de nascimento: "+dataNasc);
    }
    
}
