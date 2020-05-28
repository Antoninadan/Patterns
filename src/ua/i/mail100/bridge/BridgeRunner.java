package ua.i.mail100.bridge;

import ua.i.mail100.bridge.concreteimplementation.Radio;
import ua.i.mail100.bridge.concreteimplementation.Tv;
import ua.i.mail100.bridge.implementation.Device;
import ua.i.mail100.bridge.refinedabstraction.AdvancedRemote;
import ua.i.mail100.bridge.refinedabstraction.BasicRemote;

//https://refactoring.guru/uk/design-patterns/bridge/java/example
public class BridgeRunner {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
