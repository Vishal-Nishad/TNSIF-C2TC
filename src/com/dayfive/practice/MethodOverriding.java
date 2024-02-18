package com.dayfive.practice;

public class MethodOverriding {
	public static void main(String args[]) {
		Cow cw=new Cow();
		cw.eat();
		
	}

}
class Animal{
	void eat() {
		System.out.println("eats anything.");
	}
}

class Cow extends Animal{
	void eat() {
		System.out.println("eats grass.");
	}
}
