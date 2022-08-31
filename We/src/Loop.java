import java.util.*;  
public class Loop {
	public static void main() {
		//int n,count=0;
		char c='y';
		Scanner sc=new Scanner(System.in);
		while(c=='y')
		{
			int n,count=0;
			System.out.println("enter the no");
			n=sc.nextInt();
			
			int i;
			for(i=2;i<n/2;i++) {
				if(n%i==0)
				{
					count++;
					break;
				}
			}
			if (count==1 ||n==0) {
				System.out.println("no. is not prime");
			}
			else {
				System.out.println("no is prime");
			}
			//System.out.println("want to continue y/n");
			//c=sc.next().charAt(0);
			
		}
		System.out.println("want to continue y/n");
		c=sc.next().charAt(0);
	}
	
	
}
