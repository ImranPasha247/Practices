// Interface 1 
interface Swimmer  
{ 
void swim(); 
} 
// Interface 2 
interface Flyer  
{ 
void fly(); 
} 
// Class implementing multiple interfaces 
class Bird implements Swimmer, Flyer  
{ 
public void swim()  
{ 
System.out.println("The bird is swimming."); 
} 
public void fly()  
{ 
System.out.println("The bird is flying."); 
} 
}
public class MultipleInheritanceExample  
{ 
public static void main(String[] args)  
{ 
Bird myBird = new Bird(); 
myBird.swim(); // Implements Swimmer interface 
myBird.fly();  // Implements Flyer interface 
} 
} 