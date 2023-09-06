package factory;

public class Main {
    public static void main(String[] args) {
          DeviceFactory.getDevice("01190101", "Light", "침실1");
          DeviceFactory.getDevice("01250101", "Gas", "가스");
          DeviceFactory.getDevice("01190102", "Light", "침실2");
    }
}
