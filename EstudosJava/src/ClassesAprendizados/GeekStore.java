package ClassesAprendizados;

import java.util.Scanner;
public class GeekStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double media = scanner.nextDouble();

        if (media < 5) {
            System.out.println("REP");
        } else if (media >= 5 && media < 7) {
            System.out.println("MED");

        } else if (media >= 7) {
            System.out.println("APR");
        }
    }
}

