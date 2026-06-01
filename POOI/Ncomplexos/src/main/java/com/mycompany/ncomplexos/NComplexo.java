/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ncomplexos;

/**
 *
 * @author afonsvfdeb
 */
public class NComplexo {

    private Double real;
    private Double img;
    
    public NComplexo(){
        
        real = 0.0;
        img = 0.0;
        
    }
    
    public NComplexo(Double real, Double img){
        this.real = real;
        this.img = img;
    }
    
    public Double getReal() {
        return real;
    }

    public void setReal(Double real) {
        this.real = real;
    }

    public Double getImg() {
        return img;
    }

    public void setImg(Double img) {
        this.img = img;
    }
    
    public Double modulo(){
        
        return Math.sqrt(Math.pow(real,2)+Math.pow(img,2));
    }
    
    public Double argumento(){
        return Math.atan(img/real);
    }
    
    public NComplexo soma(NComplexo n){
        
        //numero complexo teporario
        NComplexo temp = new NComplexo();
        
        temp.real = real + n.real;
        temp.img = img + n.img;
        
        //retornando o objeto com os devidos somatorios
        return temp;
        
    }
    public NComplexo subtracao(NComplexo n){
        
        //numero complexo teporario
        NComplexo temp = new NComplexo();
        
        temp.real = real - n.real;
        temp.img = img - n.img;
        
        //retornando o objeto com os devidos somatorios
        return temp;
        
    }
    
    public void printComplexo(){
        
        System.out.println("Numero complexo : " + real + " + " + img + "i" );
        
    }
}
