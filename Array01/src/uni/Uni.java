package uni;

import java.util.Scanner;

public class Uni {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Integer[] soma = {5,9,8,2,4};
        boolean achado = false;
        Integer valor = soma [0];
        System.out.println("Digite o número que deseja buscar: ");
        valor = sc.nextInt();
   
        
        for (Integer i : soma){
            if (i == valor){
                valor = i; 
                achado = true;
                System.out.println("Valor " + valor +" encontrado");
            }   
        }
        if (achado == false){
            System.out.println("Valor " + valor +" não encontrado");
        }
    }
}

