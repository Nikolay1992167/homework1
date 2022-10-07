package homework5;

public class Main {
        public static void main(String[] args) {
        AirTransport boeing_777 = new PassengerAircraft(10, 4500);
        AirTransport an_225 = new CargoAirplane(1500, 5000);
        AirTransport mi_8 = new PassengerHelicopter(22, 800);
        AirTransport mi_26 = new CargoHelicopter(300, 1000);

        AirTransport[] Aircraft = new AirTransport[4];
        Aircraft[0] = boeing_777;
        Aircraft[1] = an_225;
        Aircraft[2] = mi_8;
        Aircraft[3] = mi_26;

        sortAirTransport(Aircraft);
         /*Не смог понять почему не работает, распиши пожалуйста поподробней косяки и можно ли это реализовать циклом как я там дальше пытался.
         * так не оставлю буду наследование грызть дальше :) */

        int sumCapasiti = 0;
        int sumPassengerCount = 0;
        if (boeing_777.getClass() == AirPassengerTransport.class) {
            AirPassengerTransport vehicle1 = (AirPassengerTransport) boeing_777;
            System.out.println(vehicle1.getPassengerCount());
        }
        if (mi_8.getClass() == AirPassengerTransport.class) {
            AirPassengerTransport vehicle2 = (AirPassengerTransport) boeing_777;
            System.out.println(vehicle2.getPassengerCount());
        }
        if (an_225.getClass() == AirCargoTransport.class) {
            AirCargoTransport vehicle3 = (AirCargoTransport) an_225;
            System.out.println(vehicle3.getCarcoCapaciti());
        }
        if (mi_26.getClass() == AirCargoTransport.class) {
            AirCargoTransport vehicle4 = (AirCargoTransport) mi_26;
            System.out.println(vehicle4.getCarcoCapaciti());
        }

        /*int sumCapasiti = 0;
        int sumPassengerCount = 0;
        for (int i = 0; i < Aircraft.length; i++) {
            if (Aircraft[i].getClass() == AirPassengerTransport.class) {
                AirPassengerTransport number = (AirPassengerTransport) Aircraft[i];
                sumPassengerCount = sumPassengerCount + number.getPassengerCount();
            }
            if (Aircraft[i].getClass() == AirCargoTransport.class) {
                AirCargoTransport number = (AirCargoTransport) Aircraft[i];
                sumCapasiti = sumCapasiti + number.getCarcoCapaciti();
            }
        }
        System.out.println(sumCapasiti);
        System.out.println(sumCapasiti);*/
    }

    private static void sortAirTransport(AirTransport[] var) {
        AirTransport temporary;
        for (int i = 0; i < var.length; i++) {
            for (int j = i + 1; j < var.length; j++) {
                if (var[i].getRangeFlight() < var[j].getRangeFlight()) {
                    temporary = var[i];
                    var[i] = var[j];
                    var[j] = temporary;
                }
            }
        }
    }
}
