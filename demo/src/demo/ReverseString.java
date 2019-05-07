package demo;

public class ReverseString {
	
	public static void main(String args[])
	{
	String str = "Hello world";

	////1 without using inbuild Function
	
	/*for(int i = str.length()-1 ; i>=0 ; i--)
	{
		System.out.println(str.charAt(i));
	}*/
	////2 using inbuild function
	
	StringBuilder ab = new StringBuilder(str);
	System.out.println(ab.reverse());
	
	}
}
