package homework5;

public class PassengerAircraft extends AirPassengerTransport {

    public PassengerAircraft(int passengerCount, int rangeFlight) {
        super(passengerCount);
        setRangeFlight(rangeFlight);

    }

    @Override
    public int getPassengerCount() {
        return super.getPassengerCount();
    }

    @Override
    public AirTransportTyp getAirTransportTyp() {
        return AirTransportTyp.PASSENGERAIRCRAFT;
    }
}
