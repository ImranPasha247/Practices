class Animal {
    void eat() {
        System.out.println("The animal is eating.");
    }
}

// Subclass inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("The dog is barking.");
    }
}

// Class with main( )
public class SingleInheritanceExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        myDog.eat(); // Inherited from Animal class
        myDog.bark(); // Unique to Dog class
    }
}