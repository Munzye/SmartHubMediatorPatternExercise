package co.edu.udistrital.mediator.sensors;

import co.edu.udistrital.mediator.colleague.Device;
import co.edu.udistrital.mediator.mediator.Mediator;

public class RainSensor extends Device {
    private boolean raining;

    public RainSensor(Mediator mediator, String name) {
        super(mediator, name);
    }

    public void detectRain(boolean raining) {
        this.raining = raining;

        if (raining) {
            System.out.println(name + " detecta lluvia");
            System.out.println(name + " reporta evento: LLUVIA");
            mediator.notify(this, "LLUVIA");
        } else {
            System.out.println(name + " no detecta lluvia");
            System.out.println(name + " reporta evento: SIN_LLUVIA");
            mediator.notify(this, "SIN_LLUVIA");
        }
    }

    public boolean isRaining() {
        return raining;
    }
}
