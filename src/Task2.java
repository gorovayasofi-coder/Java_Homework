interface Shape {
    String getFillColor();
    String getBorderColor();
    double calculatePerimeter();
    double calculateArea();

    default void printInfo() {
        System.out.printf("Фигура: %-10s | Периметр: %6.2f | Площадь: %6.2f | Фон: %-7s | Граница: %-7s%n",
                this.getClass().getSimpleName(), calculatePerimeter(), calculateArea(), getFillColor(), getBorderColor());
    }
}

record Circle(double radius, String fillColor, String borderColor) implements Shape {
    @Override public String getFillColor() { return fillColor; }
    @Override public String getBorderColor() { return borderColor; }
    @Override public double calculatePerimeter() { return 2 * Math.PI * radius; }
    @Override public double calculateArea() { return Math.PI * radius * radius; }
}

record Rectangle(double width, double height, String fillColor, String borderColor) implements Shape {
    @Override public String getFillColor() { return fillColor; }
    @Override public String getBorderColor() { return borderColor; }
    @Override public double calculatePerimeter() { return 2 * (width + height); }
    @Override public double calculateArea() { return width * height; }
}

record Triangle(double a, double b, double c, String fillColor, String borderColor) implements Shape {
    @Override public String getFillColor() { return fillColor; }
    @Override public String getBorderColor() { return borderColor; }
    @Override public double calculatePerimeter() { return a + b + c; }
    @Override public double calculateArea() {
        double p = calculatePerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}

public class Task2 {
    public static void main(String[] args) {
        var circle = new Circle(5, "Красный", "Черный");
        var rectangle = new Rectangle(4, 6, "Синий", "Белый");
        var triangle = new Triangle(3, 4, 5, "Зеленый", "Желтый");
        circle.printInfo();
        rectangle.printInfo();
        triangle.printInfo();
    }
}
