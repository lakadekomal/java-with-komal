package komalpractis;
import java.util.Scanner;
public class PrintAsciiValueoftheCharacte {

	public static void main(String[] args)
	{
		char Str11,Str2;
	Scanner sc=new Scanner(System.in); 
	System.out.println("Enterthe asciivalue 1"); 
	
	char str11 = sc.next().charAt(0); 
	System.out.println("Enterthe asciivalue 2"); 
	char str2 = sc.next().charAt(0);
	int ascci1=str11; 
	int ascci2=str2;
	System.out.println("The ASCII value of " + str11 + " is: " + ascci1); 
	System.out.println("The ASCII value of " + str2 + " is: " + ascci2);
	}
	}
	