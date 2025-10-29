//inherit: two data members of parent class into child calculate sum and average

class A
{
int x=8;
int y=4;
}

class B extends A
{
void show()
{
int sum= x+y;
int avg=(x+y)/2;
System.out.println("Sum: " + sum);
System.out.println("Avg: " + avg);
}
}
public class Task3
{
public static void main(String args[])
{
B obj = new B();
obj.show();
}
}











