package com.dayeleven.practice;

public class MultipleInheritance {
	public static void main(String ars[]) {
		Bear bear=new Bear();
		bear.eats();
		
	}
}
interface Veg{
	void eats();
}
interface NonVeg{
	void eats();
}
class Bear implements Veg,NonVeg{
	public void eats() {
		System.out.println("yes bear is veg and non-veg both.");
	}
}