// Grandparent class 
class Animal  
{ 
void eat()  
{ 
System.out.println("The animal is eating."); 
} 
} 
// Parent class inheriting from Animal 
class Dog extends Animal  
{ 
void bark()  
{ 
System.out.println("The dog is barking."); 
} 
} 
// Child class inheriting from Dog 
class GermanShepherd extends Dog  
{ 
void guard()  
{ 
System.out.println("The German Shepherd is guarding."); 
} 
} 
public class MultilevelInheritanceExample  
{ 
public static void main(String[] args)  
{ 
GermanShepherd myDog = new GermanShepherd(); 
myDog.eat();    // Inherited from Animal 
myDog.bark();   // Inherited from Dog 
myDog.guard();  // Unique to GermanShepherd 
} 
} 