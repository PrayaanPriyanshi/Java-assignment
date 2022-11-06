package com.tut;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
public class Rectangle extends Shape{
	@Column
    int length ;
	@Column
    int breadth ;
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rectangle(int shapeId) {
		super(shapeId);
		// TODO Auto-generated constructor stub
	}
	public Rectangle(int shapeId,int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + ", getShapeId()=" + getShapeId()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() +  "]";
	}



}
