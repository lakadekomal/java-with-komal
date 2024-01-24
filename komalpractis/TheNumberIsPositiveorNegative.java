package komalpractis;
import java.util.Scanner;
public class TheNumberIsPositiveorNegative {
	
	
	public static void main(String[] args) { 
	int a;
	Scanner sc=new Scanner(System.in); 
	System.out.println("Enter the A "); 
	a=sc.nextInt();
	if (a>=1) {
	System.out.println(" numberis possitive");
	}
	else if (a==0)
	{
	System.out.println("number iszero");
	}
	else {
	System.out.println("numberis negative");
	}
	}
}

	