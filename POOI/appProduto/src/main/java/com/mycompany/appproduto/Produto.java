/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appproduto;

/**
 *
 * @author afonsvfdeb
 */
public class Produto {
    
    private String nome;
    private Double preco;
    private Integer qtd;
    
    public Produto(){
        nome = "";
        preco = 0.0;
        qtd = 0;
    }
    
    public Produto(String nome, Double preco, Integer qtd){
        
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
        
    }
    
        public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQtd() {
        return qtd;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }
    
    public Integer addEstoque(Integer qtd){
        return this.qtd+qtd;
    }
    
    public Integer removeEstoque(Integer qtd){
        if(this.qtd==0 || this.qtd<qtd){
            
            System.out.println("Não foi possível remover");
            return this.qtd;
            
        }else{
            return this.qtd-qtd;
        }
    }
    
    public Double valorTotal(){
       return qtd*preco;
    }
    
    public void mostraDados(){
    
        System.out.println("Nome: "+ nome + "\nPreco: " + preco +"\nQtd: "+qtd);
    
    }
}
