package ClassesAprendizados;

import java.util.Arrays;
import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos números deseja digitar?");
        int quantidadeNumeros = scanner.nextInt();
        int[] numeros = new int[quantidadeNumeros];
        int contadorPar = 0;
        int contadorImpar = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º número");
            numeros[i] = scanner.nextInt();
            if (numeros[i] % 2 == 0) {
                contadorPar++;
            } else {
                contadorImpar++;
            }
        }
        System.out.println("Os números digitados são: " + Arrays.toString(numeros));
        int pos = 0;
        int[] numerosPar = new int[contadorPar];
        int[] numerosImpar = new int[contadorImpar];
        int posPar = 0;
        int posImpar = 0;

        do {
            boolean testePar = (numeros[pos] % 2) == 0;
            if (testePar) {
                numerosPar[posPar] = numeros[pos];
                posPar++;
            } else {
                numerosImpar[posImpar] = numeros[pos];
                posImpar++;
            }

            pos++;
        } while (pos <= (numeros.length) - 1);

        System.out.println("Os números Pares digitados foram: "
                + Arrays.toString(numerosPar) + " Totalizando "
                + contadorPar + " números pares.");

        System.out.println("Os números Ímpares digitados foram: "
                + Arrays.toString(numerosImpar) + " Totalizando "
                + contadorImpar + " números Impares.");
    }


}