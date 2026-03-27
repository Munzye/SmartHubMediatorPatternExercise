package co.edu.udistrital.mediator;

import co.edu.udistrital.mediator.actuators.AirConditioner;
import co.edu.udistrital.mediator.actuators.SmartAwning;
import co.edu.udistrital.mediator.actuators.SmartCurtains;
import co.edu.udistrital.mediator.mediator.SmartHub;
import co.edu.udistrital.mediator.sensors.LightSensor;
import co.edu.udistrital.mediator.sensors.RainSensor;
import co.edu.udistrital.mediator.sensors.TemperatureSensor;

public class Main {
    public static void main(String[] args) {
        SmartHub hub = new SmartHub();

        TemperatureSensor temperatureSensor = new TemperatureSensor(hub, "Sensor de Temperatura");
        LightSensor lightSensor = new LightSensor(hub, "Sensor de Luz");
        RainSensor rainSensor = new RainSensor(hub, "Sensor de Lluvia");

        AirConditioner airConditioner = new AirConditioner(hub, "Aire Acondicionado");
        SmartCurtains smartCurtains = new SmartCurtains(hub, "Cortinas Inteligentes");
        SmartAwning smartAwning = new SmartAwning(hub, "Toldo Inteligente");

        hub.setAirConditioner(airConditioner);
        hub.setSmartCurtains(smartCurtains);
        hub.setSmartAwning(smartAwning);

        System.out.println("=== PRUEBA DEL SISTEMA SMART HOME CON MEDIATOR ===\n");

        temperatureSensor.detectTemperature(35.0);
        System.out.println();

        lightSensor.detectLight(true);
        System.out.println();

        rainSensor.detectRain(true);
        System.out.println();

        temperatureSensor.detectTemperature(24.0);
        System.out.println();

        lightSensor.detectLight(false);
        System.out.println();

        rainSensor.detectRain(false);
    }
}
