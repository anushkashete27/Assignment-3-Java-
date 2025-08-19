import java.util.*;
class Student
{
int phy;
int math;
int english;
public void marks()
{
int sum=phy+math+english;
int avg=sum/3;
System.out.println("Total marks is:"+sum);
System.out.println("Average marks is:"+avg);
}
}

class Semister2 extends Student
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Semister2 s=new Semister2();
System.out.println("Enter the marks of phy:");
s.phy=sc.nextInt();
System.out.println("Enter the marks of math:");
s.math=sc.nextInt();
System.out.println("Enter the marks of english:");
s.english=sc.nextInt();
s.marks();
}
}