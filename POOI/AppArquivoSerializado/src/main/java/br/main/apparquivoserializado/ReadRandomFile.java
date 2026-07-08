/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.main.apparquivoserializado;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sdc.daniel
 */
public class ReadRandomFile {

    private RandomAccessFile input;

    public void openFile() {
        try {
            input = new RandomAccessFile("clients.dat", "r");
        } catch (FileNotFoundException ex) {
            System.out.println("Arquivo não encontrado!");
        }
    }

    public void closeFile() {
        //verificar se o arquivo foi aberto
        if (input != null)
            try {
            input.close();
        } catch (IOException ex) {
            System.out.println("Erro ao fechar o arquivo!");
            System.exit(1);
        }
    }

    public void readRecords() {
        //Instanciando um objeto da classe
        //RandomAccessAccountRecord para atualizar os dados
        //do arquivo nos atributos da classe AccountRecords
        RandomAccessAccountRecord registro = new RandomAccessAccountRecord();
        //estrutura de repetição para percorrer o arquivo
        try {
            while (true) {
                do {
                    //Lendo registro por registro
                    registro.read(input);
                } while (registro.getAccount() == 0);
                //Se leu imprime o registro
                System.out.println("Account:" + registro.getAccount() + "\t"
                        + "firsName:" + registro.getFirstName() + "\t"
                        + "lastName:" + registro.getLastName() + "\t"
                        + "balance:" + registro.getBalance());
            }
        } catch (EOFException ex){
            System.out.println("Chegou ao final do arquivo!");
        } catch (IOException ex) {
            System.out.println("Erro ao ler o arquivo!");
            System.exit(1);
        }
    }
}
