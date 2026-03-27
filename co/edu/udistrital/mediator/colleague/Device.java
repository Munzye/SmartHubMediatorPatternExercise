package co.edu.udistrital.mediator.colleague;

import co.edu.udistrital.mediator.mediator.Mediator;

public abstract class Device {
    protected Mediator mediator;
    protected String name;

    public Device(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
