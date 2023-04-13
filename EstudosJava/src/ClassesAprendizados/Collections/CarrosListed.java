package ClassesAprendizados.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CarrosListed {
    public static void main(String[] args) {

        List<Carro> meusCarros = new ArrayList<>();
        meusCarros.add(new Carro(2018, "preto", "versa"));
        meusCarros.add(new Carro(2023, "branco", "palio"));
        meusCarros.add(new Carro(2014, "prata", "celta"));
        meusCarros.add(new Carro(2012, "azul", "gol"));
        meusCarros.add(new Carro(2020, "vermelho", "city"));
        System.out.println(Carro.getContador());
        System.out.println("Ordem de Inserção");
        System.out.println(meusCarros);
        System.out.println("Ordem Aleatória");
        Collections.shuffle(meusCarros);
        System.out.println(meusCarros);
        System.out.println("Ordem Alfabética"); //Ordem Natural
        Collections.sort(meusCarros);
        System.out.println(meusCarros);
        System.out.println("Ordem Idade");
        meusCarros.sort(new ComparatorIdade());
        System.out.println(meusCarros);
        System.out.println("Ordem Cor");
        System.out.println(meusCarros);

    }
}

class Carro implements Comparable<Carro> {

    private static int contador = 0;
    private int anoFabricacao;
    private String cor;
    private String nomeModelo;


    public Carro(int anoFabricacao, String cor, String nomeModelo) {
        this.anoFabricacao = anoFabricacao;
        this.cor = cor;
        this.nomeModelo = nomeModelo;
        contador++;
    }

    public static int getContador() {
        return contador;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNomeModelo() {
        return nomeModelo;
    }

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "anoFabricacao=" + anoFabricacao +
                ", cor='" + cor + '\'' +
                ", nomeModelo='" + nomeModelo + '\'' +
                '}';
    }

    @Override
    public int compareTo(Carro carro) {
        return this.getNomeModelo().compareToIgnoreCase(carro.getNomeModelo());
    }
}

class ComparatorIdade implements Comparator<Carro> {
    @Override
    public int compare(Carro c1, Carro c2) {
        return Integer.compare(c1.getAnoFabricacao(), c2.getAnoFabricacao());
    }
}