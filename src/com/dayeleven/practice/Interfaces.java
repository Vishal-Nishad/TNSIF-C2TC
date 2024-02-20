package com.dayeleven.practice;

public class Interfaces {              //Helps to achieve total abstraction.
	public static void main(String args[]) {
		Cat c1 =new Cat();
		c1.legs();
		c1.eatVeg();
		Kangaroo k1=new Kangaroo();
		k1.legs();
		k1.eatVeg();
	}
}
interface  AnimalDetails {
	void legs();
	void eatVeg();
}
class Cat implements AnimalDetails{
	public void legs() {
		System.out.println("have four legs.");
	}
	public void eatVeg() {
		System.out.println("both veg and non-veg.");
	}
}
class Kangaroo implements AnimalDetails{
	public void legs() {
		System.out.println("hove two legs.");
	}
	public void eatVeg() {
		System.out.println("veg");
	}
}
