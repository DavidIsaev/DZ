public class Main {
    public static void main(String[] args) {
        Shape square = new Square(10, 2, "Зеленый","Желтый");
        Shape circle = new Сircle(5, "Розовый", "Оранжевый");
        Shape triangle = new Triangle(22, 23, 7, "красный", "Оранжевый");
        System.out.println("Характеристики прямоугольника:");
        square.printCharacteristics();
        System.out.println("Характеристики треугольника:");
        triangle.printCharacteristics();
        System.out.println("Характеристики круга:");
        circle.printCharacteristics();
    }
}
