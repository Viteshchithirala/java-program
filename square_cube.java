import java.util.*;
 class decimal 
{
 public static void main(String args[]) 
{
try
{
 Scanner sc = new Scanner(System.in);
 double num;
 System.out.print("Enter the number: ");
 num = sc.nextDouble();
 System.out.println("Square of " + num + " is: " + Math.pow(num, 2));
 System.out.println("Cube of " + num + " is: " + Math.pow(num, 3));
 }
catch(Exception e)
{
System.out.println("Enter valid number");
}
}
}