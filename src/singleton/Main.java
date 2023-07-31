package singleton;

public class Main {
    public static void main(String[] args) {
        Singleton1 singleton1Instance = Singleton1.getInstance();
        Singleton1 singleton1Instance2 = Singleton1.getInstance();
        System.out.println(singleton1Instance);
        System.out.println(singleton1Instance2);
        singleton1Instance2.print();
        System.out.println();

        Singleton2 singleton2Instance = Singleton2.getInstance();
        Singleton2 singleton2Instance2 = Singleton2.getInstance();
        System.out.println(singleton2Instance);
        System.out.println(singleton2Instance2);
        singleton2Instance.print();
        System.out.println();

        Singleton3 singleton3Instance = Singleton3.getInstance();
        Singleton3 singleton3Instance2 = Singleton3.getInstance();
        Singleton3 singleton3Instance3 = Singleton3.getInstance2();
        System.out.println(singleton3Instance);
        System.out.println(singleton3Instance2);
        System.out.println(singleton3Instance3);
        Singleton3.getInstance().print();
        singleton3Instance3.print();
        System.out.println();

        Singleton4 singleton4Instance = Singleton4.getInstance();
        Singleton4 singleton4Instance2 = Singleton4.getInstance();
        System.out.println(singleton4Instance);
        System.out.println(singleton4Instance2);
        Singleton4.getInstance().print();
        System.out.println();

        Singleton5 singleton5Instance = Singleton5.Singleton5Inner.INSTANCE;
        Singleton5 singleton5Instance2 = Singleton5.Singleton5Inner.INSTANCE;
        System.out.println(singleton5Instance);
        System.out.println(singleton5Instance2);
        singleton5Instance.print();
        singleton5Instance2.print();
        System.out.println();

        EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE;
        EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE;
        System.out.println(enumSingleton1);
        System.out.println(enumSingleton2);
        enumSingleton1.print();
        enumSingleton2.print();
        System.out.println(enumSingleton1.hashCode());
        System.out.println(enumSingleton2.hashCode());
        System.out.println();
    }
}
