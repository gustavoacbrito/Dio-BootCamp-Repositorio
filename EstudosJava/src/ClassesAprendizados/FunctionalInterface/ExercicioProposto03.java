package ClassesAprendizados.FunctionalInterface;

import java.util.*;

/*Dadas as seguintes informações  de id e contato, crie um dicionário e
ordene este dicionário exibindo (Nome id - Nome contato);
id = 1 - Contato = nome: Simba, numero: 2222;
id = 4 - Contato = nome: Cami, numero: 5555;
id = 3 - Contato = nome: Jon, numero: 1111;
*/
public class ExercicioProposto03 {

    public static void main(String[] args) {
        System.out.println("--\tOrdem aleatória\t--");
        Map<Integer, Contato> agenda = new HashMap<>() {{
            put(1, new Contato("Aimba", 5555));
            put(4, new Contato("Bami", 1111));
            put(3, new Contato("Con", 2222));
        }};
        System.out.println(agenda);
        for (Map.Entry<Integer, Contato> entry : agenda.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem Inserção\t--");
        Map<Integer, Contato> agenda1 = new LinkedHashMap<>() {{
            put(1, new Contato("Aimba", 5555));
            put(4, new Contato("Bami", 1111));
            put(3, new Contato("Con", 2222));
        }};
        System.out.println(agenda1);
        for (Map.Entry<Integer, Contato> entry : agenda1.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem id\t--");
        Map<Integer, Contato> agenda2 = new TreeMap<>(agenda);
        System.out.println(agenda2);
        for (Map.Entry<Integer, Contato> entry : agenda2.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem número telefone\t--");
//        Set<Map.Entry<Integer, Contato>> conjuntoContato = new TreeSet<>(new Comparator<>() {
//            @Override
//            public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
//                return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
//            }
//        });
//        conjuntoContato.addAll(agenda.entrySet());
//        for (Map.Entry<Integer, Contato> entry : conjuntoContato) {
//            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() +
//                    ": " + entry.getValue().getNome());
//        }
//        Set<Map.Entry<Integer, Contato>> conjuntoContato = new TreeSet<>(Comparator.comparing(new Function<Map.Entry<Integer, Contato>, Integer>() {
//            @Override
//            public Integer apply(Map.Entry<Integer, Contato> integerContatoEntry) {
//                return integerContatoEntry.getValue().getNumero();
//            }
//        }));
//        conjuntoContato.addAll(agenda.entrySet());
//        for (Map.Entry<Integer, Contato> entry : conjuntoContato) {
//            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() +
//                    ": " + entry.getValue().getNome());
//        }
        Set<Map.Entry<Integer, Contato>> conjuntoContato = new TreeSet<>(Comparator.comparing(cont -> cont.getValue().getNumero()));
        conjuntoContato.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry : conjuntoContato) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() +
                    ": " + entry.getValue().getNome());
        }


        System.out.println("--\tOrdem nome contato\t--");
        Set<Map.Entry<Integer, Contato>> conjuntoNomeContato = new TreeSet<>(new Comparator<>() {
            @Override
            public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
                //return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
                return cont1.getValue().getNome().compareToIgnoreCase(cont2.getValue().getNome());
            }
        });
        conjuntoNomeContato.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry : conjuntoNomeContato) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome() + " - " + entry.getValue().getNumero());


        }
    }
}

class ComparatorOrdemNumerica implements Comparator<Map.Entry<Integer, Contato>> {
    @Override
    public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
        return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
    }
}

class ComparatorOrdemNomeContato implements Comparator<Map.Entry<Integer, Contato>> {
    @Override
    public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
        return cont1.getValue().getNome().compareToIgnoreCase(cont2.getValue().getNome());
    }
}