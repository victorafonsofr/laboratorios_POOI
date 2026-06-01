/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proceduralparapoo;

/**
 *
 * @author afonsvfdeb
 */
public class Num {
    
    private Double a;
    private Double b;
    
    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

   public Num(){
       a = 0.0;
       b = 0.0;
   }
   
   public Double soma(){
       return a+b;
   }
   
   
   public Double sub(){
       return a-b;
   }
   
   
   public Double mult(){
       return a*b;
   }
   
   
   public Double div(){
       
       if(b!=0){
            return a/b;
       }
       return 0.0;
   }
   
}
