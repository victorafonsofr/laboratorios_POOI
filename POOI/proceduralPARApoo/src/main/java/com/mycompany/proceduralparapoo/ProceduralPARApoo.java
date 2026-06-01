/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proceduralparapoo;

import java.util.Scanner;
/**
 *
 * @author afonsvfdeb
 */

public class ProceduralPARApoo {

    private static Double somaAB(Double a, Double b) {
        return a+b;
    }
    
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
       // Double a = s.nextDouble(), b = s.nextDouble();
        Num n = new Num();
        
       // n.setA(a); //define a
       // n.setB(b); //define b
        
        n.setA(s.nextDouble());
        n.setB(s.nextDouble());
       
        System.out.println("soma (poo): "+ n.soma()); //poo - soma de a+b
    
       // System.out.println("soma (procedural): "+ somaAB(a,b)); //procedural
        
        System.out.println("divisao (poo): "+ n.div());
        System.out.println("multiplicacao (poo)"+ n.mult());
        System.out.println("subtracao (poo)"+ n.sub());
        
    }
}
