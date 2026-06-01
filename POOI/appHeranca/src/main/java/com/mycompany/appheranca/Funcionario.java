/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appheranca;

/**
 *
 * @author afonsvfdeb
 */
public class Funcionario extends Pessoa {
    private Double salario;
    private String dataAdm;
    private String cargo;
    
    public Funcionario(){
        salario = 0.0;
        dataAdm = "";
        cargo = "";
    }
    
    public Funcionario(String nome, String CPF, String dataNasc, Double salario, String dataAdm, String cargo){
        
        super(nome, CPF, dataNasc);
        
        this.salario = salario;
        this.dataAdm = dataAdm;
        this.cargo = cargo;
    
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getDataAdm() {
        return dataAdm;
    }

    public void setDataAdm(String dataAdm) {
        this.dataAdm = dataAdm;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public void imprimirFuncionario(){
        super.imprimirPessoa();
        System.out.println("Salario: " + salario + "\nData da admissao: "+dataAdm+"\nCargo: "+cargo);
    }
}
