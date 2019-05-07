package demo;

public class Constructor {

///constructor having NO-PARAMETER
	
	/*Constructor()
	{
		System.out.println("aaa");
	}
	
	public static void main(String args[])
	{
		Constructor cons = new Constructor();
		
	}*/

/// NO-CONSTRUCTOR or DEFAULT CONSTRUCTOR
/*String name;
int id;

void display()
{
	System.out.println(name + id);
}

public static void main(String args[])
{
	Constructor con = new Constructor();
	Constructor con1 = new Constructor();
	
	con.display();
	con1.display();
}*/


///PARAMETERIZED CONSTRUCTOR
/*String name;
int id;

Constructor(String n, int i)
{
	name = n;
	id = i;
	
}

void display()
{
	System.out.println(name + " --> "+ id);
}


public static void main(String args[])
{
	Constructor con1 = new Constructor("aaa" , 1);
	Constructor con2 = new Constructor("bbb" , 2);
	
	con1.display();
	con2.display();
}*/

	
///Constructor overloading	
String name;
int id;
float salary;

Constructor(String n,int i)
{
	name = n;
	id = i;
}

Constructor(String n , int i , float s)
{
	name = n;
	id = i;
	salary = s;
}

void display()
{
	System.out.println(name+" --> "+id +" --> "+ salary);
}
public static void main(String args[])
{
Constructor con1 = new Constructor("aaa", 1);
Constructor con2 = new Constructor("aaa", 2, 25000);

con1.display();
con2.display();
}

}
