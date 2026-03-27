package co.edu.udistrital.mediator.mediator;

import co.edu.udistrital.mediator.actuators.AirConditioner;
import co.edu.udistrital.mediator.actuators.SmartAwning;
import co.edu.udistrital.mediator.actuators.SmartCurtains;
import co.edu.udistrital.mediator.colleague.Device;

public class SmartHub implements Mediator {
    private AirConditioner airConditioner;
    private SmartCurtains smartCurtains;
    private SmartAwning smartAwning;

    public void setAirConditioner(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    public void setSmartCurtains(SmartCurtains smartCurtains) {
        this.smartCurtains = smartCurtains;
    }

    public void setSmartAwning(SmartAwning smartAwning) {
        this.smartAwning = smartAwning;
    }

    @Override
    public void notify(Device sender, String event) {
        System.out.println("SmartHub recibe de " + sender.getName() + " el evento: " + event);

        switch (event) {
            case "CALOR":
                if (airConditioner != null) {
                    airConditioner.turnOn();
                }
                break;

            case "TEMPERATURA_NORMAL":
                if (airConditioner != null) {
                    airConditioner.turnOff();
                }
                break;

            case "NOCHE":
                if (smartCurtains != null) {
                    smartCurtains.close();
                }
                break;

            case "DIA":
                if (smartCurtains != null) {
                    smartCurtains.open();
                }
                break;

            case "LLUVIA":
                if (smartAwning != null) {
                    smartAwning.open();
                }
                break;

            case "SIN_LLUVIA":
                if (smartAwning != null) {
                    smartAwning.close();
                }
                break;

            default:
                System.out.println("SmartHub no reconoce el evento: " + event);
                break;
        }
    }
}
