class A
{
int x=2;
}
class B extends A
{
int y=4;
}
class C extends B
{
int z=8;
void sum()
{
System.out.println(x+y+z);
}
}
public class MultipleInheritance
{
public static void main(String args[])
{
C obj=new C();
obj.sum();
}
}