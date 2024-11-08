public class Person {
    private String name;
    private String appointment;
    private String mail;
    private int salary;
    private String phone;
    private int age;

    public Person (String name, String appointment, String mail, int sallary, String phone, int age) {
        this.name = name;
        this.appointment = appointment;
        this.mail = mail;
        this.salary = sallary;
        this.phone = phone;
        this.age = age;
    }
    public void Info() {
        System.out.println(this.toString());
    }
    public String toString() {
        return "Работник: " + "\n" + name + "\n" + appointment + "\n" + mail + "\n" + salary + "\n" + phone + "\n" + age + "\n";
    }
}