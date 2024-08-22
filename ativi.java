import java.util.Scanner;

public class ativi {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numero = leia.nextInt();
        System.out.println("Digite um número de 1 a 5: ");
        switch (numero) {

            case 1:
            System.out.println("Número 1 foi digitado...");
            break;

            case 2:
            System.out.println("Número 2 foi digitado...");
            break;

            
            case 3:
            System.out.println("Número 3 foi digitado...");
            break;

            
            case 4:
            System.out.println("Número 4 foi digitado...");
            break;

            
            case 5:
            System.out.println("Número 5 foi digitado...");
            break;

            default:
            System.out.println("Número inválido."); //não digitou um número entre 1 e 5
            break;



        }
 

    }
}