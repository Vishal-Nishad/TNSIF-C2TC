package com.daytwo.practice;

public class GetAndSet {
	
		private String laptopName;
		private int laptopSerialno;
		private int laptopPrice;
		
	 
		public String getLaptopName() {
			return laptopName;
		}
		public void setLaptopName(String laptopName) {
			this.laptopName = laptopName;
		}
		public int getLaptopSerialno() {
			return laptopSerialno;
		}
		public void setLaptopSerialno(int laptopSerialno) {
			this.laptopSerialno = laptopSerialno;
		}
		public int getLaptopPrice() {
			return laptopPrice;
		}
		public void setLaptopPrice(int laptopPrice) {
			this.laptopPrice = laptopPrice;
		}
		
		public String toString() {
			return " [laptopName=" + laptopName + ", laptopSerialno=" + laptopSerialno + ", laptopPrice="
					+ laptopPrice + "]";
		}
		

	}


