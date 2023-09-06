package factory;

public class DeviceFactory {

    public static Device getDevice(String deviceId, String type, String name) {
        if ("Light".equalsIgnoreCase(type)) {
            return new LightDevice(deviceId, type, name);
        } else if ("Gas".equalsIgnoreCase(type)) {
            return new GasDevice(deviceId, type, name);
        }

        return null;
    }
}
