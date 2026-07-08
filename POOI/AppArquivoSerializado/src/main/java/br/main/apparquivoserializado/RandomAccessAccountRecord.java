/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.main.apparquivoserializado;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author sdc.daniel
 */
public class RandomAccessAccountRecord extends AccountRecord{
    //Tamanho em bytes das informações 
    //um inteiro 4 bytes;
    //uma string 15 caracteres (30 bytes);-> 60 bytes
    //um double tem 8 bytes
    //Total em bytes do registro: 72 bytes
    public static final Integer SIZE=72; //tamanho em bytes de cada registro
    
    public RandomAccessAccountRecord(){
        super(0,"","",0.0);
    }
    
    public RandomAccessAccountRecord(Integer account,
            String firstName, String lastName, Double balance){
        super(account,firstName,lastName,balance);
    }
    
    public void read(RandomAccessFile file) throws IOException{
        //lê o arquivo e atualiza os atributos da classe
        setAccount(file.readInt());
        setFirstName(readName(file));
        setLastName(readName(file));
        setBalance(file.readDouble());
    }

    public String readName(RandomAccessFile file) throws IOException {
        char name[]=new char[15],temp;
        for(int count=0;count<name.length;count++){
            temp = file.readChar();
            name[count]=temp;
        }
        //transformando o vetor de caracteres para string
        return new String(name).replace('\0',' ');
    }

    public void write(RandomAccessFile file) throws IOException{
        file.writeInt(getAccount());
        writeName(file,getFirstName());
        writeName(file,getLastName());
        file.writeDouble(getBalance());
    }

    public void writeName(RandomAccessFile file, String name) throws IOException {
        StringBuffer buffer = null;
        //verificando se a string não é nula
        if(name!=null)
            buffer = new StringBuffer(name);
        else
            buffer = new StringBuffer(15);
        //define o tamanho buffer
        buffer.setLength(15);
        file.writeChars(buffer.toString());
    }
}
