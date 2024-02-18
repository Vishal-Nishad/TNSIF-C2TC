package com.codingquestions.practice;

public class FibonocciSeries {
	public static void main(String args[]) {
		printFibonocciSeries(10);
	}
	static void printFibonocciSeries(int count) {
		int a=0;
		int b=1;
		int c=1;
		for(int i=1;i<=count;i++) {
			System.out.println(a+",");
			a=b;
			b=c;
			c=a+b;
		}
	}
}
