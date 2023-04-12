package ClassesAprendizados.AreaDoQuadrilatero;

public class QuadrilateralRemake {
    public static double handleArea(double side){
        return side * side;
    }
    public static double handleArea(double base , double heigth){
        return base * heigth;

    }
    public static double handleArea(double biggerBase, double smallerBase, double height){
        return (((biggerBase+smallerBase)*height) / 2);

    }
}
