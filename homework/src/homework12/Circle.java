package homework12;

public class Circle implements Shape {

    private int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        if (radius <= 0) {
            throw new IllegalArgumentException("Wrong radius value! Negative number");
        }
        double area = Math.PI * radius * radius;
        return area;
    }

    @Override
    public String getNameShape() {
        return ShapeType.CIRCLE.getNameShape();
    }
}
