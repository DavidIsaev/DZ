public class Square implements Shape{
    private int weight;
    private int height;
    private String mainColor;
    private String bordColor;

    public Square(int weight, int height, String fillColor, String borderColor) {
        this.weight = weight;
        this.height = height;
        this.mainColor = fillColor;
        this.bordColor = borderColor;
    }

    public String mainColor() {
        return mainColor;
    }

    public String bordColor() {
        return bordColor;
    }

    public double area() {
        return weight * height;
    }

    public double perimeter() {
        return (weight + height) * 2;
    }
    
}