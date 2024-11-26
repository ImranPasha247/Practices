package devices;

class Device {
    String brand;

    public Device(String brand) {
        this.brand = brand;
    }

    public void powerOn() {
        System.out.println("The " + brand + " device is powering on.");
    }
}

class Smartphone extends Device {
    String model;

    public Smartphone(String brand, String model) {
        super(brand); // Call the constructor of the Device class
        this.model = model;
    }

    public void makeCall(String number) {
        System.out.println("The " + brand + " " + model + " is making a call to " + number + ".");
    }

    @Override
    public void powerOn() {
        System.out.println("The " + brand + " " + model + " is starting up with a welcome screen.");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Smartphone iphone = new Smartphone("Apple", "iPhone 14");
        System.out.println("Device Brand: " + iphone.brand);
        iphone.powerOn(); // Calls the overridden method in the Smartphone class
        iphone.makeCall("123-456-7890"); // Calls the method specific to the Smartphone class
    }
}
