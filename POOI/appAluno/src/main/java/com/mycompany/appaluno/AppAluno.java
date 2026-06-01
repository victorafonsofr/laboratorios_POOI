/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.appaluno;

import java.util.Scanner;

/**
 *
 * @author afonsvfdeb
 */
public class AppAluno {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Aluno[] alunos = new Aluno[3];
        
        alunos[0] = new Aluno("marcos",1,12.2,4.2,31.8);
        alunos[1] = new Aluno("marqin",2,30.1,22.1,31.8);
        alunos[2] = new Aluno("marcola",3,12.2,4.2,31.8);
     
        
        for(int i = 0; i<3; i++){
            System.out.println("Media do aluno "+alunos[i].getNome()+":" + alunos[i].media());
            alunos[i].verificarAprovacao();
            System.out.println("------------------------");
        }
        
    }
}
