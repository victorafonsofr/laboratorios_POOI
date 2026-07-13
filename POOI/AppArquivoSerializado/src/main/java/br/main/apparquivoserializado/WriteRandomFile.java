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
import javax.swing.JOptionPane;

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
            JOptionPane.showMessageDialog(null, "Arquivo não encontrado");
        }
    }
    
    public void closeFile(){
        if(output!=null)
            try {
                output.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar arquivo");
                System.exit(1);
        }
    }
    public void addRecords(Integer account, String firstName, String lastName, Double balance) {
        RandomAccessAccountRecord registro = new RandomAccessAccountRecord(account, firstName, lastName, balance);

        if (registro.getAccount() > 0 && registro.getAccount() <= NUMBER_RECORDS) {
            try {
                openFile(); 
                output.seek((registro.getAccount() - 1) * RandomAccessAccountRecord.SIZE);
                registro.write(output);
                closeFile();

                javax.swing.JOptionPane.showMessageDialog(null, "Registro inserido com sucesso!");
            } catch (java.io.IOException ex) {
                javax.swing.JOptionPane.showMessageDialog(null, "Erro ao acessar o arquivo: " + ex.getMessage());
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Por favor, insira um número de conta entre 1 e 100");
        }
    }    
}
