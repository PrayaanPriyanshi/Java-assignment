package com.springhibernate.Enitity;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
//class User is the entity class
public class Book {

	
	//data members of class User
		@Id
		private int bid;
		private String bname;
		private String bauthor;
		public Book(int bid, String bname, String bauthor) {
			super();
			this.bid = bid;
			this.bname = bname;
			this.bauthor = bauthor;
		}
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
		public String getBauthor() {
			return bauthor;
		}
		public void setBauthor(String bauthor) {
			this.bauthor = bauthor;
		}
		public Book() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Book [bid=" + bid + ", bname=" + bname + ", bauthor=" + bauthor + "]";
		}
		
	
	
}
