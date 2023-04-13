package ClassesAprendizados.TemperaturaMeses;

//exercício realizado com propósito de praticar o uso de listas;

import java.util.Scanner;

public class TemperaturesAnalyses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a temperatura dos 6 primeiros meses do ano.");
        HandleTemperatures handleTemperatures = new HandleTemperatures();
        for (int i = 1; i <= 6; i++) {
            System.out.println("Insira a temperatura do mês " + i);
            double temperatureMonth = scanner.nextDouble();
            switch (i) {
                case 1 -> handleTemperatures.setJanuaryTemperature(temperatureMonth);
                case 2 -> handleTemperatures.setFebruaryTemperature(temperatureMonth);
                case 3 -> handleTemperatures.setMarchTemperature(temperatureMonth);
                case 4 -> handleTemperatures.setAprilTemperature(temperatureMonth);
                case 5 -> handleTemperatures.setMayTemperature(temperatureMonth);
                case 6 -> handleTemperatures.setJuneTemperature(temperatureMonth);
            }
        }
        System.out.println("A temperatura(ºC) dos 6 primeiros meses do ano são respectivamente " + handleTemperatures.temperaturesToList());
        System.out.println("A temperatura(ºC) média do semestre foi: " + handleTemperatures.temperaturesMedia());
        handleTemperatures.showAboveAverageTemp();
    }
}
