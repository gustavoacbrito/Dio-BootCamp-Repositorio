package ClassesAprendizados.AreaDoQuadrilatero;

public class Quadrilateral {
    public static void handleArea(double side){
        System.out.println("Área do quadrado:" + side * side);
    }
    public static void handleArea(double base , double heigth){
        System.out.println("Área do retângulo:" + base * heigth);
    }
    public static void handleArea(double biggerBase, double smallerBase, double height){
        System.out.println("Área do trapézio:" + ((biggerBase+smallerBase)*height) / 2);
    }
}
