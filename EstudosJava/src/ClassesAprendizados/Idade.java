package ClassesAprendizados;

public class Idade {
    public static String verifica(int idade) {
        if (idade > 18) {
            return "Maior de idade";
        } else {
            return "Menor de idade";
        }
    }

    public static void main(String[] args) {

        System.out.println(verifica(25));
    }
}
