package ClassesAprendizados;

import java.util.Locale;
import java.util.Scanner;

public class RecebeAuxilio {

    public static void main(String[] args) {
        double mediaSalarioPerCapitaMaxima = 250.33;
        double salarioBaixaRenda = 900.60;


        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o salário mensal");
        double salarioMensal = scanner.nextDouble();
        System.out.println("Digite quantidade de dependentes");
        int dependentes = scanner.nextInt();

        double mediaSalarialPerCapita = salarioMensal / dependentes;

        if (mediaSalarialPerCapita <= mediaSalarioPerCapitaMaxima || salarioMensal <= salarioBaixaRenda) {
            System.out.println("Recebe Auxílio");
        } else {
            System.out.println("Não recebe Auxílio");
        }


    }


}
