package com.tut.HibernateProject;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Emp_Details {
	@Id
	@GeneratedValue
	
	
	@PrimaryKeyJoinColumn(name="ed_	id")
	private int ed_id;
	private String Address;
	private String Gender;
	private String Bank_Account;
	
	@OneToOne(cascade = CascadeType.ALL)
	//@OneToOne(targetEntity=Employee.class) 
	private Employee employee;
	
	
	public Emp_Details(int ed_id, String address, String gender, String bank_Account) {
		super();
		this.ed_id = ed_id;
		Address = address;
		Gender = gender;
		Bank_Account = bank_Account;
	}
	public Emp_Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public int getEd_id() {
		return ed_id;
	}
	public void setEd_id(int ed_id) {
		this.ed_id = ed_id;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getBank_Account() {
		return Bank_Account;
	}
	public void setBank_Account(String bank_Account) {
		Bank_Account = bank_Account;
	}
	@Override
	public String toString() {
		return "Emp_Details [ed_id=" + ed_id + ", Address=" + Address + ", Gender=" + Gender + ", Bank_Account="
				+ Bank_Account + "]";
	}
}
