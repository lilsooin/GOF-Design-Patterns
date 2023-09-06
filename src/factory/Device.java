package factory;

public abstract class Device {

    public abstract String getDeviceId();
    public abstract String getType();
    public abstract String getName();

    @Override
    public String toString() {
        return "id " + this.getDeviceId() + " type " + this.getType() + " name " + this.getName();
    }
}
