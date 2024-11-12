public class Bowl {
    private int food;
    public Bowl(int initialFood) {
        this.food = Math.max(initialFood, 0);
    }

    public int FoodAmount() {
        return food;
    }

    public void decreaseFood(int ham) {
        if (ham <= food) {
            food -= ham;
        }
        else {
            System.out.println("В миске не может быть отрицательного количества ветчины.");
        }
    }

    public void addFood(int ham) {
        if (ham> 0) {
            food += ham;
            System.out.println("В миску добавлено " + ham + " ветчины.");
        }
    }

    public String toString() {
        return "Миска содержит " + food + " кусочка ветчины.";
    }

}