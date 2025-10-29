//wap  to inherit parent class member function into child class to display "I am parent class" and child class member function to display "I am child class" by using single inheritance

class A
{
void K()
{
System.out.println("I am parent class");
}
}
class B extends A
{
void S()
{
System.out.println("I am child class");
}
} 
public class Task4
{
public static void main(String args[])
{
B obj=new B();
 obj.K();
 obj.S();
}
}