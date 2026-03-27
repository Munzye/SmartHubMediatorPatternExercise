package co.edu.udistrital.mediator.mediator;

import co.edu.udistrital.mediator.colleague.Device;

public interface Mediator {
    void notify(Device sender, String event);
}
