import java.util.*;
 class factor
{
public static void main(String[] agrs)
 {
try{
 Scanner sc=new Scanner(System.in);
 System.out.println("ENTER A NUMBER");
 int n=sc.nextInt();
if(n>0){
 int i,count=0;
 for(i=1;i<=n;i++)
 {
 if(n%i==0)
 count++; 
 }
 System.out.println("NUMBER OF FACTORS OF "+n+" IS "+count);
}

else{
	System.out.println("give valid input");
}
}
catch(Exception e){
	System.out.println("invalid input");
}
 }
 }
