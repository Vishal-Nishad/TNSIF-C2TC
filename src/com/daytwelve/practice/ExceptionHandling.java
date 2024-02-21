package com.daytwelve.practice;

public class ExceptionHandling {
    public static void main(String args[]) {
        try {
            Division div = new Division(10, 0);
            System.out.println(div.divisonAns());
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

class Division {
    float a;
    float b;

    Division(int a, int b) {
        this.a = a;
        this.b = b;
    }

    float divisonAns() {
    	if(b==0) {
    		throw new ArithmeticException("cannot divide by zero.");
    	}
        return a / b;
    }
}

