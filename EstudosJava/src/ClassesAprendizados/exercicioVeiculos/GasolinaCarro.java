package ClassesAprendizados.exercicioVeiculos;


public class GasolinaCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setCapacidadeTanque(50);
        carro.calcularCustoAbastecimento(6.20);

        Carro carro1 = new Carro();
        carro1.setCapacidadeTanque(100);
        carro1.calcularCustoAbastecimento(4.0);

        Carro carro2 = new Carro();
        carro2.setCapacidadeTanque(35);
        carro2.calcularCustoAbastecimento(5.6);

        Carro carro3 = new Carro();
        carro3.setCapacidadeTanque(80);
        carro3.calcularCustoAbastecimento(5);



        System.out.println(carro.getCapacidadeTanque());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro3.getCapacidadeTanque());



    }

}
