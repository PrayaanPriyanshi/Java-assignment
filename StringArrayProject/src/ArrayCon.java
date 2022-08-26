/*Author @Manisha(Create two arrays. One containing String values: Peter , Amy, John ,Boyd, and
Cathy, and another one containing int values: 15,9, 14, 10,and 12.
 create an  table showing  these values as name value pairs as below.

Name           Value

Amy		9
Boyd		10
Cathy		12
John		14
Peter		15*/

public class ArrayCon {
//	 accepting both array value
	static void joinArr(String s[],int arr[])
	{
		System.out.println("Names\tValues\n");
		for(int i=0;i<s.length;i++)
		{
				System.out.println(s[i]+"\t"+arr[i]);
		}
	}

//	main method start
	public static void main(String[] args) {
//		Array of names
		String st[] = {"amy","boyd","cathy","john","peter"};
		
//		Array of Values
		int a[] = {9,10,12,14,15};
		
//		Calling method - there is no need to create instance(obj) because method is static
		joinArr(st,a);
	}

}

	


