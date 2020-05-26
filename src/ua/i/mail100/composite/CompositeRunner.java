package ua.i.mail100.composite;

import ua.i.mail100.composite.composite.CompoundShape;
import ua.i.mail100.composite.leaf.Circle;
import ua.i.mail100.composite.leaf.Dot;
import ua.i.mail100.composite.leaf.Rectangle;
import ua.i.mail100.composite.service.ImageEditor;

import java.awt.*;

public class CompositeRunner {
    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor();

        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLUE),

                new CompoundShape(
                        new Circle(110, 110, 50, Color.RED),
                        new Dot(160, 160, Color.RED)
                ),

                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                )
        );
    }
}