package com.springhibernate.BookDaoImp;
import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;
import com.springhibernate.Enitity.Book;

//import com.springhibernate.BookDao.BookDao;

public class BookDaoImpl {
	//reference of HibernateTemplate class
		private HibernateTemplate ht;
		//method for inserting book details
		@Transactional
		public int insertBookDetails (Book bd)  {

			ht.save(bd);
			return 1;
		}
		//method for updating book details
		@Transactional
		public int updateBookDetails(Book bd) {
			ht.update(bd);
			return 1;
		}
		//method for deleting book details
		@Transactional
		public int deleteBookDetails(Book bd) {
			ht.delete(bd);
			return 1;
		}
		//method for getting specific book details
		public Book getSpecificBookDetails(int bid)
		{
			Book b=ht.get(Book.class, bid);
			return b;

		}
		//method for getting all table data
		public List<Book> getAllDetails() {
			List<Book> b = ht.loadAll(Book.class);
			return b;
		}
		//getter setter for HibernateTemplate class reference
		public HibernateTemplate getHt() {
			return ht;
		}

		public void setHt(HibernateTemplate ht) {
			this.ht = ht;
		}

	}

