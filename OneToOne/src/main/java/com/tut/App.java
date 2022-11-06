package com.tut;

/**
 * Hello world!
 *
 */

import org.hibernate.Session;
import org.hibernate.Transaction;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        	Session session=HiberUtil.getSession();
      


        	Rectangle r=new Rectangle();

        	r.setLength(10);
        	r.setBreadth(40);

        	Circle c=new Circle();

        	c.setRadius(6); 

        	Transaction t=session.beginTransaction();
    		
    		session.save(r);
    		session.save(c);
    		t.commit(); 
    		session.close();
        }
    }

