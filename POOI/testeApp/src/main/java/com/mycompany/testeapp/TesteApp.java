/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testeapp;

/**
 *
 * @author afonsvfdeb
 */
public class TesteApp {

    public static void main(String[] args) {
        Cachorro rex = new Cachorro();
        rex.imprimirDawg();
        rex.latir();
        rex.setNome("marreco");
        System.out.println("nome definido: "+rex.getNome());
    }
}
