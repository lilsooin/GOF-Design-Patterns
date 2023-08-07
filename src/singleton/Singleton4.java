package singleton;

// static block initialization
public class Singleton4 {

    private static Singleton4 instance;

    private Singleton4() {
    }

    static {
        try {
            instance = new Singleton4();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static Singleton4 getInstance() {
        return instance;
    }

    public void print(){
        System.out.println("Static Block Initialization");
    }
}
