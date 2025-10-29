//inherit: private,public and protected data members and display them using child class member function

class A
{
private int x=3;
public int y=4;
protected int z=5;

public int s()
{
return x;
}
}

class B extends A
{
void display()
{
System.out.println("Private member: " + s());
System.out.println("Public member: " + y);
System.out.println("Protected member: " + z);
}
}

public class Task2
{
public static void main(String args[])
{
B obj = new B();
obj.display();
}
}










