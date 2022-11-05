package homework12;

public class ShapeFactory {
    public Shape getShape(ShapeType type) {
        Shape temporaryType = null;
        switch (type) {
            case SQUARE:
                temporaryType = new Square(2);
                break;
            case CIRCLE:
                temporaryType = new Circle(4);
                break;
            case RECTANGLE:
                temporaryType = new Rectangle(2, 4);
                break;
            case TRIANGLE:
                temporaryType = new Treangle(2, 4, 6);
                break;
            default:
                throw new IllegalArgumentException("Wrong shape type:" + type);
        }
        return temporaryType;
    }
}
