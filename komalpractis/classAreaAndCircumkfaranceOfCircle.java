package komalpractis;
import java.util.Scanner;
public class classAreaAndCircumkfaranceOfCircle 
{

	
	int r,area,circumfofcr;
	void input()
	{
	Scanner sc=new Scanner(System.in); 
	System.out.println("Enter the radius"); 
	r=sc.nextInt();
	}
	void areaCircumfarance()
	{
	System.out.println("Area of circle = "+3.14*r*r); 
	System.out.println("Circumfarance of circle = "+2*3.14*r);
	}
	public static void main(String[] args)
	{
		classAreaAndCircumkfaranceOfCircle cc=new classAreaAndCircumkfaranceOfCircle();
	cc.input(); 
	cc.areaCircumfarance();
	}
	}
