/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ncomplexos;

/**
 *
 * @author afonsvfdeb
 */
public class Ncomplexos {

    public static void main(String[] args) {
        
        NComplexo n[] = new NComplexo[2];
        NComplexo res = new NComplexo();
        
        for(int i = 0; i<2;i++) n[i] = new NComplexo(1.5, 2.1);
        
        //testando o resultado
        
        res = n[0].soma(n[1]);
        res.printComplexo();
        
        res = res.subtracao(n[1]);
        
        res.printComplexo();
        System.out.println(res.modulo());
        System.out.println(res.argumento());

    }
}
