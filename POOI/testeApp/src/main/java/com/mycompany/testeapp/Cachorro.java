/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testeapp;

/**
 *
 * @author afonsvfdeb
 */
public class Cachorro {
    
    private String nome;
    private String raca;
    private Integer idade;
    private double peso;
    
    //construtor nulo
    
    public Cachorro(){
        peso = 0.0;
        nome = "";
        raca = "";
        idade = 0;
    }
    
    //construtor com 3 parametros
    
    public Cachorro(String nome, Double peso, Integer idade, String raca){
        this.nome = nome;
        this.peso = peso;
        this.idade = idade;
        this.raca = raca;
    }

    //getter e setters
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }   

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
  //funções e procedures
    
    public void imprimirDawg(){
        System.out.println("Peso: "+peso);
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Raça: "+raca);
    }
    
    
    public void latir(){
        
        System.out.println("nome: "+nome+"\nAUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        
    }
    
    public void dormir(){
        
        System.out.println("nome: "+nome+"zzzzzzzzzzzzzzzz");
        
    }   
    
}
