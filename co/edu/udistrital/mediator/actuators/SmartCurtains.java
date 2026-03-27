package co.edu.udistrital.mediator.actuators;

import co.edu.udistrital.mediator.colleague.Device;
import co.edu.udistrital.mediator.mediator.Mediator;

public class SmartCurtains extends Device {
    private boolean closed;

    public SmartCurtains(Mediator mediator, String name) {
        super(mediator, name);
        this.closed = false;
    }

    public void close() {
        if (!closed) {
            closed = true;
            System.out.println(name + " se cierran");
        } else {
            System.out.println(name + " ya estaban cerradas");
        }
    }

    public void open() {
        if (closed) {
            closed = false;
            System.out.println(name + " se abren");
        } else {
            System.out.println(name + " ya estaban abiertas");
        }
    }

    public boolean isClosed() {
        return closed;
    }
}
