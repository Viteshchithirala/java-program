import java.util.*;
 class fact
{
 public static void main(String []args)
 {
try{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the number: ");
 int num=sc.nextInt();
if(num>=0){
 int i=1,fact=1;
 while(i<=num)
 {
 fact=fact*i;
 i++;
 }
 System.out.println("Factorial of the number: "+fact); 
}
 
else{
	System.out.println("enter valid input");
}
}
catch(Exception e){
 System.out.println("invalid input");
}
}
}
