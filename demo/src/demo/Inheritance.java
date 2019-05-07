package demo;

public class Inheritance {
	
	void Selenium()
	{
		System.out.println("Selense");
	}
}
class Newinherit extends Inheritance
{
	void TesNg()
	{
		System.out.println("Test data Driven");
	}
}
class FinalInherit{
	public static void main(String args[])
	{
		Newinherit inh = new Newinherit();
		inh.TesNg();
		inh.Selenium();
	}
}


