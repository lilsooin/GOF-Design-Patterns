package adapter;

public class AdapterPatternTest {

    public static void main(String[] args) {
        testObjectAdapter();
        testClassAdapter();
    }

    public static void testObjectAdapter() {
        SocketAdapter socketAdapter = new SocketConverterImpl();
        Volt v120 = getVolt(socketAdapter, 120);
        Volt v60 = getVolt(socketAdapter, 60);
        Volt v180 = getVolt(socketAdapter, 180);

        System.out.println("SocketConverterImpl v120: " + v120.getVolts());
        System.out.println("SocketConverterImpl v60: " + v60.getVolts());
        System.out.println("SocketConverterImpl v180: " + v180.getVolts());
    }

    private static void testClassAdapter() {
        SocketAdapter socketAdapter = new SocketObjectAdapterImpl();
        Volt v120 = getVolt(socketAdapter, 120);
        Volt v60 = getVolt(socketAdapter, 60);
        Volt v180 = getVolt(socketAdapter, 180);

        System.out.println("SocketObjectAdapterImpl v120: " + v120.getVolts());
        System.out.println("SocketObjectAdapterImpl v60: " + v60.getVolts());
        System.out.println("SocketObjectAdapterImpl v180: " + v180.getVolts());

    }

    private static Volt getVolt(SocketAdapter socketAdapter, int i) {
        switch (i) {
            case 60:
                return socketAdapter.get60Volts();
            case 180:
                return socketAdapter.get30Volts();
            default:
                return socketAdapter.get120Volts();
        }
    }
}
