public class lab2 {
    public static void main(String[] args) {
        Person person1 = new Person("Imran Pasha Sinha", 21, "Male");
        Person person2 = new Person("Mizan Pasha Rauph", 24, "Male");
        System.out.println("Person 1 Information:");
        person1.displayInfo();

        System.out.println("\nPerson 2 Information:");
        person2.displayInfo();
    }
}
class Person {
     String name;
     int age;
     String gender;
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}