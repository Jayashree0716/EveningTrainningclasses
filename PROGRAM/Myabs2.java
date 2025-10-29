//wap use two abstract methods inside the abstract display your name class and define your college name separately

abstract class A
{
abstract void show();
abstract void display();
}
class B extends A
{
void show()
{
System.out.println("My name is Rani");
}
void display()
{
System.out.println("My college name is NIT");
}
}
public class Myabs2
{
public static void main(String args[])
{
B obj=new B();
 obj.show();
 obj.display();
}
}