package homework12;

public class Treangle implements Shape {
    private int side1;
    private int side2;
    private int side3;

    Treangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
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

    public int getSide3() {
        return side3;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }

    @Override
    public double calculateArea() {
        if (side1 < 0 && side2 < 0 && side3 < 0) {
            throw new IllegalArgumentException("Wrong side value! Negative number");
        }
        double pperimetr = (side1 + side2 + side3) / 2.0;
        return Math.sqrt(pperimetr * (pperimetr - side1) * (pperimetr - side2) * (pperimetr - side3));
    }

    @Override
    public String getNameShape() {
        return ShapeType.TRIANGLE.getNameShape();
    }
}
