package com.daythree.practice;

public class OOPS {

	public static void main(String[] args) {
		Pen pen1=new Pen();
		pen1.setColor("blue");
		System.out.println(pen1.color);
		pen1.setTip(4);
		System.out.println(pen1.tipsize);
		Pen pen2=new Pen();
		pen2.setColor("black");
		System.out.println(pen2.color);
		
		Student s1=new Student();
		s1.setDetail("vishal nishad", 30);
		
	}

}
	class Pen{
		String color;
		int tipsize;
		void setColor(String newColor) {
			this.color=newColor;
		}
		void setTip(int tipSize) {
			this.tipsize=tipSize;
		}
	}
	class Student{
		String name;
		int regNum;
		int batch=01;
		void setDetail(String name,int regNum) {
			this.name=name;
			this.regNum=regNum;
			System.out.println("Batch no. is :"+batch + "\nName of the Student is : "+ name  + "\nRegistration number is : " +  regNum);
		}
	}
