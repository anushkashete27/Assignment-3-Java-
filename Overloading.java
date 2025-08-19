//polymorphism
public class Overloading
{
public void add()
{
int a=10,b=20;
int c=a+b;
}
public int add(int a,int b)
{
return a+b;
}
public double add(double a, double b)
{
return a+b;
}
public static void main(String args[])
{
Overloading o=new Overloading();
o.add();
System.out.println("Addition is:"+c);
int i=o.add(40,60);
System.out.println("Addition is:"+i);
double j=o.add(25.68,34.67);
System.out.println("Addition is:"+j);
}
}