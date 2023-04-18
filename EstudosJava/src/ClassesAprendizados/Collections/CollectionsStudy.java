package ClassesAprendizados.Collections;


import java.util.*;


public class CollectionsStudy {
    public static void main(String[] args) {

        //List notas = new ArrayList<>();
        //List<Double> notas = new ArrayList<>();
        //ArrayList<Double> notas = new ArrayList<>();
        List<Double> notas = new ArrayList<>();
        //List<Double> notas = Arrays.asList(1,2,3,4,5,6,7.5); //não permite adicionar e remover elementos

        notas.add(1.5);
        notas.add(2.5);
        notas.add(1.5);
        notas.add(3.5);
        notas.add(5.5);
        notas.add(13.5);
        notas.add(19.5);
        notas.remove(0);
        notas.set(2, 655.58);

        System.out.println(notas);
        System.out.println(notas.contains(13.53));
        System.out.println(notas.get(5));
        System.out.println(Collections.min(notas));
        System.out.println(Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();

        double soma = 0.0;
        while (iterator.hasNext()) {
            double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);
        System.out.println(notas.size());
        System.out.printf("%.2f%n", soma / notas.size());


    }
}
