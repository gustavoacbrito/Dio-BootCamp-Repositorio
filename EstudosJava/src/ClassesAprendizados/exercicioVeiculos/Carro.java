package ClassesAprendizados.exercicioVeiculos;

public class Carro {
    private String marca;
    private String modelo;
    private String cor;
    private int portas;
    private int capacidadeTanque;


    Carro(){
        this.capacidadeTanque = 0;
        this.marca = "Nissan";
        this.modelo = "Versa";
        this.cor = "preto";
        this.portas = 4;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }
    public int getCapacidadeTanque(){
        return this.capacidadeTanque;
    }


    public void calcularCustoAbastecimento(double precoGasolina){


        double result = getCapacidadeTanque() * precoGasolina;
        System.out.println("O custo de abastecimento do tanque de "+ getCapacidadeTanque() + " litros "+ " é de "+ result );

    }

}



