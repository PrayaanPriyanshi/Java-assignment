/*Write a method that takes a String[] as an argument and returns
a String containing the concatenation of all the strings in the
input array. Invoke your method 3 times with different arguments. Make
sure that your code handles the cases where the argument is null.*/


public class StringConcat {
	//	accepting a String array from user
	static String strConcat(String st[])
	{

		StringBuilder builder = new StringBuilder();;
		try {
//			throwing an exception when st is empty
			if(st==null) {
				throw new Exception();
			}

//			join array values  for each loop
			for(String s : st) {
//				append string one by on at the end of builder obj
				builder.append(s+" ");
			}
		}catch(Exception e)
		{

			System.out.print("Enter the value in an array");
		}

		return builder.toString();
	}
	public static void main(String[] args) {
//		make three array of Strings
		String st1[]= null;
		String st2[]= {"learn","java","from","basic"};
		String st3[]= {"Manisha","Singh"};

//		Invoking method three times strConcat(strarr)
		System.out.println(strConcat(st1));
		System.out.println(strConcat(st2));
		System.out.println(strConcat(st3));

	}

}


