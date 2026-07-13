/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.apparquivotexto;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author afonsvfdeb
 */
public class CreateTextFile extends AccountRecord{
    
    protected Formatter output;
    
    
    //metodo para abrir o arquivo
    public void openFile(){
        try {
            //instanciar o atributo formatter
            
            output = new Formatter("clients.txt"); //cria o novo arquivo clients.txt
            JOptionPane.showMessageDialog(null,"Arquivo aberto");
            
        } catch (FileNotFoundException ex) {
            
            JOptionPane.showMessageDialog(null,"Erro ao abrir arquivo");
        
        } catch(SecurityException ex){ //se o arquivo já estiver aberto
            JOptionPane.showMessageDialog(null,"Arquivo ja aberto");
        }
        
    }
    
    public void addRecords(){
        
        //Criando uma instacia da classe que estrutura os dados -> AccountRecord
        AccountRecord registros = new AccountRecord();
        
        //Scanner porque é uma console application
        Scanner s = new Scanner(System.in);
        
        //iniciar os passos para ler e gravar os registros
        try{
            
            System.out.println("Informe o numero da conta");
            registros.setAccount(s.nextInt()); //ler a informação
            
            System.out.println("Informe o primeiro nome");
            registros.setFirstName(s.next());
            
            System.out.println("Informe o ultimo nome");
            registros.setLastName(s.next());
            
            System.out.println("Informe o saldo");
            registros.setBalance(s.nextDouble());
            
            if(registros.getAccount() > 0){
                
                output.format("N da conta: %d\nPrimeiro Nome: %s\nUltimo nome: %s\nSaldo em conta: %.2f\n",
                        registros.getAccount(),
                        registros.getFirstName(), 
                        registros.getLastName(),
                        registros.getBalance());
                
            }else{
                
                System.out.println("Digite um numero de conta valido!");
                
            }
            
            
        }catch(FormatterClosedException ex){
               System.out.println("Erro ao gravar o registro!");
        }catch(NoSuchElementException ex){
               System.out.println("Digite as informações corretamente!"); 
        }
        
       
        
    }
    
    /**
     * Grava um registro no arquivo a partir dos dados vindos da GUI
     * (sem usar Scanner/System.in, já que numa interface gráfica
     * a entrada vem dos JTextField).
     *
     * @return true se o registro foi gravado com sucesso
     */
    public boolean addRecord(Integer account, String firstName, String lastName, Double balance){

        if(output == null){
            JOptionPane.showMessageDialog(null, "Abra o arquivo antes de inserir um registro!");
            return false;
        }

        if(account == null || account <= 0){
            JOptionPane.showMessageDialog(null, "Digite um numero de conta valido!");
            return false;
        }

        try{

            output.format("N da conta: %d\nPrimeiro Nome: %s\nUltimo nome: %s\nSaldo em conta: %.2f\n",
                    account,
                    firstName,
                    lastName,
                    balance);

            //atualiza tambem os atributos herdados de AccountRecord, se quiser consultar depois
            this.setAccount(account);
            this.setFirstName(firstName);
            this.setLastName(lastName);
            this.setBalance(balance);

            return true;

        }catch(FormatterClosedException ex){
            JOptionPane.showMessageDialog(null, "Erro ao gravar o registro! O arquivo ja foi fechado.");
            return false;
        }

    }

    public void closeFile(){
        
        //verificar se o arquivo esta aberto
        //os dados só serão escritos quando o programa for fechado
        
       if(output != null ){
           output.close();
            JOptionPane.showMessageDialog(null,"arquivo fechado com sucesso!");
       }else{
            JOptionPane.showMessageDialog(null,"Erro ao fechar arquivo");
       }
        
    }
    
    
}
