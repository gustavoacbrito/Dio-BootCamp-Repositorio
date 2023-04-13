package ClassesAprendizados.exercicioVeiculos;

public class Carro {
    private String marca;
    private String modelo;
    private String cor;
    private int portas;
    private int capacidadeTanque;


    Carro() {
        this.capacidadeTanque = 0;
        this.marca = "Nissan";
        this.modelo = "Versa";
        this.cor = "preto";
        this.portas = 4;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public int getCapacidadeTanque() {
        return this.capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public void calcularCustoAbastecimento(double precoGasolina) {


        double result = getCapacidadeTanque() * precoGasolina;
        System.out.println("O custo de abastecimento do tanque de " + getCapacidadeTanque() + " litros " + " é de " + result);

    }

}



