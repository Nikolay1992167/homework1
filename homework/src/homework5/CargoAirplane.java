package homework5;

public class CargoAirplane extends AirCargoTransport {

    public CargoAirplane(int carcoCapaciti, int rangeFlight) {
        super(carcoCapaciti);
        setRangeFlight(rangeFlight);
    }

    @Override
    public AirTransportTyp getAirTransportTyp() {
        return AirTransportTyp.CARGOAIRPLANE;
    }
}
