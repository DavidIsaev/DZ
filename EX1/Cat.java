public class Cat extends Animal {
    private static int catCounter = 0;
    private boolean hunger = true;

    public Cat (String name, int distance) {
        this.name = name;
        this.distance = distance;
        catCounter++;
    }

    public void run() {
        if (distance <= 150) {
        System.out.println(name + " пробежит:" + distance + "м."); 
        }
    else {
        System.out.println(name + " не может столько бегать.");
        }
    }

    public void swim() {
        System.out.println("Кошки не умеют плавать.");  
    } 

    public void eating(Bowl bowl) {
        if (bowl.FoodAmount() >= 5 && this.hunger == true) {
            bowl.decreaseFood(5);
            this.hunger = false;
            System.out.println("Кот " + this.name + " насытился.");  
        }
        if  (this.hunger == false) {
            System.out.println("Кот " + this.name + " не голоден.");
        }
        else{
            System.out.println("Кот " + this.name + " не смог насытиться." + " Наполните миску на " + (5 - bowl.FoodAmount()) + " кусочка ветчины"); 
        }
    }
    public boolean Full() {
        return hunger;
    }
    public static int getCatCounter(){
        return catCounter;
    }
}