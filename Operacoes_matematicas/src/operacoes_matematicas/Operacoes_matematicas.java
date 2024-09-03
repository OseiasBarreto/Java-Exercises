package operacoes_matematicas;

import java.util.Scanner;

public class Operacoes_matematicas {

    public static void main(String[] args) {
       
        int n1, n2, result = 0;
        int opc;
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("************");
        System.out.println("CALCULADORA");
        System.out.println("************");
        System.out.println("SOMA = 1");
        System.out.println("Subtração = 2");
        System.out.println("Multiplicação = 3");
        System.out.println("Divisão = 4");
      
        System.out.print("Escolha a operação: ");
        opc = teclado.nextInt();
            
            
        System.out.println("Escolha o primeiro número: ");
        n1 = teclado.nextInt();
        
        System.out.println("Escolha o segundo número: ");
        n2 = teclado.nextInt();
        
        
        switch (opc){
            case 1 -> {
                result = n1 + n2;
                System.out.println("O resultado da soma é: " + result);
            }
            case 2 -> {
                result = n1 - n2;
                System.out.println("O resultado da subtração é: " + result);
            }
                
            case 3 -> {
                result = n1 * n2;
                System.out.println("O resultado da multiplicação é: " + result);
            }
                
            case 4 -> {
                if (n2 != 0){
                    result = n1 / n2;
                    System.out.println("O resultado da divisão é: " + result);        
                }else{
                    System.out.println("Erro. Divisão por ZERO");
                }
            }
            default -> System.out.println("Operação inválida");
                
        }
        teclado.close();
        
        
        
        
      
        
    }

}
