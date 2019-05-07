package demo;

public class Static {

	/*String name;
	int mobile_number;
	static  String id= "a123bc";

  Static(String n , int mb)
		{	
		   name = n;
		   mobile_number =  mb; 
		}
	
	void display()
	{
		System.out.println(name +" --> "+mobile_number +" --> "+ id);
	}
	
	public static void main(String args[])
	{
		Static stat1 = new Static("aaa",565565665);
		Static stat2 = new Static("bbb",987445555);
		
		stat1.display();
		stat2.display();
	}*/
	
//Static METHOD	
	String name;
	int id;
	static String State = "maharashtra";
	
	static void change()
	{
		 State = "Orrisa";
	}
	
	 Static(String n , int i)
	{
		name = n ;
		id = i;
	}
	
	void display()
	{
		System.out.println(name + "-->" +id + "-->" + State);
	}
	
	public static void main(String args[])
	{
		Static.change();
		
		Static stat1 = new Static("aaa",1);
		Static stat2 = new Static("bbb",2);
		
		stat1.display();
		stat2.display();
	}
}
