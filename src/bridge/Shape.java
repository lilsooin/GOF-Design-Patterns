package bridge;

public abstract class Shape {
    // Composition
    protected Color color;

    public Shape(Color c) {
        this.color = c;
    }

    abstract public void applyColor();
}
