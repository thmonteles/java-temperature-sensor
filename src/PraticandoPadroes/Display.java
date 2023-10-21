package PraticandoPadroes;

public class Display implements TemperatureObserver {
    @Override
    public void update(double temperature) {
        System.out.println("Temperatura atual: " + temperature);
    }
}
