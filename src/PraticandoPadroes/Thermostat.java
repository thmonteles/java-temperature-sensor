package PraticandoPadroes;

public class Thermostat implements TemperatureObserver {
    @Override
    public void update(double temperature) {
        if (temperature > 25) {
            System.out.println("Ligando o ar condicionado");
        } else {
            System.out.println("Desligando o ar condicionado");
        }
    }
}


