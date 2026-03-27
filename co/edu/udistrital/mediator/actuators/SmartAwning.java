package co.edu.udistrital.mediator.actuators;

import co.edu.udistrital.mediator.colleague.Device;
import co.edu.udistrital.mediator.mediator.Mediator;

public class SmartAwning extends Device {
    private boolean open;

    public SmartAwning(Mediator mediator, String name) {
        super(mediator, name);
        this.open = false;
    }

    public void open() {
        if (!open) {
            open = true;
            System.out.println(name + " se abre");
        } else {
            System.out.println(name + " ya estaba abierto");
        }
    }

    public void close() {
        if (open) {
            open = false;
            System.out.println(name + " se cierra");
        } else {
            System.out.println(name + " ya estaba cerrado");
        }
    }

    public boolean isOpen() {
        return open;
    }
}
