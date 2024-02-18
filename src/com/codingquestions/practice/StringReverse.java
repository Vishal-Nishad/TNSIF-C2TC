package com.codingquestions.practice;

public class StringReverse {
	public static void main(String args[]) {
		
		System.out.println(rev("vishal"));
	
	}
	static String rev(String a) {
		StringBuilder ans= new StringBuilder();
			char[] chars=a.toCharArray();
			for(int i=chars.length-1;i>=0;i--) {
				ans.append(chars[i]);
			}
		
		return ans.toString();
	}
}
 	
