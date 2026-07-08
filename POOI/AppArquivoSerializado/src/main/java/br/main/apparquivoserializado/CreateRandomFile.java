/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.main.apparquivoserializado;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sdc.daniel
 */
public class CreateRandomFile {
    private static Integer NUMBER_RECORDS = 100;
    
    public void createFile(){
        //Criando um objeto da classe RandomAccessFile nulo
        RandomAccessFile file = null;
        
        try {
            file = new RandomAccessFile("clients.dat","rw");
            //Criando um objeto da classe RandomAccessAccountRecord
            RandomAccessAccountRecord registro = 
                    new RandomAccessAccountRecord();
            //criando a estrutura de repetição para criar o arquivo
            for(int count=0;count<NUMBER_RECORDS;count++)
                registro.write(file);
            
        } catch (FileNotFoundException ex) {
            System.out.println("Arquivo não encontrado!");
        } catch (IOException ex) {
            System.out.println("Erro ao acessar o arquivo!");
            System.exit(1);
        }finally{
            //verificando se o arquivo foi criado
            if(file!=null)
                try {
                    file.close();
            } catch (IOException ex) {
                    System.out.println("Erro ao fechar o arquivo!");
                    System.exit(1);
            }
        }
        
    }
    
}
