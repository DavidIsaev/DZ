public class Сircle implements Shape {
    private int radius;
    private String mainColor;
    private String bordColor;

    public Сircle(int radius, String mainColor, String bordColor) {
        this.radius = radius;
        this.mainColor = mainColor;
        this.bordColor = bordColor;
    }

    public String mainColor() {
        return mainColor;
    }

    public String bordColor() {
        return bordColor;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}