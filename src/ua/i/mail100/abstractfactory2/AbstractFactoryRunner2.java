package ua.i.mail100.abstractfactory2;

import ua.i.mail100.abstractfactory2.app.Application;
import ua.i.mail100.abstractfactory2.factory.GUIFactory;
import ua.i.mail100.abstractfactory2.factory.MacOSFactory;
import ua.i.mail100.abstractfactory2.factory.WindowsFactory;

//https://refactoring.guru/uk/design-patterns/abstract-factory/java/example
public class AbstractFactoryRunner2 {
    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
            app = new Application(factory);
        } else {
            factory = new WindowsFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}