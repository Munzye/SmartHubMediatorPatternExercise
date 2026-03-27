package co.edu.udistrital.mediator.sensors;

import co.edu.udistrital.mediator.colleague.Device;
import co.edu.udistrital.mediator.mediator.Mediator;

public class LightSensor extends Device {
    private boolean isNight;

    public LightSensor(Mediator mediator, String name) {
        super(mediator, name);
    }

    public void detectLight(boolean isNight) {
        this.isNight = isNight;

        if (isNight) {
            System.out.println(name + " detecta que es de noche");
            System.out.println(name + " reporta evento: NOCHE");
            mediator.notify(this, "NOCHE");
        } else {
            System.out.println(name + " detecta que es de día");
            System.out.println(name + " reporta evento: DIA");
            mediator.notify(this, "DIA");
        }
    }

    public boolean isNight() {
        return isNight;
    }
}
