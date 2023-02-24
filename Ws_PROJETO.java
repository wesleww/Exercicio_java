/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */


package com.mycompany.ws_projeto;

import java.util.Scanner;
public class Ws_PROJETO {

    public static void main(String[] args) {
  //Exercicio 1
        
      //  System.out.println("Wesley da Silva santos");
   
        
     Exercicio 2 
    
    Scanner w = new Scanner(System.in);
    System.out.println("Digite o primeiro numero: ");
    int n1 = w.nextInt();
    System.out.println("Digite o Segundo número: ");
    int n2 = w.nextInt();
    
    int media = (n1 * n2);
    
    System.out.printf("O produto é: " + media);
    
    ////////////////////////////////////////////////////////////////
     Exercicio 3
            
        
   Scanner c = new Scanner(System.in);
   System.out.println("Digite o primeiro numero: ");
   int p1 = c.nextInt();
   System.out.println("Digite o segundo numero:" );
   int p2 = c.nextInt();
   System.out.println("Digite o terceiro numero:" );
   int p3 = c.nextInt();
   
   
   int media = (p1 + p2 + p3) / 3;
   
   System.out.printf("A media da aritmetica é: " + media);
   
       
  /////////////////////////////////////////////////      
   //Exercicio 4

   Scanner c = new Scanner(System.in);
   System.out.println("Digite o primeiro numero: ");
   int p1 = c.nextInt();
   System.out.println("Digite o segundo numero:" );
   int p2 = c.nextInt();
   System.out.println("Digite o terceiro numero:" );
   int p3 = c.nextInt();
   
   
   int media = (p1 + p2 + p3) / 3;
   
   System.out.printf("media : " + media);



////////////////////////////////////////////////////////

Exercicio 5
        
     
        
        
        System.out.print("Digite um número: ");
    Scanner n = new Scanner(System.in);
    int n1 = n.nextInt();
    
    int antecessor = n1 - 1;
    int sucessor = n1 + 1;
    
    System.out.printf("antecessor é: " + antecessor);
     System.out.printf("sucessor é: " + sucessor);
    
   /////////////////////////////////////////////////
    
   Exercicio 6
   
   Scanner p = new Scanner(System.in);
  System.out.println("informe um número: ");
   int pr = p.nextInt();
  Scanner v = new Scanner(System.in);
  System.out.println("informe o terço do número: ");
   int terço = v.nextInt();
   
   int media = (pr / terço);
   
   
   System.out.printf("O Terço é: " + media);
   
   
    
    
    
    }
}
