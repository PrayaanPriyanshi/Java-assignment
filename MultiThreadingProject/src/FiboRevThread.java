 /* Author @Manisha (Write a JAVA program which will generate two threads:(Use Synchronization)

- To display 10 terms of Fibonacci series.
- To display 1 to 10 in reverse order.)*/

class one extends Thread
	{
		synchronized	 public void fiboSeries()  {
			int n=10, a = 0, b = 0, c = 1;
	        
	        System.out.print("Fibonacci Series:");
	        for(int i = 1; i <= n; i++)
	        {
	            a = b;
	            b = c;
	            c = a + b;
	            System.out.print(a+" ");
	        }
	    }
		
		
		    synchronized	 public void revNum()
		    {
		    	System.out.println("revers number series");
		    	for(int i=20;i>=1;i--)
		    		System.out.println(i);
		    }
	}
	class Thread1 extends Thread{
		one n;
		public Thread1(one n) {
			this.n=n;
		}
		public void run() {
			n.fiboSeries();
		}
		
	}
	class Thread2 extends Thread{
		one n;
		public Thread2(one n) {
			this.n=n;
		}
		public void run() {
			n.revNum();
		}
	}

public class FiboRevThread {
	public static void main(String args[]) {
		one o1=new one();
		Thread1 th1=new Thread1(o1);
		Thread2 th2=new Thread2(o1);
		th1.start();
		th2.start();

}
}