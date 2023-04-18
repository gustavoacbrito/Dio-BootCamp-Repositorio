package ClassesAprendizados.CoresDoArcoiris;

//Crie um conjunto contendo as cores do arco-íris e:
//
//        Exiba todas as cores uma abaixo da outra
//
//        A quantidade de cores que o arco-íris tem
//
//        Exiba as cores em ordem alfabética
//
//        Exiba as cores na ordem inversa da que foi informada
//
//        Exiba todas as cores que começam com a letra ”v”
//
//        Remova todas as cores que não começam com a letra “v”
//
//        Limpe o conjunto
//
//        Confira se o conjunto está vazio

import java.util.*;


public class CoresDoArcoIris {
    public static void main(String[] args) {
        ArcoIris cores = new ArcoIris("Vermelho", "Laranja", "Amarelo", "Verde", "Azul", "Anil", "Violeta");
        Set<String> coresArcoIris = new LinkedHashSet<>();
        coresArcoIris.add(cores.getCor1());
        coresArcoIris.add(cores.getCor2());
        coresArcoIris.add(cores.getCor3());
        coresArcoIris.add(cores.getCor4());
        coresArcoIris.add(cores.getCor5());
        coresArcoIris.add(cores.getCor6());
        coresArcoIris.add(cores.getCor7());
        System.out.println(coresArcoIris);
        Iterator<String> coresIterator = coresArcoIris.iterator();

        while (coresIterator.hasNext()) {
            System.out.println(coresIterator.next());
        }

        System.out.println("Existem " + coresArcoIris.size() + " cores no arco-íris");

        Set<String> coresOrdemAlfabetica = new TreeSet<>(coresArcoIris);
        System.out.println("Ordem Natural " + coresOrdemAlfabetica);

        List<String> coresArcoIris2 = new ArrayList<>(coresArcoIris);
        Collections.reverse(coresArcoIris2);
        System.out.println("Ordem reversa a de inserção " + coresArcoIris2);

        Iterator<String> coresIterator2 = coresArcoIris2.iterator();
        while (coresIterator2.hasNext()) {
            String cor = coresIterator2.next();
            if (cor.startsWith("V")) {
                coresIterator2.remove();
            }
        }
        //coresArcoIris2.removeIf(cor -> cor.startsWith("V")); outra forma de fazer
        System.out.println("Sem as cores que começam com V " + coresArcoIris2);
        coresArcoIris2.clear();
        System.out.println("A lista está vazia! " + coresArcoIris2.isEmpty());


    }


    //System.out.println(cores.getCor1()+cores.getCor2()+cores.getCor3()+cores.getCor4()+cores.getCor5()+cores.getCor6()+cores.getCor7());
}


class ArcoIris {

    private final String cor1;
    private final String cor2;
    private final String cor3;
    private final String cor4;
    private final String cor5;
    private final String cor6;
    private final String cor7;

    ArcoIris(String cor1, String cor2, String cor3, String cor4, String cor5, String cor6, String cor7) {
        this.cor1 = cor1;
        this.cor2 = cor2;
        this.cor3 = cor3;
        this.cor4 = cor4;
        this.cor5 = cor5;
        this.cor6 = cor6;
        this.cor7 = cor7;
    }

    public String getCor1() {
        return cor1;
    }

    public String getCor2() {
        return cor2;
    }

    public String getCor3() {
        return cor3;
    }

    public String getCor4() {
        return cor4;
    }

    public String getCor5() {
        return cor5;
    }

    public String getCor6() {
        return cor6;
    }

    public String getCor7() {
        return cor7;
    }

}

