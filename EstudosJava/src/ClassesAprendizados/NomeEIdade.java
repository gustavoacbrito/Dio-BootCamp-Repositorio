package ClassesAprendizados;

import java.util.Scanner;

public class NomeEIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Qual seu nome? digite 0 caso queira sair");
            String name = scanner.next();
            System.out.println("Nome: " + name);
            if (name.equals("0")) {
                break;
            }
            System.out.println(name + ", qual sua idade?");
            int age = scanner.nextInt();
            System.out.println("A idade de " + name + " é: " + age + " anos");

        }


    }
}
