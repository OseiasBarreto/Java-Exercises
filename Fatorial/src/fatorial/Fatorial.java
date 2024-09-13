package fatorial;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in); 
            System.out.println("|------------------|");
            System.out.println("| Cálculo Fatorial |");
            System.out.println("|------------------|");
            System.out.print("Digite o valor: ");
            int n1 = sc.nextInt();
            
            int fatorial = 1;
            
            
            System.out.print(n1 + "! = ");
            for (int i = n1; i >= 1; i--) {
                fatorial *= i;
                
                if (i > 1) {
                    System.out.print(i + " * ");
                } else {
                    System.out.print(i + " = ");
                }
            }
            
            
            System.out.println(fatorial);
        }
    }
