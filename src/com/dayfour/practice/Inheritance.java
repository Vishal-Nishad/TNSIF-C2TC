package com.dayfour.practice;

public class Inheritance {
	public static void main(String args[]) {
		Fish whale=new Fish();
		whale.setColor("blue");
		System.out.println(whale.getColor());
		whale.swim();
		whale.setFins(6);
		System.out.println(whale.fins);
	}

}

class Animal{
	String color;
	void eat() {
		System.out.println("eats");
	}
	void setColor(String color) {
		this.color=color;
	}
	String getColor() {
		return this.color;
	}
}
class Fish extends Animal {
	int fins;
	void setFins(int fins) {
		this.fins=fins;
	}
	void swim() {
		System.out.println("swims");
	}
}