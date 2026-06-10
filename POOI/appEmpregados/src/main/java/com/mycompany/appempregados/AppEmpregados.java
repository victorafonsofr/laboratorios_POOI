/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.appempregados;

import java.util.Scanner;

/**
 *
 * @author afonsvfdeb
 */
public class AppEmpregados extends Empregado{
    
    
    
    public static void main(String[] args) {
        Empregado[] empregado = new Empregado[10];
        
        Scanner s = new Scanner(System.in);
        Integer op = 0;
        Integer index = 0;
        
        while (op!=4){
            
            System.out.println("Bem vindo ao Menu de Contabilidade e Recursos Humanos");
            System.out.println("[1] - Cadastrar empregado CLT\n[2] - Cadastrar empregado horista");
            System.out.println("[3] - Imprimir relatorio de empregados\n[4] - Sair");
           
            op = s.nextInt();
                
            switch (op) {
            //cadastro clt
                case 1:
                    
                    if(index < 10){
                    
                        empregado[index] = new EmpregadoCLT();
                        ((EmpregadoCLT) empregado[index]).inserirDadosCLT();
                        index++;
                            
                    }else{
                        System.out.println("Não é possivel inserir mais empregados");
                    }
                    
                    
                    break;
            //cadastro horista
                case 2:
                    
                    if(index < 10){
                    
                        empregado[index] = new EmpregadoHorista();
                        ((EmpregadoHorista) empregado[index]).inserirDadosHorista();
                        index++;
                    
                    }else{
                        System.out.println("Não é possivel inserir mais empregados");
                    }
                    
                    break;
            //imprimir relatorio
                case 3:
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("digite um valor valido!");
                    break;
            }
                
            
            
            
        }

    }
   
}
