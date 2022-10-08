package homework5;

public enum AirTransportTyp {
    PASSENGERAIRCRAFT("Passenger Aircraft"),
    CARGOAIRPLANE("Cargo AirPlane"),
    PASSENGERHELICOPTER("Passenger Helicopter"),
    CARGOHELICOPTER("Cargo Helicopter");

    private final String typeName;

    AirTransportTyp(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }
}
