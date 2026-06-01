/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.appcarro;

/**
 *
 * @author afonsvfdeb
 */
public class AppCarro {

    public static void main(String[] args) {
        
        Carro carro = new Carro("Volkswagem", "Jetta", 40 );
        
        carro.acelerar();
        carro.acelerar();
        
        carro.exibeVelocidade();
        
        carro.frear();
        carro.frear();
        
        carro.exibeVelocidade();
        
    }
}
