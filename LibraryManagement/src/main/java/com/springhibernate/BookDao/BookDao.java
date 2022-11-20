package com.springhibernate.BookDao;
import java.util.List;

import com.springhibernate.Enitity.Book;


//interface BookDao
public interface BookDao {
	//abstract BookDao interface method
		public int insertBookDetails(Book bd);
		public int updateBookDetails(Book bd);
		public int deleteBookDetails(Book bd);
		public Book getSpecificBookDetails(int bid);
		public List<Book> getAllDetails();
}
