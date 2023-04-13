package ClassesAprendizados.TemperaturaMeses;

//exercício realizado com propósito de praticar o uso de listas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HandleTemperatures {

    private double januaryTemperature;
    private double februaryTemperature;
    private double marchTemperature;
    private double aprilTemperature;
    private double mayTemperature;
    private double juneTemperature;

    public HandleTemperatures() {

    }

    public double getJanuaryTemperature() {
        return januaryTemperature;
    }

    public void setJanuaryTemperature(double januaryTemperature) {
        this.januaryTemperature = januaryTemperature;
    }

    public double getFebruaryTemperature() {
        return februaryTemperature;
    }

    public void setFebruaryTemperature(double februaryTemperature) {
        this.februaryTemperature = februaryTemperature;
    }

    public double getMarchTemperature() {
        return marchTemperature;
    }

    public void setMarchTemperature(double marchTemperature) {
        this.marchTemperature = marchTemperature;
    }

    public double getAprilTemperature() {
        return aprilTemperature;
    }

    public void setAprilTemperature(double aprilTemperature) {
        this.aprilTemperature = aprilTemperature;
    }

    public double getMayTemperature() {
        return mayTemperature;
    }

    public void setMayTemperature(double mayTemperature) {
        this.mayTemperature = mayTemperature;
    }

    public double getJuneTemperature() {
        return juneTemperature;
    }

    public void setJuneTemperature(double juneTemperature) {
        this.juneTemperature = juneTemperature;
    }

    public List<Double> temperaturesToList() {
        List<Double> temperaturesList = new ArrayList<>();
        temperaturesList.add(this.getJanuaryTemperature());
        temperaturesList.add(this.getFebruaryTemperature());
        temperaturesList.add(this.getMarchTemperature());
        temperaturesList.add(this.getAprilTemperature());
        temperaturesList.add(this.getMayTemperature());
        temperaturesList.add(this.getJuneTemperature());
        return temperaturesList;
    }

    public double temperaturesMedia() {
        Iterator<Double> temperatureIterator = temperaturesToList().iterator();
        double sum = 0d;
        while (temperatureIterator.hasNext()) {
            double next = temperatureIterator.next();
            sum += next;
        }
        return sum / temperaturesToList().size();
    }

    public void showAboveAverageTemp() {
        Iterator<Double> temperatureIterator = temperaturesToList().iterator();
        while (temperatureIterator.hasNext()) {
            Double temperature = temperatureIterator.next();
            if (temperature > temperaturesMedia()) {
                int position = temperaturesToList().indexOf(temperature);
                String month = "";
                switch (position) {
                    case 0 -> month = "Janeiro";
                    case 1 -> month = "Fevereiro";
                    case 2 -> month = "Março";
                    case 3 -> month = "Abril";
                    case 4 -> month = "Maio";
                    case 5 -> month = "Junho";
                }
                System.out.println("O mês de " + month + " teve temperaturas acima da média");
            }
        }
    }


}
