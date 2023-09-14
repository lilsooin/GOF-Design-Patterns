package adapter;

public class SocketObjectAdapterImpl implements SocketAdapter {

    private Socket socket = new Socket();

    @Override
    public Volt get120Volts() {
        return socket.getVolt();
    }

    @Override
    public Volt get60Volts() {
        Volt v = socket.getVolt();
        return convertVolt(v, 60);
    }

    @Override
    public Volt get30Volts() {
        Volt v = socket.getVolt();
        return convertVolt(v, 180);
    }

    private Volt convertVolt(Volt v, int i) {
        return new Volt(v.getVolts()/i);
    }
}
