package demo;

public class Overloading {

	/*static int test1(int a,int b)
	{
		return(a+b);
	}
	
	static int test2(int a, int b , int c)
	{
		return(a+b+c);
	}
	
	public static void main(String args[])
	{
		System.out.println(Overloading.test1(10, 20));
		System.out.println(Overloading.test2(10, 20, 30));
	}*/

	
/// BY CHANGING DATA TYPES
static int test1(int a, int b)
{
	return(a+b);
}
static double test2(double d, double e )
{
	return(d+e);
}

public static void main(String args[])
{
	System.out.println(Overloading.test1(10, 10));
	System.out.println(Overloading.test2(10.30, 20.05));
}

}
