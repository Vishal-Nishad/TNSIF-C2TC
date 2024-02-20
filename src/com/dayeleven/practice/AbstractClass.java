package com.dayeleven.practice;

public class AbstractClass {
	public static void main (String args[]) {
		Horse h1=new Horse(); //constructor heirarchy Animal-> Horse
//		h1.Animal();
//		h1.walk();
	}
}

 abstract class Animal{
	 String color;
	 Animal(){
		 color="brown";
		 System.out.println("animal constructor.");
	 }
	 abstract void walk();
 }
 class Horse extends Animal{
	 Horse(){
		 color="black";
		 System.out.println("horse constructor.");
	 }
	void Animal(){
//		System.out.println(color);
		}
	void walk(){
		System.out.println("have four legs.");
	}
 }
