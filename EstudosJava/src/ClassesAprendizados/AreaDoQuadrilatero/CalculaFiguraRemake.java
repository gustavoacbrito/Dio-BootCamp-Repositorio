package ClassesAprendizados.AreaDoQuadrilatero;



public class CalculaFiguraRemake {
    public static void main(String[] args) {

        double side = 10;
        double base = 20;
        double height = 20;



        double areaSquare =QuadrilateralRemake.handleArea(side) ;
        double areaRectangle = QuadrilateralRemake.handleArea(base,height);
        double areatrapeze = QuadrilateralRemake.handleArea(50,96,58);


        System.out.println("Área do quadrado:" + areaSquare + "m²");
        System.out.println("Área do retângulo:" + areaRectangle + "m²");
        System.out.println("Área do trapézio:" + areatrapeze +"m²");


    }

}
