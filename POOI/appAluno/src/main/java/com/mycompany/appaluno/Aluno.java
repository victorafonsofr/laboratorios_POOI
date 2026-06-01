/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appaluno;

/**
 *
 * @author afonsvfdeb
 */
public class Aluno {
    
    private String nome;
    private Integer matricula;
    private Double[] notas;
    
    public Aluno(){
        
        nome = "";
        matricula = 0;
        notas = new Double[3];
        
        for(int i = 0; i<3; i++) notas[i] = 0.0;
        
    }
    
    public Aluno(String nome, Integer matricula, Double n1, Double n2 ,Double n3){
        
        this.nome = nome;
        this.matricula = matricula;
        notas = new Double[3];
        notas[0] = n1;
        notas[1] = n2;
        notas[2] = n3;
        
    }
    
        public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Double[] getNotas() {
        return notas;
    }

    public void setNotas(Double[] notas) {
        this.notas = notas;
    }
    
    public Double media(){
        Double soma = 0.0;
        
        for(int i = 0 ; i<3; i++){
            soma+=notas[i];
        }
        
        return soma/3;
        
    }
    
    public void verificarAprovacao(){
        
        Double soma = 0.0;
        
        for(int i = 0 ; i<3; i++){
            soma+=notas[i];
        }
        
        if(soma<60){
            System.out.println("Reprovado");
        }
        else{
            System.out.println("Aprovado");
        }
        
    }
}
