package ClassesAprendizados;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma nota de 0 a 10");
        int nota = scanner.nextInt();

        while (nota > 10 || nota < 0) {
            System.out.println("Valor inválido! Digite uma nota de 0 a 10");
            nota = scanner.nextInt();

        }
        System.out.println("A nota digitada foi: " + nota);
    }


}
