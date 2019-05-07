package demo;

public class ThisKeyword {

	//// THIS KEYWORD USED TO REFER CURRENT CLASS OF VARIABLE
	/*String name;
	int id;
	int Mobile_No;
	
	ThisKeyword(String name, int id, int Mobile_No)
	{
		this.name = name;
		this.id = id;
		this.Mobile_No = Mobile_No;
	}
	
	void display()
	{
		System.out.println(name + "-->" + id +"-->"+Mobile_No);
	}
	
	public static void main(String args[])
	{
		ThisKeyword this1 = new ThisKeyword("aaa" , 1 , 56656565);
		ThisKeyword this2 = new ThisKeyword("bbb" , 2 , 698989898);
	
	this1.display();
	this2.display();
	}*/
	
////THIS KEYWORD USE TO INVOLK CURRENT CLASS OF METHOD	
	
	void test1()
	{
		System.out.println("hello");
	}
	void test2()
	{
		System.out.println("hii");
		test1();
	}
}
	class Thismethod{
	public static void main(String args[])
	{
		ThisKeyword met = new ThisKeyword();
		met.test2();
	}
}
