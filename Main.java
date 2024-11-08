public class Main {
    public static void main(String[] args) {
        Person[] persArray = new Person [5];
        persArray [0] = new Person ("Кузнецов Андрей Иванович", "Frontend-инженер", "andrey86787@mail.ru", 80000, "798885609", 27);
        persArray [1] = new Person ("Аксентьев Давид Моисеевич", "QA тестровщик", "ndder1111@mail.ru", 70000, "798645609", 25);
        persArray [2] = new Person ("Балык Артем Романович", "Backend-инженер", "ghgggg7@mail.ru", 70000, "7789564345", 22);
        persArray [3] = new Person ("Гаджиев Эльдар Александрович", "Мэнеджер", "ssssss22222@mail.ru", 100000, "795436746",37);
        persArray [4] = new Person ("Петров Алексей Евгеньевич", "Системный аналитик", "Petrov@mail.ru", 10000, "798324235", 41);
        for (Person employee : persArray) {
            employee.Info();
        }
        Park park = new Park("Парк озера Толлука");
        Park.Attraction attraction = new Park("").new Attraction("Лошадка", 1200, 200);
        park.parkInfo();
        attraction.attractionInfo();
    }
}