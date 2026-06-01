/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author afonsvfdeb
 */
public class FSemEscola extends Funcionario{
    
    public FSemEscola(){
        
        super();
        
    }
    
    public FSemEscola(String nome, Integer cod, Double rendaBas){
        super(nome, cod, rendaBas); 
    }
    
    @Override
    public void inserirDados(){
        super.inserirDados();
    }
    
    @Override
    public Double calculoRenda() {
        return 1000.0;
    }
    
    
}
