//wap to create two interface father and mother and find the average height of child class

interface Father
{
int FatherHeight=5.7;
}
interface Mother
{
int MotherHeight=4.9;
}
class child implements Father,Mother
{
public void show()
{
int averageHeight=(father.FatherHeight + mother.MotherHeight)/2;
System.out.println("Average Height: " + averageHeight);
}
}
public class Myintr2
{
public static void main(String args[])
{
child obj=new child();
obj.show();
}
}