
//@Manisha Singh
package com.tut;



public class Book {
	private int bid;
	private String bname;
	private String price;	
	static int counter=1;
	
	// genrate getter and shetter...
	
	public int getBid() {
		return bid;
	}


	public void setBid(int bid) {
		this.bid = bid;
	}


	public String getBname() {
		return bname;
	}


	public void setBname(String bname) {
		this.bname = bname;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}


	public Book() {
		super();
	}


	public Book(int bid, String bname, String price) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.price = price;
	}
	//Genrate to string method...

	@Override
	public String toString() {
		return "Book-"+(counter++)+ " [bis=" + bid + ", bname=" + bname + ", price=" + price + "]";
	}
	
}