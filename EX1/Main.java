public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog ("Бобик", 501);
        Dog dog1 = new Dog ("Мухтар", 200);
        Dog dog2 = new Dog ("Ричард",2);
        Bowl bowl1 = new Bowl(3);
        Bowl bowl2 = new Bowl(10);
        Cat cat1 = new Cat("Борис", 5);
        Cat cat2 = new Cat("Рейган", 500);
        dog.run();
        dog1.run();
        dog2.run();
        cat1.run();
        cat2.run();

        System.out.println();
        System.out.println();

        dog.swim();
        dog2.swim();
        cat1.swim();

        System.out.println();
        System.out.println();

        cat1.eating(bowl1);
        cat2.eating(bowl2);

        System.out.println();
        System.out.println();

        cat1.Full();
        cat2.Full();

        System.out.println();
        System.out.println();

        bowl1.addFood(2);
        cat1.eating(bowl1);
        cat1.Full();
        cat1.eating(bowl1);

        System.out.println();
        System.out.println();

        bowl1.FoodAmount();
        bowl1.toString();
        bowl1.decreaseFood(20);

        System.out.println();
        System.out.println();

        System.out.println("Всего животных = " + Cat.getCatCounter() +  Dog.getDogCounter());
        System.out.println("Всего собак: " + Dog.getDogCounter());
        System.out.println("Всего котов: " + Cat.getCatCounter());


        Cat catB = new Cat("Роберт", 5);
        Cat catS = new Cat("Сайгак", 500);
        Bowl bowlS = new Bowl(25);
    
        Cat[] cats = {catB, catS};

        System.out.println("\n" + bowlS);
        for (Cat cat : cats) {
            cat.eating(bowlS);
        }
        System.out.println("\n" + bowlS);

        for (Cat cat : cats) {
            System.out.println(cat.name + " сыт: " + cat.Full());
        }
    }


}