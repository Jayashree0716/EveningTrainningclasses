//wap create an interface and extend its poperties into another interface and implement it.

interface A
{
void show();
}
interface B
{
void show1();
}
class C implements B
{
void show()
{
System.out.println("I am in A methods");
}
void show1()
{
System.out.println("I am in B methods");
}

public class Myintr1
{
public static void main(String args[])
{
C obj=new C();
obj.show();
obj.show1();
}
}