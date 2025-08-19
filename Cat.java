// Inheritance example
class Animal {
String color;
public void voice() 
{
System.out.println("In animal voice");
}
}
class Cat extends Animal {
public void work() {
System.out.println("In Work of Cat");
}
public static void main(String args[]) {
Cat c = new Cat();
c.work();                 
c.voice();               
c.color = "Black";         
System.out.println("The Color of Cat is " + c.color);
}
}
