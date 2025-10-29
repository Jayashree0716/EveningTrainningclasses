//inheritance: a public data member of a parent class into a child class and display the square

class A
{
int x=3;
}
class B extends A
{
void show()
{
System.out.println("Number: " + x);
System.out.println("Square: " + (x * x));
}
}

public class Task1
{
public static void main(String args[])
{
B obj = new B();
obj.show();
}
}
