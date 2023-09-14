package composite;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {

    private List<Shape> shapes = new ArrayList<>();

    @Override
    public void drawColor(EColor fillColor) {
        for (Shape sh : shapes) {
            sh.drawColor(fillColor);
        }
    }

    // adding shape to drawing
    public void add(Shape s) {
        this.shapes.add(s);
    }

    // removing shape from drawing
    public void remove(Shape shape) {
        this.shapes.remove(shape);
    }

    public void clear() {
        System.out.println("Clear shapes");
        this.shapes.clear();
    }
}
