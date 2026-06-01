/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import java.util.Scanner;

/**
 *
 * @author afonsvfdeb
 */
public abstract class Funcionario {
    
    protected String nome;
    protected Integer cod;
    protected Double rendaBas;
    
    public Funcionario(){
        
        nome = "";
        cod = 0;
        rendaBas = 1000.0;
        
    }
    
    public Funcionario(String nome, Integer cod, Double rendaBas){
        
        this.nome = nome;
        this.cod = cod;
        this.rendaBas = rendaBas;
        
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public Double getRendaBas() {
        return rendaBas;
    }

    public void setRendaBas(Double rendaBas) {
        this.rendaBas = rendaBas;
    }
    
    public void inserirDados(){
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com o nome do funcionario(a)");
        nome = input.next();
        
        System.out.println("Entre com o cpf do funcionario(a)");
        cod = input.nextInt();
        
    }
    
    public abstract Double calculoRenda();
    
}
