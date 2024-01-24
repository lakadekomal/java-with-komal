package komalpractis;

public class OverridingRuntimePolymorphism {

	
	
	void Show(int a) {
	System.out.println( " thisis a sonali");
	}
	
	
	
	void Show()
	{
	System.out.println( " thisis a pavan");
	}
	public static void main(String[] args) {
	OverridingRuntimePolymorphism sp=new OverridingRuntimePolymorphism (); 
	sp.Show(9);
	sp.Show();
	}
	}

