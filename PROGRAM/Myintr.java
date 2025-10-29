//wap using interface to implement in a class

interface A
{
void S();
}
interface B
{
void S1();
}
class C implements A,B
{
 public void S()
{
System.out.println("I am in S class");
}
public void S1()
{
System.out.println("I am in S1 class");
}
}
public class Myintr
{
public static void main(String args[])
{
C obj=new C();
obj.S();
obj.S1();
}
}


