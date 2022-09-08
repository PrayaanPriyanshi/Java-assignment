/* Author @Manisha(Create a class Calculator with two methods add() and substract() and default and parameterized constructor
 Overload theses methods--
   int add(int,int)
   double add(double,int,int)
   String add(String,String)

  int substract(int,int)
   double substract(double,double))*/


public class Calulator {
	public int add(int a,int b)//passing parameter
	{
		int c=a+b;
		System.out.println("Addition of two numbers : "+c);
		return c;
	}
	
	public double add(double a,int b,int c)
	{
		double d=a+b+c;
		System.out.println("Addition of three numbers : "+d);
		return d;
	}
	
	public String add(String str1,String str2)
	{
		String str=str1+str2;
		System.out.println("Addition of two Strings : "+str);
		return str;
	}
	
	public int substract(int a,int b)
	{
		int c=a-b;
		System.out.println("Subtraction of two numbers : "+c);
		return c;
	}
	
	public double substract(double x,double y)
	{
		double z=x-y;
		System.out.println("Subtraction of two(double data type) numbers : "+z);
		return z;
	}
	
	
	//
	
	public static void main(String...args)
	{
		  Calulator cal=new  Calulator();
		cal.add(100, 210);					//int add(int,int)
		cal.add(100000, 512, 456);			//double add(double,int,int)
		cal.add("Manisha", "Singh");			//String add(String,String)
		cal.substract(202, 77);				//int substract(int,int)
		cal.substract(1000000000, 657384847); //double substract(double,double)
		
	}

}
