package homework5;

public class CargoHelicopter extends AirCargoTransport {

    public CargoHelicopter(int carcoCapaciti, int rangeFlight) {
        super(carcoCapaciti);
        setRangeFlight(rangeFlight);
    }

    @Override
    public AirTransportTyp getAirTransportTyp() {
        return AirTransportTyp.CARGOHELICOPTER;
    }
}
