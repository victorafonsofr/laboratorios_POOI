/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.main.apparquivoserializado;

import java.util.Scanner;

/**
 *
 * @author sdc.daniel
 */
public class AppArquivoSerializado {

    public static void main(String[] args) {
        //Instanciar os tres objetos básicos para:
        //criar o arquivo, ler e escrever
        CreateRandomFile arquivo = new CreateRandomFile();
        ReadRandomFile ler = new ReadRandomFile();
        WriteRandomFile escrever = new WriteRandomFile();
        //Criando um objeto da classe Scanner
        Scanner entrada = new Scanner(System.in);
        //Imprimir o menu de opções para o usuário
        Integer opcao = 0;
        do{
            System.out.println("1-Criar o arquivo");
            System.out.println("2-Inserir registro");
            System.out.println("3-Ler registros");
            System.out.println("4-Sair");
            System.out.print("Digite uma opção:");
            opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    arquivo.createFile();
                    System.out.println("Arquivo foi criado!");
                    break;
                case 2:
                    escrever.openFile();
                    escrever.addRecords();
                    escrever.closeFile();
                    System.out.println("Registro Inserido!");
                    break;
                case 3:
                    ler.openFile();
                    ler.readRecords();
                    ler.closeFile();
                    System.out.println("Registros lidos!");
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Digite uma opcao válida!");
            }
        }while(opcao!=4);
        
    }
}
