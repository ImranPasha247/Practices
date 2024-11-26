// Superclass 
class Animal  
{ 
void eat()  
{ 
System.out.println("The animal is eating."); 
} 
} 
// Subclass 1 inheriting from Animal 
class Dog extends Animal  
{ 
void bark()  
{ 
System.out.println("The dog is barking."); 
} 
} 
// Subclass 2 inheriting from Animal 
class Cat extends Animal 
{ 
    void meow()  
   { 
    System.out.println("The cat is meowing."); 
   } 
} 
 
public class HierarchicalInheritanceExample  
{ 
public static void main(String[] args)  
{ 
Dog myDog = new Dog(); 
Cat myCat = new Cat(); 
myDog.eat();   // Inherited from Animal 
myDog.bark();  // Unique to Dog 
myCat.eat();   // Inherited from Animal 
myCat.meow();  // Unique to Cat 
} 
}