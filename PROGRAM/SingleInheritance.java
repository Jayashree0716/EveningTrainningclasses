//wap to use the default construction using single inheritance

class A
{
A()
{
System.out.println("I am in base class");
}
}
class B extends A
{
B()
{
System.out.println("I am in base subclass");
}
}
public class SingleInheritance
{
public static void main(String args[])
{
B obj=new B();
}
}
