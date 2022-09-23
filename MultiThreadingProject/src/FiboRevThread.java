 /* Author @Manisha (Write a JAVA program which will generate two threads:(Use Synchronization)

- To display 10 terms of Fibonacci series.
- To display 1 to 10 in reverse order.)*/

class FibSeries extends Thread
{
	
	// @override run method
	synchronized public void run()
	{
		System.out.println("To display sum of 10 terms of Fibonacci series : "+fibseries(10));
		System.out.println(" To display 1 to 10 in reverse order is: ");
		reverseorder();
	}
	
	int fibseries(int n)  //method start
	{
		int num1=0,num2=1;
		int num3=0;
		for(int i=1;i<=n;i++)
		{
			num3=num1+num2;
			num1=num2;
			num2=num3;
		}
		return num3;
	}
	
	void reverseorder ()  //method start
	{
		for(int i=10;i>=1;i--)//for printing the num.in reverse order
		{
			System.out.println(i);
		}
	}
}

public class FiboRevThread {
	//main method started for execution
		public static void main(String[] args) 
		{
			
			//creating the class  objects 
			FibSeries ob=new FibSeries();
			Thread t1=new Thread(ob,"MyThread1");
			t1.start();
		}
}
