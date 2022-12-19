package com.mrprk.debug3;

public class App {
	public static void main(String[] args) {
		int no1 = 10;
		int no2 = 20;
		no1 = no1 + 30;
		no2 = no2 + 40;
		no1 = no1 + 30;
		int sum = no1 + no2;
		System.out.println("sum is :" + sum);
	}

}
 