public interface Shape {
    String mainColor();
    String bordColor();
    double area();
    double perimeter();
    default void printCharacteristics(){
        System.out.println("Цвет фона " + mainColor());
        System.out.println("Цвет окантовки " + bordColor());
        System.out.println("Площадь " + area());
        System.out.println("Периметр " + perimeter());
        System.out.println();
    }

}