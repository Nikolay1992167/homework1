package homework5;

public class PassengerHelicopter extends AirPassengerTransport {

    public PassengerHelicopter(int passengerCount, int rangeFlight) {
        super(passengerCount);
        setRangeFlight(rangeFlight);
    }

    @Override
    public AirTransportTyp getAirTransportTyp() {
        return AirTransportTyp.PASSENGERHELICOPTER;
    }
}
