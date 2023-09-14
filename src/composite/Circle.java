package composite;

public class Circle implements Shape{
    @Override
    public void drawColor(EColor fillColor) {
        System.out.println("composite.Drawing composite.Circle color " + fillColor);
    }
}
