/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author afonsvfdeb
 */
public class FEnBas extends Funcionario {
    private String escola;
    
    public FEnBas(){
        super();
        escola = "";
    }
    
    public FEnBas(String nome, Integer cod, Double rendaBas, String escola){
        super(nome, cod, rendaBas);
        this.escola = escola;
    }
    
    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }
    
    @Override
    public void inserirDados(){
        super.inserirDados();
    }

    @Override
    public Double calculoRenda() {
        return 1000.0 * 1.1;
    }
}
