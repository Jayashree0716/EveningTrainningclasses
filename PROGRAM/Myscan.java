import java.util.*;
class Emp
{
String E_name;
Scanner sc=new Scanner(System.in);
}
class Dept extends Emp
{
String D_name;
Scanner sc=new Scanner(System.in);
}
class Sec extends Dept
{
String S_name;
Scanner sc=new Scanner(System.in);
void show()
{
System.out.println("Enter the E_name");
System.out.println("Enter the D_name");
System.out.println("Enter the S_name");
E_name=sc.next();
D_name=sc.next();
S_name=sc.next();
}
void dis()
{
System.out.println("E_name: "+ E_name);
System.out.println("D_name: "+ D_name);
System.out.println("S_name: "+ S_name);
}
}
public class Myscan
{
public static void main(String args[])
{
Sec obj=new Sec();
obj.show();
obj.dis();
}
}


