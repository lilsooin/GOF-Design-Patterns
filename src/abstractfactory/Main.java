package abstractfactory;

public class Main {
    public static void main(String[] args) {
        ComputerFactory.getComputer(new PCFactoryInterface("Windows computer","PC"));
        ComputerFactory.getComputer(new MobileFactoryInterface("iphone 12 mini","Mobile"));
    }
}
