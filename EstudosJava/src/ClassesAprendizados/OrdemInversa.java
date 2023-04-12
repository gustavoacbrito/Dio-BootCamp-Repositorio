package ClassesAprendizados;

import java.util.Arrays;
import java.util.Scanner;

public class OrdemInversa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos números deseja digitar?");
        int quantidadeNumeros = scanner.nextInt();
        int[] numeros = new int[quantidadeNumeros];

        for(int i = 0;i<numeros.length;i++){
            System.out.println("Digite o " + (i + 1) + "º número");
            numeros[i] = scanner.nextInt();
            }
        int [] numerosOrdemInversa = new int[quantidadeNumeros];
        for (int i = 0;i<numeros.length;i++){
            numerosOrdemInversa[i] = numeros[(quantidadeNumeros-1)- i];
        }
        System.out.println("Os números digitados são: " +Arrays.toString(numeros));
        System.out.println("Os números digitados em ordem inversa são: " + Arrays.toString(numerosOrdemInversa));
    }
}
