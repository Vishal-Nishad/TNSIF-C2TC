package com.daytwelve.practice;

public class ExceptionDemo {
	public static void main(String args[]) {
		int[] arr= {1,2,3};
		try {
			int a=arr[3];
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("error: "+e.getMessage());
					}
		System.out.println("hey i'll always excute.");
	}

}
