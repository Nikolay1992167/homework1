package homework5;

public abstract class AirCargoTransport extends AirTransport {
    private int carcoCapaciti;

    public AirCargoTransport(int carcoCapaciti) {
        setCarcoCapaciti(carcoCapaciti);
    }

    public int getCarcoCapaciti() {
        return carcoCapaciti;
    }

    public void setCarcoCapaciti(int carcoCapaciti) {
        if (carcoCapaciti < 0) {
            throw new IllegalArgumentException("Wrong carcoCapaciti value! Negative number");
        }
        this.carcoCapaciti = carcoCapaciti;
    }
}
