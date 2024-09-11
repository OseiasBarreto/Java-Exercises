
package par_impar;

import java.util.Scanner;

/**
 *
 * @author oseias
 */
public class Par_Impar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner sc = new Scanner(System.in);
       System.out.println("------------------------");
       System.out.println("VERIFICAÇÃO DE PARIDADE");
       System.out.println("------------------------");
        System.out.print("Digite o valor: ");
       int valor = sc.nextInt();
       int result = (valor%2);
        if (result == 0) {
            System.out.println(valor + " é par");
        }else{
            System.out.println(valor + " é ímpar");
        } 
    }
}
