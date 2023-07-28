package singleton;

// Thread Safe Singleton
public class Singleton3 {

    private static Singleton3 instance;

    public static synchronized Singleton3 getInstance() {
        if(instance == null){
            instance = new Singleton3();
        }

        return instance;
    }


    // double check locking
    public static Singleton3 getInstance2(){
        if (instance == null){
            synchronized (Singleton3.class){
                if(instance == null){
                    instance = new Singleton3();
                }
            }
        }

        return instance;
    }


    public void print(){
        System.out.println("Thread Safe Singleton");
    }
}
