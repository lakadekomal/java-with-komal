package komalpractis;
import java.util.Scanner;
public class TheNumberIEvenorOdd {

	
	
	public static void main(String[] args)
	{
	int a;
	Scanner sc=new Scanner(System.in); 
	System.out.println("Enterthe number "); 
	a=sc.nextInt();
	if (a%2==0) {
	System.out.println("number is even ");
	}
	else {System.out.println("number is odd "); }
	}
}
