//Author @Manisha Singh (Write a Java program to create multiple thread in Java.
    //(Print even and Odd numbers)Set their name and prorities.)

class ThreadTest extends Thread{
	// @override run method
	public void run()
	{
		
		int number=15;
		
	      for(int i= 1; i<= number; i++)//printing the even number
	      {
	         if(i % 2 == 0)
	         {
	            System.out.println(Thread.currentThread().getName()+"      "+i);
	         }
	      }
	      
	      for(int i = 1; i <= number; i++)//printing the odd number
	      {
	         if(i % 2 == 1)
	         {
	            System.out.println(Thread.currentThread().getName()+"    "+i );
	         }
	      }
	 }
}
public class Threads 
{
	public static void main(String args[]) 
	{
	//creating the class  objects 
	 ThreadTest th1=new ThreadTest();
	  ThreadTest th2=new ThreadTest();
	  // using set method set the name
	  th1.setName("Thread 1");
	  th1.setName("Thread 2");
	  //set priority
	  th1.setPriority(5);
	  th2.setPriority(10);
	  
	  th1.start();
	  th2.start();


}
}