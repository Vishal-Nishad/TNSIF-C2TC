package com.codingquestions.practice;

public  class ZigZagConversion {
	
 static	String zigZagSolution(String s , int rowsnum) {
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<rowsnum;i++) {
			int idx=i;
			int down=2*(rowsnum-1-i);
			int up=2*i;
			boolean goingdown=true;
			while(idx<s.length()) {
				sb.append(s.charAt(idx));
				if(i==0) {
					idx+=down;
				}else if(i==rowsnum-1){
					idx+=up;
				}else {
					if(goingdown) {
						idx+=down;
					}else {
						idx+=up;
					}goingdown=!goingdown;
				}
			}
		}System.out.println(sb.toString());
		return sb.toString();
		
	}

	public static void main(String[] args) {
		
		zigZagSolution("VishalNishad",3);
		zigZagSolution("ZigZagConversion",3);
		
		

	}

}
