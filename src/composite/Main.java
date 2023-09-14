package composite;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Drawing drawing = new Drawing();

        Circle circle = new Circle();
        circle.drawColor(EColor.RED);

        Triangle triangle = new Triangle();
        drawing.add(circle);
        drawing.add(triangle);

        drawing.drawColor(EColor.GREEN);

        List<Shape> shapes = new ArrayList<>();
        shapes.add(drawing);
        shapes.add(new Triangle());
        shapes.add(new Circle());


        for (Shape shape : shapes) {
            shape.drawColor(EColor.BLUE);
        }
    }
}
