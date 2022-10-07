package homework5;


public interface RangeFlight {
    double getLength();

    default void printLength(RangeFlight rangeFlight) {
        System.out.println(rangeFlight.getLength());
    }
}
