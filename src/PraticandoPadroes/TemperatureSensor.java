package PraticandoPadroes;

import java.util.ArrayList;
import java.util.List;

public class TemperatureSensor {
    private List<TemperatureObserver> observers = new ArrayList<>();
    private double temperature;

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    public void addObserver(TemperatureObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(TemperatureObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (TemperatureObserver observer : observers) {
            observer.update(temperature);
        }
    }
}
