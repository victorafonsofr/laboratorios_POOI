/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appexception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author afonsvfdeb
 */
public class Exceptions {
    
    public void exemplo(){
        
       int numer[] = {4,8,16,32,65,128, 256};
       int denom[] = {2, 0, 4, 4, 0, 8};
    
    for(int i = 0; i<numer.length ; i++)
        try{
    
         System.out.println(numer[i]+" / "+ denom[i] + " = " + numer[i]/denom[i]);
        }
        catch(RuntimeException ex){
            System.out.println("Não é possível fazer divisão por zero");
        }
        //catch(ArrayIndexOutOfBoundsException ex){
        ///    System.out.println("Índice inalcançável");
        //}
    }
    
    public void throws1() throws Exception{
        System.out.println("inicio metodo 1");
       // try {
            throws2();
       // } catch (Exception ex) {
            System.out.println("digite uma idade valida");
       // }
        System.out.println("fim do metodo 1");
    }
    
    private void throws2() throws Exception{
        System.out.println("inicio metodo 2");
        Integer idade;
        idade = Integer.parseInt(JOptionPane.showInputDialog("insira uma idade"));
        System.out.println("idade informada " + idade);
        System.out.println("fim metodo 2");
    }
    
    public void lerArquivoTXT(){
        
        BufferedReader reader = null; //objeto nulo
        
        try {
            
            String file = "fileTest.txt"; //variavel local com o nome do arquivo
            
            //instanciar o objeto reader
            reader = new BufferedReader(new FileReader(file));
            //Lendo a primeira linha do arquivo
            String currentLine = reader.readLine();
            
        } catch (FileNotFoundException ex) { //arquivo nao encontrado
            System.out.println("Arquivo não encontrado!");
            
        } catch (IOException ex) { //erro na leitura do arquivo
            System.out.println("Erro na leitura do arquivo!");
        }
        
        finally{ //so é executado se nao houver exceções
            //feche o arquivo sempre que a função é executada.
            //verificando se o arquivo foi aberto:
            
            if(reader != null) 
                try {
                reader.close();
                    System.out.println("arquivo fechado com sucesso");
                } catch (IOException ex) {
                    System.out.println("Erro ao fechar arquivo");
                }
            
        }
    }
}
    
    

