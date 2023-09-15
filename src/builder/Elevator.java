package builder;

import java.util.Arrays;

public class Elevator {

    // essential
    private String deviceId;
    private int floor;
    private boolean isMoving;

    // optional
    private String version;
    private String apartmentName;

    private Elevator(
            ElevatorBuilder builder
    ) {
        this.deviceId = builder.deviceId;
        this.floor = builder.floor;
        this.isMoving = builder.isMoving;
        this.version = builder.version;
        this.apartmentName = builder.apartmentName;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public int getFloor() {
        return floor;
    }

    public boolean isMoving() {
        return isMoving;
    }

    public String getVersion() {
        return version;
    }

    public String getApartmentName() {
        return apartmentName;
    }

    public static class ElevatorBuilder {

        private String deviceId;
        private int floor;
        private boolean isMoving;
        private String version;
        private String apartmentName;

        public ElevatorBuilder(
                String deviceId,
                int floor,
                boolean isMoving
        ) {
            this.deviceId = deviceId;
            this.floor = floor;
            this.isMoving = isMoving;
        }

        public ElevatorBuilder setVersion(String version) {
            this.version = version;
            return this;
        }

        public ElevatorBuilder setApartmentName(String apartmentName) {
            this.apartmentName = apartmentName;
            return this;
        }

        public Elevator build() {
           return new Elevator(this);
        }
    }
}
