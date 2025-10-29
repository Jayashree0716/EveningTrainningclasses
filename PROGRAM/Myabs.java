//wap to display your name by abstract method

abstract class A
{
abstract void show();
}

class B extends A
{
void show()
{
System.out.println("My name is Rani");
}
}
public class Myabs
{
public static void main(String args[])
{
B obj=new B();
 obj.show();
}
}