package composite;

public class Triangle implements Shape{
    @Override
    public void drawColor(EColor fillColor) {
        System.out.println("composite.Drawing composite.Triangle color " + fillColor);
    }
}
