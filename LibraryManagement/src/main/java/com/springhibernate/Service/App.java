package com.springhibernate.Service;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.springhibernate.Enitity.Book;

import com.springhibernate.BookDao.BookDao;
import com.springhibernate.BookDaoImp.BookDaoImpl;

/**
 * Hello world!
 *
 */
public class App 
{
  
    	public static void main(String[] args) {
    		//creating ApplicationContext class reference
    		ApplicationContext ac = new ClassPathXmlApplicationContext("bookmngt.xml");

    		BookDao bd = (BookDao) ac.getBean("bdao1");

    		char c='y';
    		//while loop
    		while (c=='y') {
    			//providing book a facility to perform several task
    			System.out.println("Choose any options on which you want to perform task :\n");

    			System.out.println("Choose 1st option to insert the book details: ");
    			System.out.println("Choose 2nd option to update the book details: ");
    			System.out.println("Choose 3rd option to delete the book details: ");
    			System.out.println("Choose 4th option to see specific book details: ");
    			System.out.println("Choose 5th option to display the book details: ");
    			System.out.println("Choose 6th option to exit:");
    			//creating Scanner class object
    			Scanner sc = new Scanner(System.in);
    			System.out.println("Choose any options which you want to choose :\n");
    			int i = sc.nextInt();
    			//switch cases
    			switch (i) {
    			//case 1 -> for inserting book details
    			case 1: {
    				Book b = new Book();
    				System.out.println("insert book id:");
    				int bs1 = sc.nextInt();
    				b.setBid(bs1);
    				System.out.println("insert book name:");
    				String bs2 = sc.next();
    				b.setBname(bs2);
    				System.out.println("insert book author");
    				String bs3 = sc.next();
    				b.setBauthor(bs3);
    				int i1 = bd.insertBookDetails(b);
    				if (i1 == 1)
    					System.out.println("book details inserted successfully...");
    				else
    					System.out.println("problem occured during inserting book details...");
    				break;
    			}
    			//case 2: for updating book details
    			case 2: {
    				Book b1 = new Book();
    				System.out.println("enter id where to update the book details...");
    				int bs1 = sc.nextInt();
    				b1.setBid(bs1);
    				System.out.println("enter book new name to update...");
    				String bs2 = sc.next();
    				b1.setBname(bs2);
    				System.out.println("enter book new author to update...");
    				String bs3 = sc.next();
    				b1.setBauthor(bs3);
    				int i2 = bd.updateBookDetails(b1);
    				if (i2 == 1)
    					System.out.println("book details inserted successfully...");
    				else
    					System.out.println("problem occured during inserting book details...");
    				break;
    			}
    			//case 3: for deleting book details
    			case 3: {
    				Book b2 = new Book();
    				System.out.println("enter the book id for whose record you want to delete :");
    				int bs1 = sc.nextInt();
    				b2.setBid(bs1);
    				int i3 = bd.deleteBookDetails(b2);
    				if (i3 == 1)
    					System.out.println("book details deleted successfully...");
    				else
    					System.out.println("problem occured during deleting book details...");
    				break;

    			}
    			//case 4: for retrieving specific book details
    			case 4: {
    				System.out.println("enter bid to get specific book detail: ");
    				int bid=sc.nextInt();
    				Book bg=bd.getSpecificBookDetails(bid);
    				System.out.println("The details of the book is : ");
    				System.out.println(bg);
    				break;
    			}
    			//case 5: for displaying all book details
    			case 5: {
    				Book b3 = new Book();
    				System.out.println("displaying all book details...");

    				List<Book> list = bd.getAllDetails();
    				System.out.println("\n" + list + "\n");
    				break;
    			}
    			//case 6 for creating a door to exit 
    			case 6:{
    				System.out.println("Have a nice day...bye!!");
    				c='n';
    				break;
    			}
    			//default
    			default:
    				System.out.println("please choose a valid option...\n");
    			}
    			System.out.println("do you want to continue y/n...");
    			c=sc.next().charAt(0);
    		}
    	}}
    
    

