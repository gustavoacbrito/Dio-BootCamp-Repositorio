package ClassesAprendizados;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ConsoanteMelhorado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] letras = new String[6];
        List<String> vogais = Arrays.asList("a", "e", "i", "o", "u");

        int quantidadeConsoantes = 0;
        for (int i = 0; i < letras.length; i++) {
            System.out.println("Digite a " + (i + 1) + "ª letra");
            letras[i] = scanner.next();
            if (!vogais.contains(letras[i])) {
                quantidadeConsoantes++;
            }
        }

        int contador = 0;
        int posicaoConsoante = 0;
        String[] letrasConsoantes = new String[quantidadeConsoantes];
        while (contador < letras.length) {
            if (!vogais.contains(letras[contador])) {

                letrasConsoantes[posicaoConsoante] = letras[contador];
                posicaoConsoante++;
            }
            contador++;

        }
        System.out.println(quantidadeConsoantes);
        System.out.println("As letras Digitadas são: " + Arrays.toString(letras));
        System.out.println("As consoantes digitadas são: " + Arrays.toString(letrasConsoantes));
    }


}
