/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.main.apparquivoserializado;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.RandomAccess;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sdc.daniel
 */
public class WriteRandomFile {
    private RandomAccessFile output;
    private static final Integer NUMBER_RECORDS = 100;
    
    public void openFile(){
        try {
            output = new RandomAccessFile("clients.dat","rw");
        } catch (FileNotFoundException ex) {
            System.out.println("Arquivo não encontrado!");
        }
    }
    
    public void closeFile(){
        if(output!=null)
            try {
                output.close();
        } catch (IOException ex) {
                System.out.println("Erro ao fechar o arquivo!");
                System.exit(1);
        }
    }
    
    public void addRecords(){
        //Criando um objeto da classe RandomAccessAccountRecord
        //para pegar as informações dos atributos da classe e jogar
        //no arquivo
        RandomAccessAccountRecord registro = new RandomAccessAccountRecord();
        //Criar um objeto da classe Scanner para ler dados do teclado
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o numero da conta:");
        registro.setAccount(input.nextInt());
        System.out.println("Digite o primeiro nome:");
        registro.setFirstName(input.next());
        System.out.println("Digite o ultimo nome:");
        registro.setLastName(input.next());
        System.out.println("Digite o saldo:");
        registro.setBalance(input.nextDouble());
        //verificando se o numero da conta é valido antes de inserir
        if(registro.getAccount()>0&&registro.getAccount()<=NUMBER_RECORDS){
            try {
                //Encontrando a posição correta do registro
                output.seek((registro.getAccount()-1)*RandomAccessAccountRecord.SIZE);
                //Gravando o registro no arquivo
                registro.write(output);
            } catch (IOException ex) {
                System.out.println("Erro ao inserir o registro!");
            }
        }else
            System.out.println("Por favor insira um número de conta"
                    + "entre 1 e 100");
        
    }
}
