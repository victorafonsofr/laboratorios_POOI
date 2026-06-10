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
public class EmpregadoCLT extends Empregado{
    
    private Double sBruto;

    public EmpregadoCLT(){
        super();
        sBruto = 0.0;
    }
    
    
    public Double getsBruto() {
        return sBruto;
    }

    public void setsBruto(Double sBruto) {
        this.sBruto = sBruto;
    }
    

    public void inserirDadosCLT(){
        
        input = new Scanner(System.in);
               
        super.inserirDadosEmpregado();
        System.out.println("Insira o salario bruto CLT");
        sBruto = input.nextDouble();
        
    }
    
    public Double salarioLiquidoCLT(){
        
        if (sBruto<5001)
            return sBruto*0.85;
        else
            return sBruto*0.725;
    }
}
