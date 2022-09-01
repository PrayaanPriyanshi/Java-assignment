  /*  Author @Manisha Singh(Write a method th find factorial of a number input by user.
factorial(int n).call this method from main() and pass argument n .
Repeat this untill user enters no.)*/

import java.util.Scanner;
public class Factorial {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	char ch='y';
	
	
		while(ch=='y')
		{
			
			System.out.println("Enter Number For Factorial");
			//take user input
			int n=sc.nextInt();
			
			factorial(n);//call Factorial function with input n
			System.out.println("Do u want to continue(y/n)");
			ch=sc.next().charAt(0);
		}
		
	
	}
	
	
	static void factorial(int n)
	{
		int i=1,fact=1;
		while(i<=n) //n is always greater then i it is condition 
		{
		fact=fact*i;
		i++;//increment of i
		}
		System.out.println("factorial number is "+fact);

	}
	
	
	
}
	
	
	


	