package com.daytwo.practice;
import java.util.Scanner;

public class GetSetDemo {

		public static void main(String[] args) {
			GetAndSet laptop1 = new GetAndSet();
			System.out.println("Please..! Enter the Laptop Details");
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the Laptop Name :- ");
			laptop1.setLaptopName(sc.nextLine());
			
			System.out.println("Enter the Serial number :- ");
			laptop1.setLaptopSerialno(sc.nextInt());
			
			System.out.println("Enter the Laptop price :- ");
			laptop1.setLaptopPrice(sc.nextInt());
			
			System.out.println("Your Laptop details are :- "+laptop1);

		}


	}

