package ClassesAprendizados;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número");
        int numero = scanner.nextInt();
        int produto = 1;
        if (numero > 0) {
            for (int i = 0; i < numero; i++) {
                produto *= (numero - i);

            }
            System.out.println("O fatorial de " + numero + " é: " + produto);
        }

    }
}



