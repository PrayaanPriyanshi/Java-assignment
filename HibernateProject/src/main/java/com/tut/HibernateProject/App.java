package com.tut.HibernateProject;
import org.hibernate.Session;
import org.hibernate.Transaction;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )//main matheod started...
    {
    	System.out.println("project is running");
    	
    	//set employees details
    	
    	Employee e1=new Employee();
    	e1.setName("Manisha");
    	e1.setEmp_id(101);
    	e1.setDept("GM");
    	e1.setSalary(10000);

    	
    	Employee e2=new Employee();
    	e2.setName("Prayaan");
    	e2.setEmp_id(102);
    	e2.setDept("SEO");
    	e2.setSalary(95000);
    	
    	Employee e3=new Employee();
    	e3.setName("Priyanshi");
    	e3.setEmp_id(103);
    	e3.setDept("COMPUTER SCIENCE");
    	e3.setSalary(50000);
    	
    	
    	Emp_Details ed1=new Emp_Details();
    	ed1.setEd_id(1);
    	ed1.setBank_Account("988687768886");
    	ed1.setAddress("New Delhi");
    	ed1.setGender("Female");

    	
    	Emp_Details ed2=new Emp_Details();
    	ed2.setEd_id(2);
    	ed2.setBank_Account("9985669343654");
    	ed2.setAddress("Pataudi");
    	ed2.setGender("Male");
    	
    	Emp_Details ed3=new Emp_Details();
    	ed3.setEd_id(3);
    	ed3.setBank_Account("3232323543456");
    	ed3.setAddress("Gurugram");
    	ed3.setGender("Female");
    	
    	
    	
    	 Session session=HibernateUtil.getSession();//create session
         
         Transaction t=session.beginTransaction();
          
         session.save(e1);
        session.save(ed1);
        session.save(e2);
        session.save(ed2);
        session.save(e3);
        session.save(ed3);
       
          
         t.commit();
       
         session.close();
    	
    	

    	}

        				}

