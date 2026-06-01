/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.appproduto;
import java.util.Scanner;
/**
 *
 * @author afonsvfdeb
 */
public class AppProduto {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        Produto[] p = new Produto[4];
        Integer op = 0;
        
        p[0] = new Produto("raquete", 34.99, 10);
        p[1] = new Produto("notebook", 4412.99, 16);
        p[2] = new Produto("sabolete", 3.50, 19);
        p[3] = new Produto("bola", 64.99, 110);
        
        while(true){
           System.out.println("Informe a quantidade a ser adicionada ao estoque e qual produto deseja (n)");
           Integer qtd = s.nextInt();
           
           if(qtd == 0) break;
           
           op = s.nextInt();
           
           p[op].setQtd(p[op].addEstoque(qtd));
           
        }
        
        p[op].mostraDados();
        
    }
}
