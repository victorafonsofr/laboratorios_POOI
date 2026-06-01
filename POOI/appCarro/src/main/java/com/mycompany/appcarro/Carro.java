/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appcarro;

/**
 *
 * @author afonsvfdeb
 */
public class Carro {
    
    private String marca;
    private String modelo;
    private Integer velocidadeAtual;
    
    public Carro(){
    
        marca = "";
        modelo = "";
        velocidadeAtual = 0;
        
    }
    
    public Carro(String marca, String modelo, Integer velocidadeAtual){
    
        if(velocidadeAtual < 0 ){
            this.velocidadeAtual = 0;
        }else{
            this.velocidadeAtual = velocidadeAtual;
        }
        
        this.marca = marca;
        this.modelo = modelo;
        
    }
    
        public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(Integer velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }
    
    
    public Integer acelerar(){
        velocidadeAtual = velocidadeAtual+10;
        return velocidadeAtual;
    }
    
    public Integer frear(){
        if(velocidadeAtual-10 < 0){
            velocidadeAtual = 0;
            
        }else{
            velocidadeAtual = velocidadeAtual-10;
        }
        
        return velocidadeAtual;
    }
    
    public void exibeVelocidade(){
        System.out.println("Velocidade atual: "+ velocidadeAtual + "km/h");
    }
}
