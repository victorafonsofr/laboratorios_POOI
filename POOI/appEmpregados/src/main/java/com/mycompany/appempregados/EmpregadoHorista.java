/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appempregados;

import java.util.Scanner;

/**
 *
 * @author afonsvfdeb
 */
public class EmpregadoHorista extends Empregado {
    
    private Integer nHoras;
    private Double precoHora;
    
    public EmpregadoHorista(){
        
        super();
        nHoras = 0;
        precoHora = 0.0;
    
    }
    

    public Integer getnHoras() {
        return nHoras;
    }

    public void setnHoras(Integer nHoras) {
        this.nHoras = nHoras;
    }

    public Double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(Double precoHora) {
        this.precoHora = precoHora;
    }
    
    public void inserirDadosHorista(){
        
        input = new Scanner(System.in);
        super.inserirDadosEmpregado();
        
        System.out.println("Insira o numero de horas");
        nHoras = input.nextInt();
        System.out.println("Insira o preco da hora");
        precoHora = input.nextDouble();
        
        
    }
    
    public Double salarioHorista(){
        
        return nHoras*precoHora*0.85;
    }
}
