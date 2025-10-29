import java.util.Scanner;
public class VotingAge
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter your age:");
int age=sc.nextInt();
if (age > 18)
{
System.out.println("You are ready for vote.");
}
else
{
System.out.println("You are not eligible for voting.");
}
}
}