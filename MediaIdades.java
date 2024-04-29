package Aulas;

import java.util.Scanner;

public class MediaIdades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int somaIdades = 0;
        int contador = 0;
        
        System.out.println("Digite as idades (digite 0 para finalizar):");
        
        while (true) {
            int idade = scanner.nextInt();
            
            if (idade == 0) {
                break;
            }
            
            somaIdades += idade;
            contador++;
        }
        
        if (contador == 0) {
            System.out.println("Nenhuma idade foi inserida.");
        } else {
            double media = (double) somaIdades / contador;
            System.out.println("A média das idades digitadas é: " + media);
        }
        
        scanner.close();
    }
}