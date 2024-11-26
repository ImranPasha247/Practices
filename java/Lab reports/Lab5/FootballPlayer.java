
public class FootballPlayer extends Person {
    private String position;

    public FootballPlayer(String name, int age, String position) {
        super(name, age); // Call the constructor of the superclass Person
        this.position = position;
    }

    public void displayPlayerInfo() {
        super.displayInfo(); // Call the displayInfo method from Person
        System.out.println("Position: " + position);
    }
}
