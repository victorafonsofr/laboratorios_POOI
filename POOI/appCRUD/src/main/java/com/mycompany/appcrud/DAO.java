/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appcrud;

import java.sql.Connection;
import java.sql.DriverAction;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author afonsvfdeb
 */
// DATA ACCESS OBJECT

public class DAO {
    
    private String usuario = "root";    
    private String senha = "";
    private String dbDriver = "com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/aulaPOO";
    private Connection con; //guarda informações da conexao com o banco
    private Statement stm; //guarda informações da instancia de conexao criada
    private ResultSet res; //guarda lista de dados consultados
    
    //primeiro metodo para se conectar ao banco
    
    public Connection conectar(){
        
        try {
            
            Class.forName(dbDriver);
            con = DriverManager.getConnection(url, usuario, senha);
            
        } catch (ClassNotFoundException ex) {

            JOptionPane.showMessageDialog(null, "driver de conexao invalido!");
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "erro ao conectar com o banco!");
        }
       
        return con;

    }
    
    public ResultSet consultar(String comando){
        
        con = conectar();
        
        try {
            //criar uma instancia de comunicacao com banco
            stm = con.createStatement(); //PREPARA O BANCO PRA RECEBER COMANDO
            //executar consulta
            res = stm.executeQuery(comando);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao consultar o banco");
        }
        
        return res;
        
    }
    
    public void inserir(String comando){
        
        try {
            con = conectar();
            
            stm = con.createStatement();
            
            stm.executeUpdate(comando);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"erro ao inserir dados");
            System.out.println("erro: " + ex);
        }
        
    }
    
    public void atualizar(String comando){
        
        try {
            con = conectar();
            stm = con.createStatement();
            stm.executeUpdate(comando);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar");
        }
        
    }
    
    public void excluir(String comando){
        try {
            con = conectar();
            stm = con.createStatement();
            stm.executeUpdate(comando);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir registro");
        }
    }
}
