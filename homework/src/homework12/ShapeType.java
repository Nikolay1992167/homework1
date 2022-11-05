package homework12;

public enum ShapeType {
    SQUARE("Square"),
    CIRCLE("Circle"),
    RECTANGLE("Rectangle"),
    TRIANGLE("Triangle");

    private String typeShape;

    ShapeType(String typeShape) {
        this.typeShape = typeShape;
    }

    public String getNameShape() {
        return typeShape;
    }
}
