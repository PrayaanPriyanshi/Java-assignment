/*Author @Manisha Apply InterThread Communication on demand and supply model.
  Create a class Producer with one data member int availableProduct and 
  two methods --demand() and supply().
  Create two threads . In the run() of first thread call demand(int n) and 
  In the run() of second thread call supply(int n).If deamnding number is gretaer than availableProduct
  consumer should wait till supply increases the available*/

class ThreadSupply
{
	int availableProduct=20;
	synchronized 
	public void demandMethod(int avail)
	{
		if(availableProduct<avail) 
		{
			try {
				wait(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		else
			availableProduct-=avail;
			System.out.println( "Demand Product:   "  +  availableProduct);
		}

	synchronized public void supplyMethod(int i)
	{
		availableProduct+=i;
		System.out.println("Supply Product:     "      +availableProduct);

		notify();
	}
}
class MyThreadA extends Thread{
	ThreadSupply ts;
	MyThreadA(ThreadSupply ts)
	{
		this.ts=ts;
	}
	public void run()
	{
		ts.demandMethod(5);
	}
}class MyThreadB extends Thread{
	ThreadSupply ts;
	MyThreadB(ThreadSupply ts)
	{
		this.ts=ts;
	}
	public void run()
	{
		ts.supplyMethod(5);
	}
} 

public class DemandSupply {
	public static void main(String[] args) {

		ThreadSupply ts=new ThreadSupply();
			MyThreadA th=new MyThreadA(ts);
			MyThreadB th1=new MyThreadB(ts);
			th.start();
			th1.start();

	}

}
