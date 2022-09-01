// Author @Manisha Singh(Write a program to print table of any number input by user.)
import java.util.Scanner;
public class Table {
	public static void main(String args[]) {
	
	int a,i;
	//Take input from the user
	Scanner r=new Scanner(System.in);
	System.out.println("Enter any no to print table");
	a=r.nextInt();
	//Use a for loop to print the table
	for(i=1;i<=10;i++)
	{
		System.out.println(a+" * "+i+" = "+a*i);

}
	}
}