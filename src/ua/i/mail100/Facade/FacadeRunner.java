package ua.i.mail100.Facade;

import ua.i.mail100.Facade.facade.VideoConversionFacade;

import java.io.File;

//https://refactoring.guru/uk/design-patterns/facade/java/example
public class FacadeRunner {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        // ...
    }
}
