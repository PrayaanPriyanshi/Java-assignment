/*Author @Manisha(WAP to create a HashMap and add 5 student's id(101,102,103,104,105) as key and name as value.
   Print the name of students whose id is greater than 103.)*/

import java.util.HashMap;
import java.util.Map;
public class StudentMap {
	public static void main(String ar[])
	{
//		Create HashMap
		Map <Integer,String> stu = new HashMap<Integer,String>();
		
//		add data
		stu.put(101, "manisha singh");
		stu.put(102, "komal singh");
		stu.put(103, "priya yadav");
		stu.put(104, "prisha yadav");
		stu.put(105, "priyanshi singh");
		

		 stu.forEach((m, n) -> 
		 {
			 if(m>103)
			
			 System.out.println(m + " :-> "+ n);
		 });
                                       
	}
}
