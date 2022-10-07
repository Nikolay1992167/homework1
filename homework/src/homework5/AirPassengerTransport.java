package homework5;

public abstract class AirPassengerTransport extends AirTransport {

    private int passengerCount;

    public AirPassengerTransport(int passengerCount) {
        setPassengerCount(passengerCount);
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        if (passengerCount < 0) {
            throw new IllegalArgumentException("Wrong passengrCouent value! Negative number");
        }
        this.passengerCount = passengerCount;
    }


}
