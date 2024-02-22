package com.daytwelve.practice;

public class CustomException {
 public static void main (String args[]) {
	 Program p1=new Program();
	 try {
		 p1.checkPostive(-5);
	 }
	 catch(WrongInputException e){
		 System.out.println("exception caught: "+e.getMessage());
	 }
 }
}
class WrongInputException extends Exception{
	WrongInputException(String msg){
		super(msg);
	}
}

class Program{
	int a ;
	void checkPostive(int a ) throws WrongInputException{
		if(a<=0) {
			throw new WrongInputException("value cannot be negative.");
		}
		else {
			System.out.println(a);
		}
	}
}
