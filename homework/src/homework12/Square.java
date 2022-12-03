package homework12;

public class Square implements Shape {
    private int side1;


    Square(int side1) {
        this.side1 = side1;
    }

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    @Override
    public double calculateArea() {
        if (side1 < 0) {
            throw new IllegalArgumentException("Wrong side value! Negative number");
        }
        double area = side1 * side1;
        return area;
    }

    @Override
    public String getNameShape() {
        return ShapeType.SQUARE.getNameShape();
    }

}
