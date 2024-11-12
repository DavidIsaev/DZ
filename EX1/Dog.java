public class Dog extends Animal {
    public static int dogCounter = 0;
    public Dog(String name, int distance) {
        this.name = name;
        this.distance = distance;
        dogCounter++;
    }

    public void run() {
        if (distance <= 500) {
        System.out.println(name + " пробежит:" + distance + " м."); 
     }
        else {
        System.out.println(name + " не может столько бегать.");
        }
    }

    public void swim() {
        if (distance <= 10) {
        System.out.println(name + " Проплывет:" + distance + " м.");
        }
        else {
        System.out.println(name + " не может столько плыть.");
        }
    }

    public static int getDogCounter() {
        return dogCounter;
    }

}