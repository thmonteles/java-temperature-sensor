import PraticandoPadroes.Display;
import PraticandoPadroes.TemperatureSensor;
import PraticandoPadroes.Thermostat;

public class Main {
    public static void main(String[] args) {
        TemperatureSensor sensor = new TemperatureSensor();

        Thermostat thermostat = new Thermostat();
        Display display = new Display();

        sensor.addObserver(thermostat);
        sensor.addObserver(display);

        sensor.setTemperature(28); // Isso acionará o termostato e a exibição
    }
}
