/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appconta;

/**
 *
 * @author afonsvfdeb
 */
public class ContaBancaria {
    
    private Integer nconta;
    private String titular;
    private Double saldo;
    
    public ContaBancaria(){
    
        nconta = 0;
        titular  = "";
        saldo = 0.0;
        
    
    }
    
    public ContaBancaria(Integer nconta, String titular, Double saldo){
        
        this.nconta = nconta;
        this.titular = titular;
        this.saldo = saldo;
        
    }
    
        public Integer getNconta() {
        return nconta;
    }

    public void setNconta(Integer nconta) {
        this.nconta = nconta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
    
    public Double deposito(Double valor){
        return saldo+valor;
    }
    
    public Double sacar(Double valor){
        if(saldo >= valor){
            return saldo-valor;
        }
        return valor;
    }
    
    public void consultarSaldo(){
        System.out.println("Saldo atual do titular "+titular+": "+saldo);
    }
    
}
