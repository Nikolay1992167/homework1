package homework5;

public abstract class AirTransport {
    private int rangeFlight;

    public int getRangeFlight() {
        return rangeFlight;
    }

    public void setRangeFlight(int rangeFlight) {
        if (rangeFlight < 0) {
            throw new IllegalArgumentException("Wrong rangeFlight value! Negative number");
        }
        this.rangeFlight = rangeFlight;
    }

    public abstract AirTransportTyp getAirTransportTyp();

}
