package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HiberUtil {
	public static Session getSession()
	{
		
		 //Congifuring the hibernate
    	Configuration cfg=new Configuration();
        cfg.configure();
       
        //Creating the session
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        return session;
        
        
	}

}

