package homework12;

public class Rectangle implements Shape {
    private int side1;
    private int side2;

    Rectangle(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    @Override
    public double calculateArea() {
        if (side1 < 0 && side2 < 0) {
            throw new IllegalArgumentException("Wrong side value! Negative number");
        }
        double area = side1 * side2;
        return area;
    }

    @Override
    public String getNameShape() {
        return ShapeType.RECTANGLE.getNameShape();
    }
}
