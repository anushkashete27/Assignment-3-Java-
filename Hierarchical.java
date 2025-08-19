class Employee
{
int salary=2000;
void pf()
{
System.out.println("PF facility");
}
}
class Programmer extends Employee
{
int bonus=1000;
void hi()
{
System.out.println("Health Insurance");
}
}
class Tester extends Employee
{
int bonus=5000;
void ti()
{
System.out.println("Term Insurance");
}
}
public class Hierarchical
{
public static void main(String args[])
{
Programmer p=new Programmer();
Tester t=new Tester();
int psalary=p.salary+p.bonus;
int tsalary=t.salary+t.bonus;
System.out.println("Gross salary of programmer is:"+psalary);
p.pf();
p.hi();
System.out.println("Gross salary of tester is:"+tsalary);
t.pf();
t.ti();
}
}
