package ClassesAprendizados;

import java.util.Arrays;
import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int maiorValor = Integer.MIN_VALUE;
        for (int i = 0; i < numeros.length;i++){
            System.out.println("Digite o " + (i+1) + "º número");
            numeros[i] = scanner.nextInt();
            if (numeros[i]>maiorValor){
                maiorValor = numeros[i];
            }

        }
        int soma = 0;
        int pos = 0;
        do{
            soma += numeros[pos];
            pos++;
        }while(pos <= (numeros.length) - 1);

        double media = (double) soma / numeros.length;

        System.out.println(Arrays.toString(numeros));
        System.out.println( "Soma : " +soma);
        System.out.println("Média : " + media);
        System.out.println("Maior valor : "+ maiorValor);
    }


}

