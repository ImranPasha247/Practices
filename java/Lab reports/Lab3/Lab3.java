public class Lab3 {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 2020);
        Car car2 = new Car("Honda", 2018);
        System.out.println("Car 1 Details:");
        car1.displayDetails();

        System.out.println("\nCar 2 Details:");
        car2.displayDetails();
        car1.setYear(2022);
        System.out.println("\nUpdated Car 1 Year:");
        car1.displayDetails();
    }
}
class Car {
     String brand;
     int year;
    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}