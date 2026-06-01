/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appheranca;

/**
 *
 * @author afonsvfdeb
 */
public class Aluno extends Pessoa{
    
    private Integer matricula;
    
    public Aluno(){
        matricula = 0;
    }
    
    public Aluno(String nome, String CPF, String dataNasc, Integer matricula){
    
        this.nome = nome;
        this.CPF = CPF;
        this.dataNasc = dataNasc;
        this.matricula = matricula;
    
    }
    
    
    
    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }
    
    public void imprimirAluno(){
        super.imprimirPessoa(); //super indica tudo o que tem na classe pai
        System.out.println("Matricula do aluno: " + matricula);
    }
    
}
