package co.edu.udistrital.mediator.actuators;

import co.edu.udistrital.mediator.colleague.Device;
import co.edu.udistrital.mediator.mediator.Mediator;

public class AirConditioner extends Device {
    private boolean on;

    public AirConditioner(Mediator mediator, String name) {
        super(mediator, name);
        this.on = false;
    }

    public void turnOn() {
        if (!on) {
            on = true;
            System.out.println(name + " se enciende");
        } else {
            System.out.println(name + " ya estaba encendido");
        }
    }

    public void turnOff() {
        if (on) {
            on = false;
            System.out.println(name + " se apaga");
        } else {
            System.out.println(name + " ya estaba apagado");
        }
    }

    public boolean isOn() {
        return on;
    }
}
