public class Animal {
    String name;
    int distance;

    public Animal (String name, int distance) {
        this.name = name;
        this.distance =  distance;
    }

    public Animal(){
    }

    public void animalinfo () {
        System.out.println("Имя : " + name);
    }

    public void run() {
        System.out.println(name + " пробежит:" + distance + "м."); 
    }

    public void swim() {
        System.out.println("Проплывет:" + distance);

    } 
    
}