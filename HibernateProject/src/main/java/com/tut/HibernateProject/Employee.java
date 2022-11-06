package com.tut.HibernateProject;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;


@Entity
public class Employee {
	 @Id
	@GeneratedValue(strategy=GenerationType.AUTO)  
	@PrimaryKeyJoinColumn(name="emp_id")
	private int emp_id;
	private String name;
	private String dept;
	private long salary;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Emp_Details ed_id;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int emp_id, String name, String dept, long salary, Emp_Details ed_id) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.ed_id = ed_id;
	}

	
	

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}
 

	public void setDept(String dept) {
		this.dept = dept;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public Emp_Details getEd_id() {
		return ed_id;
	}

	public void setEd_id(Emp_Details ed_id) {
		this.ed_id = ed_id;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + ", ed_id="
				+ ed_id + "]";
	}

	
	

}

