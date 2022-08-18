

import java.util.Scanner;


public class ExceptionHandel {
	void exceptionHand(int x, int y) {
		int divide=0;
		try {
			divide=x/y;
			System.out.println(" "+x+"/"+y+" is : "+divide);
		} catch (ArithmeticException e) {
			System.out.println("Can't divide "+ x +"/"+y+". Arithmetic Exception");
		}
	}
	public static void main(String args[])
	{
		System.out.println("Enter two  numbers : ");
		//string 1
		Scanner sc= new Scanner(System.in);
		String str= sc.next();
//		String 2
		Scanner sc1= new Scanner(System.in);
		String str1= sc1.next();
		//Parse string 1 to n
		int n= Integer.parseInt(str);
		//Parse string 2 to n1
		int n1= Integer.parseInt(str1);
		//Object of class ExceptionHandle
		ExceptionHandel obj = new ExceptionHandel();
		obj.exceptionHand(n,n1);
	}


}
