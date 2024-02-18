package com.dayfive.practice;

public class Polymorphism {                     // method overloading
	public static void main(String args[]) {
		Calculator calc1=new Calculator();
		System.out.println(calc1.sum(3.5f,5.5f ));
		System.out.println(calc1.sum(3, 4));
	}
}

class Calculator{
	int sum(int a,int b) {
		return a+b;
	}
	float sum(float a ,float b) {
		return a+b;
	}
	int sum(int a,int b,int c) {
		return a+b+c;
	}
}
