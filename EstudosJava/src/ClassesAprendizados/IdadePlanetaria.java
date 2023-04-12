package ClassesAprendizados;

import java.util.Scanner;
public class IdadePlanetaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double idadeTerrestre = scanner.nextDouble();
        String planeta = scanner.next();

        //TODO: Crie as condições para calcular a idade equivalente de cada planeta.
        double taxaConversaoMarte = 1.88;
        double taxaConversaoVenus = 0.62;
        double taxaConversaoJupiter = 11.86;
        double idadeEmMarte;
        double idadeEmVenus;
        double idadeEmJupiter;

        switch (planeta){
            case "Marte":
                idadeEmMarte = idadeTerrestre/taxaConversaoMarte;
                System.out.println("Idade equivalente em Marte: "+ String.format("%.2f", idadeEmMarte) + " anos");
                break;
            case "Venus":
                idadeEmVenus = idadeTerrestre/taxaConversaoVenus;
                System.out.println("Idade equivalente em Venus: "+ String.format("%.2f", idadeEmVenus) + " anos");
                break;
            case "Jupiter":
                idadeEmJupiter = idadeTerrestre/taxaConversaoJupiter;
                System.out.println("Idade equivalente em Jupiter: "+ String.format("%.2f", idadeEmJupiter) + " anos");
                break;
            default: System.out.println("Planeta invalido.");


        }

        //TODO: Imprima a saída conforme descrito neste desafio.

        scanner.close();
    }
}
