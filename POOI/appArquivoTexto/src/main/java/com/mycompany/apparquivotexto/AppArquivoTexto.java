/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.apparquivotexto;

import java.util.Scanner;

/**
 *
 * @author afonsvfdeb
 */
public class AppArquivoTexto {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        Integer op;
        //instanciar createtextfile
        CreateTextFile app = new CreateTextFile();
        
        
        do{
            
            System.out.println("1 - abrir arquivo");
            System.out.println("2 - Inserir registro");
            System.out.println("3 - fechar arquivo");
            System.out.println("4 - sair");
            System.out.print("Digite uma opção \n>> ");
            
            op = s.nextInt();
            
            switch(op){
                
                case 1:
                    app.openFile();
                    break;
                    
                case 2:
                    app.addRecords();
                    break;
                    
                case 3:
                    app.closeFile();
                    break;
                    
                case 4:
                    System.out.println("saindo...");
                    System.exit(0); //sai do programa
                    break;
                    
                default:
                    System.out.println("Digite uma opcao valida");
                
            }
            
            
        }while(op!=4);

    }
}
