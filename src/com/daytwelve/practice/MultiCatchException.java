package com.daytwelve.practice;
import java.util.Scanner;

public class MultiCatchException {
	public static void divide() {
		int a,b,c;
		Scanner ob =new Scanner(System.in);
		System.out.println("enter number: ");
		try {
			a=ob.nextInt();
			b=ob.nextInt();
			c=a/b;
			System.out.println("result is :"+ c);
		}
		catch(ArithmeticException e){
			System.out.println("error"+e.getMessage());
		}
		catch(Exception e){
			System.out.println("error 2 "+e.getMessage());
		}
		finally {
			ob.close();
		}
	}
}
class Executo{
public static void main(String args[]) {
	MultiCatchException.divide();
}
}