//Author @Manisha

import java.util.Scanner;

public class ArraySum {
	int sum(int[] values, int start,int end)
	{
		int sum = 0; 
		try 
		{
			for(int a = start;a<end;a++) //loop iterating from start index to end index
			{
				sum += values[a];// calculate Sum of array Values 
			}
			
			if(start==end) 
				throw new IllegalArgumentException();
			
			if(values==null) 
				throw new NullPointerException();
			
			if(start<0 || end>=values.length || start>end)
				throw new ArrayIndexOutOfBoundsException();
			
			if(sum==0) //  
				throw new Exception();
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("IllegalArgumentException");
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		catch(NullPointerException a)
		{
			System.out.println("NullPointerException");
		}
		catch(Exception e) 
		{
			System.out.println("sum is 0");
		}

		return sum;
	}
		public static void main(String[] args) {

			ArraySum  sa = new ArraySum();

			Scanner sc = new Scanner(System.in);
			int start,end,size;

			System.out.println("Enter Size of array : ");
			size = sc.nextInt();
			int arr[] =new int[size];
//			Accepting array values from user
			for(int i=0;i<size;i++)
			{
				System.out.println("enter value of ["+i+"] index");
				arr[i]=sc.nextInt();
			}
			
			System.out.println("Enter Start index of array : ");
			start = sc.nextInt();
			
			System.out.println("Enter End index of array : ");
			end = sc.nextInt();

//			calling sum method 
			System.out.println("Sum of array elements is : "+sa.sum(arr, start, end));
			sc.close();
		}
	

}
