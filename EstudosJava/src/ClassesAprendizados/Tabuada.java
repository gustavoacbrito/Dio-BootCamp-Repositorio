package ClassesAprendizados;

import java.util.Locale;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número que deseja calcular a tabuada: ");
        double numero = scanner.nextDouble();
        for(int i = 0;i<=10; i++){
            double multiplicacao = numero * i;
            System.out.println(numero+" x "+i+" = "+multiplicacao);
        }

    }
}
