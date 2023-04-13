package ClassesAprendizados;

public class BoletimEscolar {
    public static void main(String[] args) {
        float mediaFinal = 5.6f;  //F no final pra dizer que a variável é float
        if (mediaFinal < 6)
            System.out.println("REPROVADO");
        else if (mediaFinal == 6)
            System.out.println("Prova de Recuperação");
        else
            System.out.println("APROVADO");


    }
}
