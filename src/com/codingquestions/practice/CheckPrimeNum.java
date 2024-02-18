package com.codingquestions.practice;

public class CheckPrimeNum {
	public static void main(String args[]) {
		System.out.println(isPrim(3));
	}
	 static boolean isPrim(int a) {
	 if(a==1||a==0) {
		 return false;
	 }
	 if(a==2) {
		 return true;
	 } 
	 for(int i=2;i<=a/2;i++) {
		 if(a%i==0) {
			 return false;
		 }
	 }
	 return true;
	 }
}

