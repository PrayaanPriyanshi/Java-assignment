/*Author @Manisha (WAP to create 2 ArrayLists list1 and list2 and add 3 objects of Book in each list
 and print elements of both ArrayLists one on one line.)*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class BookList {

	public static void main(String ar[])
	{
// it is 1st list
		List <Book> list = new ArrayList<Book>();
		list.add(new Book(100,"Java","James Gosling"));
		list.add(new Book(101,"Artificial Intelligence","Suman Wadhwa"));
		list.add(new Book(102,"Python","Suman Wadhwa"));
	

		list.forEach(
	            (t) -> { System.out.println(t); });

// it is 2nd list
		
		List <Book> list1 = new ArrayList<Book>();
		list1.add(new Book(103,"HTML","Suman Wadhwa"));
		list1.add(new Book(104,"JavaScript","Suman Wadhwa"));
		list1.add(new Book(105,"c++","Suman Wadhwa"));
		

		Iterator<Book> ls = list1.iterator();
	
//		iterating the list
		while(ls.hasNext())
			System.out.println(ls.next());
	}
}
