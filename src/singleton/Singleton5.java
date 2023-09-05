package singleton;

// Bill Pugh Singleton
public class Singleton5 {

    private Singleton5() {

    }

    public static class Singleton5Inner {
        public static final Singleton5 INSTANCE = new Singleton5();
    }

    public void print() {
        System.out.println("Bill Pugh Singleton Implementation");
    }
}
