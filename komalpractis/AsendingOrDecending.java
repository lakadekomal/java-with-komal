package komalpractis;
import java.util.Scanner;
public class AsendingOrDecending 
	
 {
	public static void main(String[] args) 
	{ 
	int a,b,c;
	Scanner sc=new Scanner(System.in); 
	System.out.println("Enter 1 number"); 
	a=sc.nextInt(); 
	System.out.println("Enter 2 number"); 
	b=sc.nextInt(); 
	System.out.println("Enter 3 number"); 
	c=sc.nextInt();
	if(a>b&&b>c)
	{
	System.out.println("Assending order");
	}
	else if(a<b&&b<c)
	{
	System.out.println("Desending order");
	}
	else {
	System.out.println("random order");
	}
	}
	}
	