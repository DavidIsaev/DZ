public class Triangle implements Shape{
    private double side;
    private double side1;
    private double side2;
    private String mainColor;
    private String bordColor;

    public Triangle(int side, int side1, int side2, String mainColor, String bordColor) {
        this.side = side;
        this.side1 = side1;
        this.side2 = side2;
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
        double s = perimeter() / 2;
        return Math.sqrt(s * (s - side) * (s - side1) * (s - side2));
    }

    public double perimeter() {
        return side + side1 + side2;
    }
    
}