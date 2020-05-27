package ua.i.mail100.builder.builder;

import ua.i.mail100.builder.component.Engine;
import ua.i.mail100.builder.component.GPSNavigator;
import ua.i.mail100.builder.component.Transmission;
import ua.i.mail100.builder.component.TripComputer;
import ua.i.mail100.builder.product.Type;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setType(Type type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}