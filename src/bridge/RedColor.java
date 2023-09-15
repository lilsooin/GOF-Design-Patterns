package bridge;

import java.sql.SQLOutput;

public class RedColor implements Color{
    @Override
    public void applyColor() {
        System.out.println("red.");
    }
}
