//wap to hirechical inheritance
class A
{
int x=5;
}
class B extends A
{
int y=6;
void sum()
{
System.out.println("x+y: " + (x+y));
}
}
class C extends A
{
int z=7;
void sum1()
{
System.out.println("x+z: " + (x+z));
}
}
class D extends A
{
int k=9;
void sum2()
{
System.out.println("x+k: " + (x+k));
}
}
public class Hirechical
{
public static void main(String args[])
{
B obj=new B();
obj.sum();
C obj1=new C();
obj1.sum1();
D obj2=new D();
obj2.sum2();
}
}