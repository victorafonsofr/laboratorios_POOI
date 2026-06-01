/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.appconta;

import java.util.Scanner;
/**
 *
 * @author afonsvfdeb
 */
public class AppConta {

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1, "fonfonmaladeza", 25.1);
        Scanner s = new Scanner(System.in);
        
        System.out.println("1. consultar saldo\n2. saque\n3. depósito \n");
        int op = s.nextInt();
        Double valor;
        
        switch(op){
            
            case 1:
                conta.consultarSaldo();
            break;
                
            case 2:
                System.out.println("digite o valor a ser sacado.");
                valor = s.nextDouble();
                conta.setSaldo(conta.sacar(valor));
            break;
            
            case 3:
                System.out.println("digite o valor a ser depositado.");
                valor = s.nextDouble();
                conta.setSaldo(conta.deposito(valor));
        }
        
        
    }
}
