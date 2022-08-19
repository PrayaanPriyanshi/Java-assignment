//Author @Manisha
import java.util.Scanner;


public class ExceptionCheck {
	void divException(String n1,String n2)
	{	
//		for storing the average value
		int r; 

		try {
//		converting String values into integer for arithmetic calculation 
			r = Integer.parseInt(n1)/Integer.parseInt(n2);
//		if there is no any Exception occur it will print average of two number 
			System.out.println("Average is : "+r);
		}
//		Exception occur when number is divided by 0
		catch(ArithmeticException e)		{
			System.out.println(" division is not possible");
		}
//		this Exception occur when user gives any text instead of numbers
		catch(NumberFormatException  e) {
			System.out.println("Format mismatch");
		}
//		if any other exception is occur 
		catch(Exception e)
		{
			System.out.println("Exception encountered");	
		}

		finally{
			System.out.println("Exception handling completed");
		}
	}
	public static void main(String[] args) {
//		creating instance of class Scanner for accept values from user
		Scanner sc =new Scanner(System.in);

//		Accepting two values from user
		System.out.println("enter two values : ");
		String n1=sc.next();
		String	n2=sc.next();


		ExceptionCheck obj = new ExceptionCheck();

		obj.divException(n1,n2);


		sc.close();
	}

}

