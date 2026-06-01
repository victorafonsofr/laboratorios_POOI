/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appheranca;

/**
 *
 * @author afonsvfdeb
 */
public class Professor extends Pessoa{
    
    private String disciplina;
    private Double salario;
    
    public Professor(){
        disciplina = "";
        salario = 0.0;
    }
    
    public Professor(String nome, String CPF, String dataNasc, String disciplina, Double salario){
        
        super(nome, CPF, dataNasc); //chama o construtor da classe pai e ja preenche
        this.disciplina = disciplina;
        this.salario = salario;
                
    }
    
    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    public void imprimirProfessor(){
        super.imprimirPessoa();
        System.out.println("Disciplina: " + disciplina + "\nSalario: "+salario);
    }
    
}
