package factory;

import factory.Device;

public class LightDevice extends Device {

    private String deviceId;
    private String type;
    private String name;

    LightDevice(
            String deviceId,
            String type,
            String name

    ) {
        this.deviceId = deviceId;
        this.type = type;
        this.name = name;
    }

    @Override
    public String getDeviceId() {
        return deviceId;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getName() {
        return name;
    }
}
