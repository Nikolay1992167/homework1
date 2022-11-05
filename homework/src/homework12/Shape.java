package homework12;

public interface Shape {
     default double calculateArea() {
        return 0.0;
    }

    String getNameShape();
}
