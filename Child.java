//inheritance
class Parent
{
String surname="Shete";
int balance=500;
public void display()
{
System.out.println("Surname: "+surname+ " Balance: "+balance);
}
}
class Child extends Parent
{
public static void main(String args[])
{
Child c= new Child();
c.display();
}
}
