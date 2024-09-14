/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class MaiordeIdade1 {

    public static void main(String[] args) {
        //ENTRADA
        
        Scanner scanner = new Scanner(System.in);
        int idade;
        
       //PROCESSAMENTO
       idade = scanner.nextInt();
       if(idade >= 18) {
           System.out.println ("----- Programa de comparação maior de idade-----");
           System.out.println ("Aluno maior de idade");

       }

       else{
           System.out.println ("Aluno menor de idade");
       }
    }   
}      