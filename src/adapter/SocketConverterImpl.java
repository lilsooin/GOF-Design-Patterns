package adapter;

public class SocketConverterImpl extends Socket implements SocketAdapter {

    @Override
    public Volt get120Volts() {
        return getVolt();
    }

    @Override
    public Volt get60Volts() {
        Volt v = getVolt();
        return createVolt(v, 2);
    }

    @Override
    public Volt get30Volts() {
        Volt v = getVolt();
        return createVolt(v, 8);
    }

    private Volt createVolt(Volt v, int i) {
        return new Volt(v.getVolts()/i);
    }
}
