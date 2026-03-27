package co.edu.udistrital.mediator.sensors;

import co.edu.udistrital.mediator.colleague.Device;
import co.edu.udistrital.mediator.mediator.Mediator;

public class TemperatureSensor extends Device {
    private double temperature;

    public TemperatureSensor(Mediator mediator, String name) {
        super(mediator, name);
    }

    public void detectTemperature(double temperature) {
        this.temperature = temperature;
        System.out.println(name + " detecta temperatura: " + temperature + "°C");

        if (temperature > 30) {
            System.out.println(name + " reporta evento: CALOR");
            mediator.notify(this, "CALOR");
        } else {
            System.out.println(name + " reporta evento: TEMPERATURA_NORMAL");
            mediator.notify(this, "TEMPERATURA_NORMAL");
        }
    }

    public double getTemperature() {
        return temperature;
    }
}
