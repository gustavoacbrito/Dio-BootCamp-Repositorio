package ClassesAprendizados;

import java.util.Arrays;
import java.util.Scanner;

public class Consoante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] letras = new String[6];
        int quantidadeConsoantes = 0;
        for(int i = 0;i<letras.length;i++){
            System.out.println("Digite a " + (i + 1) + "ª letra");
            letras[i] = scanner.next();
            if (!letras[i].equalsIgnoreCase("a") &&
                !letras[i].equalsIgnoreCase("e") &&
                !letras[i].equalsIgnoreCase("i") &&
                !letras[i].equalsIgnoreCase("o") &&
                !letras[i].equalsIgnoreCase("u")){
                quantidadeConsoantes++;
            }

        }

        int contador = 0;
        int posicaoConsoante = 0;
        String [] letrasConsoantes = new String[quantidadeConsoantes];
        while (contador < letras.length){
            if (!letras[contador].equalsIgnoreCase("a") &&
                !letras[contador].equalsIgnoreCase("e") &&
                !letras[contador].equalsIgnoreCase("i") &&
                !letras[contador].equalsIgnoreCase("o") &&
                !letras[contador].equalsIgnoreCase("u")){
                letrasConsoantes[posicaoConsoante]=letras[contador];
                posicaoConsoante++;
            }
            contador++;

        }
        System.out.println(quantidadeConsoantes);
        System.out.println("As letras Digitadas são: " + Arrays.toString(letras));
        System.out.println("As consoantes digitadas são: " + Arrays.toString(letrasConsoantes));
    }


}
