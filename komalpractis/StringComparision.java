package komalpractis;
import java.util.Scanner;

public class StringComparision {

	public class StringComparison
	{
	public static void main(String[] args)
	{
	 Scanner scanner = new Scanner(System.in);
	System.out.print("Enterthe firststring: "); 
	String str1 = scanner.nextLine();
	System.out.print("Enterthe second string: "); 
	String str2 = scanner.nextLine();
	if (str1.equals(str2))
	{
	System.out.println("The strings are equal.");
	}
	else
	{
	System.out.println("The strings are not equal.");
	}
	}
	}
}
	