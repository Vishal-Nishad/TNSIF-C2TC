package com.dayone.practice;

class Person{       
	private String name;
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
}
class passport{
	private int passportNum;
	public void setPassNum(int passportNum) {
		this.passportNum=passportNum;
	}
	public int getpassNum() {
		return passportNum;
	}
}

	
	public class OneToOneAssociation{
		public static void main(String args[]) {
			Person person=new Person();//creating object for person 
			person.setName("vishal");
			System.out.println("Name of the person:"+person.getName());
			
			passport passNum = new passport();//creating object for passport number
			passNum.setPassNum(7438);
			System.out.println("His passport number is :"+ passNum.getpassNum());
			
			person.setName(" vishal nishad");
			System.out.println(person.getName());
			passNum.setPassNum(3234);
			System.out.println(passNum.getpassNum());
		}

	}

