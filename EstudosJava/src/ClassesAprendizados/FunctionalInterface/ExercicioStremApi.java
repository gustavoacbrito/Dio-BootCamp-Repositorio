package ClassesAprendizados.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ExercicioStremApi {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5"); //List números aleatórios
        System.out.println("Imprima todos os elementos dessa lista de String: "); //imprimir os elementos d list de string
        //forEach sem reference method
        /*numerosAleatorios.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        */

        numerosAleatorios.forEach(System.out::println); //forEach com reference method

        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set: "); //colocar os 5 primeiros em um set

        Set<String> numerosAleatorios1 = numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet());
        System.out.println(numerosAleatorios1);

        System.out.println("Transforme esta lista de String em uma lista de números inteiros: "); //converter de string para inteiros

        List<Integer> numerosAleatorios2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(numerosAleatorios2);

        System.out.println("Pegue os números pares e maiores que 2 e coloque em um alista: ");  //separa os valores maiores que 2 e pares

        //Usando Reference Method

        /*List<Integer> numerosParesMaiorQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(integer->integer % 2 == 0 && integer > 2)
                .collect(Collectors.toList());
        System.out.println(numerosParesMaiorQue2);
         */

        //Usando lambda expression

        /*List<Integer> numerosParesMaiorQue2 = numerosAleatorios.stream()
                .map(numeros->Integer.parseInt(numeros))
                .filter(integer->integer % 2 == 0 && integer > 2)
                .collect(Collectors.toList());
        System.out.println(numerosParesMaiorQue2);
        */

        //Utilizando classe anônima

        List<Integer> numerosParesMaiorQue2 = numerosAleatorios.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String numeros) {
                return Integer.parseInt(numeros);
            }
        }).filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0 && integer > 2;
            }
        }).collect(Collectors.toList());
        System.out.println(numerosParesMaiorQue2);

        System.out.println("Mostre a média dos números: ");
            numerosAleatorios.stream()
                    .mapToInt(Integer::parseInt) //mapToInt permite converter para inteiro e fazer operações com os valores
                    .average()
                    .ifPresent(System.out::println); //ifPresent recebe um Consumer (new Consumer)
        System.out.println("Remova os valores Impares: ");
        List<Integer> numerosSemImpares = numerosAleatorios.stream()
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
        numerosSemImpares.removeIf(integer -> integer % 2 != 0);
        System.out.println(numerosSemImpares);

    }
}
