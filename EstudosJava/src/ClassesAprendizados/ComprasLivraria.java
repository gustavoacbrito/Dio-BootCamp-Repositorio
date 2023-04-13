package ClassesAprendizados;
// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.

import java.util.Scanner;

public class ComprasLivraria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instancia 2 objetos do tipo "Livro" com os dados de entrada.
        Livro livro1 = new Livro(scanner.nextLine(), scanner.nextDouble(), scanner.nextInt());
        scanner.nextLine(); // Limpa o buffer do teclado
        Livro livro2 = new Livro(scanner.nextLine(), scanner.nextDouble(), scanner.nextInt());
        //TODO: Considerando os objetos "livro1" e "livro2", calcule o valor total da compra.

        double totalLivros1 = livro1.calculaTotalCompra();
        double totalLivros2 = livro2.calculaTotalCompra();
        double totalCompra = totalLivros1 + totalLivros2;
        System.out.println("Valor total da compra: " + String.format("%.2f", totalCompra));

        //TODO: Considerando os objetos "livro1" e "livro2", calcule o número de livros comprados.
        int quantidadeLivros1 = livro1.getQuantidade();
        int quantidadeLivros2 = livro2.getQuantidade();
        int totalQuantidade = quantidadeLivros1 + quantidadeLivros2;
        System.out.println("Numero de livros comprados: " + totalQuantidade);

        //TODO: Imprima as linhas necessárias conforme a saída deste desafio.
        livro1.mostraMensagem();
    }

    static class Livro {
        String nome;
        double preco;
        int quantidade;

        Livro(String nome, double preco, int quantidade) {
            this.nome = nome;
            this.preco = preco;
            this.quantidade = quantidade;
        }

        public int getQuantidade() {
            return this.quantidade;
        }


        public double calculaTotalCompra() {
            return this.preco * this.quantidade;

        }

        public void mostraMensagem() {
            System.out.println("Obrigado por comprar na nossa livraria!");
        }

    }
}