package homework12;

public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape square = factory.getShape(ShapeType.SQUARE);
        Shape circle = factory.getShape(ShapeType.CIRCLE);
        Shape rectangle = factory.getShape(ShapeType.RECTANGLE);
        Shape treangle = factory.getShape(ShapeType.TRIANGLE);

        square.calculateArea();
        circle.calculateArea();
        rectangle.calculateArea();
        treangle.calculateArea();

    }
}
