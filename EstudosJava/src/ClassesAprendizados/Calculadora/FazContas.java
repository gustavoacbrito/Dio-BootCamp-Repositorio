package ClassesAprendizados.Calculadora;

import java.util.Scanner;

public class FazContas {
    public static void main(String[] args) {
        double number1;
        double number2;
        String sign;

        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o Primeiro valor ");
        number1 = scanner.nextDouble();
        System.out.println("Digite o Segundo valor ");
        number2 = scanner.nextDouble();
        System.out.println("Digite uma operação matemática (+,-,*,/)");
        sign = scanner.next();

        if (!sign.equals("+") && !sign.equals("-") && !sign.equals("*") && !sign.equals("/")){
            while(!sign.equals("+") && !sign.equals("-") && !sign.equals("*") && !sign.equals("/") ){
                System.out.println("InVÁLIDO! Digite uma operação matemática válida (+,-,*,/)");
                sign = scanner.next();
            }
        }

        switch (sign) {
            case "+" -> Calculadora.handleSum(number1, number2);
            case "-" -> Calculadora.handleSubtraction(number1, number2);
            case "*" -> Calculadora.handleMultiplication(number1, number2);
            case "/" -> Calculadora.handleDivision(number1, number2);
        }


    }




    }

